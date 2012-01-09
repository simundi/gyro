package com.simundi.auth.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.consumer.OAuth2AccessTokenRequiredException;
import org.springframework.security.oauth2.consumer.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.consumer.OAuth2RestTemplate;
import org.springframework.security.oauth2.consumer.OAuth2SecurityContext;
import org.springframework.security.oauth2.consumer.OAuth2SecurityContextHolder;
import org.springframework.security.oauth2.consumer.OAuth2SecurityContextImpl;
import org.springframework.security.oauth2.consumer.token.OAuth2ClientTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ryan Heaton
 */
@Controller
@RequestMapping("facebook")
public class FacebookController {
	
	@Autowired
	private OAuth2RestTemplate oAuthRestTemplate;
	
	@Autowired
	private OAuth2ClientTokenServices oauth2TokenServices;

	@RequestMapping(method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			ObjectNode result = getoAuthRestTemplate().getForObject(
					"https://graph.facebook.com/me", ObjectNode.class);
			ArrayNode data = (ArrayNode) result.get("data");
			ArrayList<String> friends = new ArrayList<String>();
			
			return new ModelAndView("profile/view");
		} catch (HttpClientErrorException clientError) {
			if (clientError.getStatusCode().value() == 400) {
				// there are multiple reasons we could get a 400, but we're
				// going to assume the token was revoked.
				// we've got a bad token, probably because it's expired or
				// revoked.
				OAuth2ProtectedResourceDetails resource = getoAuthRestTemplate()
						.getResource();
				OAuth2SecurityContext context = OAuth2SecurityContextHolder
						.getContext();
				if (context != null) {
					// this one is kind of a hack for this application
					// the problem is that the facebook friends page doesn't
					// remove the 'code=' request parameter.
					((OAuth2SecurityContextImpl) context)
							.setVerificationCode(null);
				}
				// clear any stored access tokens...
				getOauth2TokenServices().removeToken(
						SecurityContextHolder.getContext().getAuthentication(),
						resource);
				// go get a new access token...
				throw new OAuth2AccessTokenRequiredException(resource);
			} else {
				throw clientError;
			}
		}
	}


	public OAuth2RestTemplate getoAuthRestTemplate() {
		return oAuthRestTemplate;
	}


	public void setoAuthRestTemplate(OAuth2RestTemplate oAuthRestTemplate) {
		this.oAuthRestTemplate = oAuthRestTemplate;
	}


	public OAuth2ClientTokenServices getOauth2TokenServices() {
		return oauth2TokenServices;
	}


	public void setOauth2TokenServices(OAuth2ClientTokenServices oauth2TokenServices) {
		this.oauth2TokenServices = oauth2TokenServices;
	}


}
