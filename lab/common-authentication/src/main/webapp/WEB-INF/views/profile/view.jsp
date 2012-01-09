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
      <h1>Profile Info</h1>
  </div>
</div>
</body>
</html>
