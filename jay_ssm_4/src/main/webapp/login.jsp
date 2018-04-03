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
  <br/>
  <br/>
  <br/>
  <div class="container"> 
  	<div class="row">
  		<div class="col-md-4 col-md-offset-4">
			<form action="login" class="form-horizontal" method="post">
				<div class="form-group">
					<input type="text" name="username" class="form-control" placeholder="请输入用户名">
				</div>
				<div class="form-group">
					<input type="text" name="password" class="form-control" placeholder="请输入密码">
				</div>
				<div class="form-group" style="text-align:center">
					<input type = "submit" class ="btn btn-primary" value = "登录" />
						<a href="register" class="btn btn-primary">注册</a>
				</div>
			</form>
  		</div>
  	</div>
  </div>
  </body>
</html>
