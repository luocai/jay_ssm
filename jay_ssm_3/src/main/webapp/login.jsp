<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath()); /*根路径  */
%>
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-2.1.1.min.js"></script>
<link rel="stylesheet"
	href="${APP_PATH }/static/bootstrap/css/bootstrap.min.css">
<script src="${APP_PATH }/static/bootstrap/js/bootstrap.min.js"></script>
 

  
  <body>
   
    <form action="login" method = "POST" align = "center">
    	<div class = "row">
    		<div class = "col-xs-4 col-xs-offset-4">
    			<input type = "text" class="form-control" placeholder="用户名" name = "username" /> <br/>
    		</div>
    	</div>
    	<div class = "row">
    		<div class = "col-xs-4 col-xs-offset-4">
    			<input type = "password" class="form-control" placeholder="密码" name = "password"/> <br/></br>
    		</div>
    	</div>
    	<input type = "submit" class ="btn btn-primary" value = "登录" />
    	<a href="register" class="btn btn-primary">注册</a>
    </form>
  </body>
</html>
