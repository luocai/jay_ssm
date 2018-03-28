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
    <form action="edit" align = "center" method = "POST">
    	<br/>
    	<br/>
    	<div class = "row">
    		<label for="lname" class="col-xs-1 col-xs-offset-4">歌曲名称</label>
    		<div class = "col-xs-3">
        		<input type = "text" class="form-control" name = "name" id = "lname"value = "${song.name }"/> <br/>
        	</div>
        </div>
        <div class = "row">
        	<label for="lalbum" class="col-xs-1 col-xs-offset-4">所属专辑</label>
    		<div class = col-xs-3>
        		<input type = "text" class="form-control" name = "album" id = "lalbum" value = "${song.album }"/><br/>
        	</div>
        </div>
        <div class = "row">
        	<label for="ltime" class="col-xs-1 col-xs-offset-4">发行时间</label>
    		<div class = "col-xs-3">
        		<input type = "text" class="form-control" name = "time" id = "ltime" value = "${song.time }"/> <br/> 
        	</div>
        </div>
    	<input type = "hidden" name = "id" value = "${song.id }"/>
    	<br/><br/>
    	<input type = "submit" class = "btn btn-primary" align = "center" value = "更新"> 
    </form>
  </body>
</html>
