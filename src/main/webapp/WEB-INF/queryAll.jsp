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
    <table align = "center" class = "table">
    	<tr>
    		<td>id</td>
    		<td>曲名</td>
    		<td>专辑</td>
    		<td>发行时间</td>
    		<td>操作</td>
    		<td>操作</td>
    	</tr>
    	<c:forEach items="${list }" var = "l" >
    		<tr>
    			<td>${l.id }</td>
    			<td>${l.name }</td>
    			<td>${l.album }</td>
    			<td>${l.time }</td>
    			<td>
	    			 <a class="btn btn-danger" href="delete?id=${l.id }" role="button">
	    				 <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 删除
	    			 </a>
    			</td>
    			<td>
	    			<a class="btn btn-danger" href = "toEdit?id=${l.id }" role = "button">
	    				<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 编辑
	    			</a>
    			</td>
    		</tr>
    	</c:forEach>
    </table>
    
    <br/>
    <br/>
    
    <div align = "center">
    	<a class="btn btn-primary" href = "toAdd" role = "button">
    	<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 新增歌曲
    	</a>
    </div>   
  </body>
  
</html>
