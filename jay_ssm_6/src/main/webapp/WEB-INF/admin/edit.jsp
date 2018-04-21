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
  	<br>
  	<div class="container">
  		<div class = "row">
  			<div class = "col-md-8 col-md-offset-2">
  				<div class="panel panel-default">
  					<div class = "panel-heading">
  						<div class = "row">
  							<h1>修改歌曲信息</h1>
  						</div>
  					</div>
  					<div class = "panel-body">
  						<form action="edit" class="form-horizontal" method="post">
  							<input type="hidden" name="id" value="${song.id }">
  							<div class="form-group">
  								<label for="name" class = "col-sm-2 control-lable">歌曲名称</label>
  								<div class = "col-sm-8">
  									<input type="text" name="name" id="name" class="form-control" value="${song.name }">
  								</div>
  							</div>
  							<div class="form-group">
  								<label for="album" class = "col-sm-2 control-lable">所属专辑</label>
  								<div class = "col-sm-8">
  									<input type="text" name="album" id="album" class="form-control" value="${song.album }">
  								</div>
  							</div>
  							<div class="form-group">
  								<label for="time" class = "col-sm-2 control-lable">发行时间</label>
  								<div class = "col-sm-8">
  									<input type="text" name="time" id="time" class="form-control" value="${song.time }">
  								</div>
  							</div>
  							<div class="form-group" style="text-align:center">
  								<input class="btn btn-primary" type="submit" onclick="return change()"value="提交">
  							</div>
  						</form>
  					</div>
  					<div class="panel-footer">
  						<br/>
  						<br/>
  					</div>
  				</div>
  			</div>
  		</div>
  	</div>
  </body>
<script type="text/javascript">
	
	function change(){
		message = confirm("您确定要保存修改吗？");
		if (message == true){
			alert("修改成功!");
		}else{
			return false;
		}
	}
</script>
</html>
