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
    <form action="add" align = "center">
    	<br/>
    	<br/>
    	<div class = "container">
	    	<div class = "row" >
	    		<div class = "col-xs-4 col-xs-offset-4">
	    			<input type = "text" class = "form-control" placeholder="歌曲名称" name = "name"/> 
	    		</div>
	    	</div>
	    	<br/>
	    	<div class = "row">
	    		<div class = "col-xs-4 col-xs-offset-4">
	    			<input type = "text" class = "form-control" placeholder="所属专辑" name = "album"/>
	    		</div>
	    	</div>
	    	<br/>
	    	<div class = "row">
	    		<div class = "col-xs-4 col-xs-offset-4">
	    			<input type = "text" class = "form-control" placeholder="发布时间" name = "time"/> 
	    		</div>
	    	</div>
    	</div>
    	<br/>
    	<input type = "submit" class = "btn btn-deafult" value = "提交"/>
    </form>
  </body>
</html>
