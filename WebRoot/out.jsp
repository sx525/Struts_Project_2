<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body>
<pre>

1：jstl与el表达式

username = ${username}

userBean.username = ${userBean.username}

userBean.password = ${userBean.password}

userBean.gender = ${userBean.gender}

userBean.like = ${userBean.like}

userList

<c:forEach items="${userList}" var="userBean">

${userBean.username}   ${userBean.password}   ${userBean.gender}   ${userBean.like}

=======================================================
</c:forEach>
	
	
2：采用Struts标签与OGNL表达式。

username = <s:property value="username"/>


userBean.username = <s:property value="userBean.username"/>

userBean.password = <s:property value="userBean.password"/>

userBean.gender = <s:property value="userBean.gender"/>

userBean.like = <s:property value="userBean.like"/>
</pre>
  </body>
</html>
