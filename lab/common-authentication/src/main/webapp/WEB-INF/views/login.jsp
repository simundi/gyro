<%@ page import="org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter" %>
<%@ page import="org.springframework.security.core.AuthenticationException" %>
<%@ taglib prefix="authz" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<authz:authorize ifAllGranted="ROLE_USER">
  <c:redirect url="index.jsp"/>
</authz:authorize>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <link href="<c:url value="/resources/main.css"/>" rel="stylesheet" type="text/css"/>
  <title>Sample App</title>
</head>
<body>
<div id="container">

    <ul id="mainlinks">
      <li><a href="home">home</a></li>
      <li><a href="login" class="selected">login</a></li>
      <li><a href="profile">profile info</a></li>
    </ul>

  <div id="content">
    <c:if test="${!empty sessionScope.SPRING_SECURITY_LAST_EXCEPTION}">
      <h1>Woops!</h1>

      <p class="error">Your login attempt was not successful. (<%= ((AuthenticationException) session.getAttribute(AbstractAuthenticationProcessingFilter.SPRING_SECURITY_LAST_EXCEPTION_KEY)).getMessage() %>)</p>
    </c:if>
    <c:remove scope="session" var="SPRING_SECURITY_LAST_EXCEPTION"/>

      <h1>Login</h1>

      <p></p>

      <form action="<c:url value="/login.do"/>" method="post">
        <p><label>Username: <input type='text' name='j_username' value="marissa"></label></p>
        <p><label>Password: <input type='text' name='j_password' value="wombat"></label></p>
        
        <p><input name="login" value="Login" type="submit"></p>
      </form>
      
      <a href="">Google Account</a>
	  <a href="facebook">Facebook Account</a>
	  
  </div>
</div>
</body>
</html>
