<%@ page import="org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter" %>
<%@ page import="org.springframework.security.core.AuthenticationException" %>

<%@taglib uri="http://www.springframework.org/security/tags" prefix="authz"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

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

<spring:url value="login"/>
<div id="container">

    <ul id="mainlinks">
      <li><a href="home" class="selected">home</a></li>
      <li><a href="login">login</a></li>
      <li><a href="profile">profile info</a></li>
    </ul>

  <div id="content">
    Welcome Mr/Mrs: {your name here}
  </div>
</div>
</body>
</html>
