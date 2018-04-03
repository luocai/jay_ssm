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
  <div class = "container">
  	<div class = "row">
  		<div class = "col-md-8 col-md-offset-2">
  			<div class = "panel panel-default">
  				<div class = "panel-heading">
  					<div class = "row">
  						<h1 class = "col-md-5">周杰伦歌曲列表</h1>
  						<form action="selectByName" class = "col-md-5" style="margin:20px 0 10px 0;" id = "form1">
  							<div class = "input-group">
	  							<input type ="text" name ="name" class="form-control" placeholder = "请输入歌名"/>
	  							<span class = "input-group-addon btn" id = "search">搜索</span>
  							</div>
  						</form>
  					</div>
  				</div>
			    <table align = "center" class = "table table-bordered">
			    	<thead>
				    	<tr>
				    		<td>id</td>
				    		<td>曲名</td>
				    		<td>专辑</td>
				    		<td>发行时间</td>
				    	
				    	</tr>
			    	</thead>
			    	</tbody>
				    	<c:forEach items="${list }" var = "l" >
				    		<tr>
				    			<td>${l.id }</td>
				    			<td>${l.name }</td>
				    			<td>${l.album }</td>
				    			<td>${l.time }</td>
				    			
				    		</tr>
				    	</c:forEach>
			    	</tbody>
			    </table>
			    
			    <br/>
			    <br/>
			    <div class = "panel-footer">
				    <div class = "row">
				    	<div class = "col-md-8 col-md-offset-4">
					    	<ul class = "pagination">
						    	<li> <a href = "queryAll?currentPage=1">首页</a> </li>
						    	<!-- 当前页是1 即无上一页 -->
						    	<c:if test="${page.currentPage == 1 }">
						    		<li class="disabled"><a href = "queryAll?currentPage=${page.currentPage-1 }">&laquo;</a> </li>
						    		<c:forEach begin = "${page.start }" end = "${page.end }" step = "1" var = "i">
						    			<c:if test="${i == page.currentPage }">
						    	       <li class="active"><a href = "queryAll?currentPage=${i }">${i }</a> </li>
						    			</c:if>
						    			<c:if test="${i != page.currentPage }">
						    		   <li>	<a href = "queryAll?currentPage=${i }">${i }</a></li>
						    			</c:if>
						    		</c:forEach>
						    		<li><a href = "queryAll?currentPage=${page.currentPage+1 }">&raquo;</a></li>
						    	</c:if>
						    	<!-- 当前页是中间页 -->
						    	<c:if test="${page.currentPage > 1 && page.currentPage < page.totalPage }">
						    		<li><a href = "queryAll?currentPage=${page.currentPage-1 }">&laquo;</a> </li>
						    		<c:forEach begin = "${page.start }" end = "${page.end }" step = "1" var = "i">
						    			<c:if test="${page.currentPage == i }">
						    			<li class="active"><a href = "queryAll?currentPage=${i }">${i }</a> </li>
						    			</c:if>
						    			<c:if test="${i != page.currentPage }">
						    			<li><a href = "queryAll?currentPage=${i }">${i }</a></li>
						    			</c:if>
						    		</c:forEach>
						    		<li><a href = "queryAll?currentPage=${page.currentPage+1 }">&raquo;</a></li>
						    	</c:if>
						    	<c:if test="${page.currentPage == page.totalPage }">
						    		<li><a href = "queryAll?currentPage=${page.currentPage-1 }">&laquo;</a></li>
						    		<c:forEach begin = "${page.start }" end = "${page.end }" step = "1" var = "i">
						    			<c:if test="${page.currentPage == i }">
						    		<li class="active"><a href = "queryAll?currentPage=${i }">${i }</a> </li>
						    			</c:if>
						    			<c:if test="${i != page.currentPage }">
						    		<li><a href = "queryAll?currentPage=${i }">${i }</a></li>
						    			</c:if>
						    		</c:forEach>
						    		<li class="disabled"><a href = "queryAll?currentPage=${page.currentPage+1 }">&raquo;</a></li>
						    	</c:if>
						    <li> <a href = "queryAll?currentPage=${page.totalPage }">尾页</a> </li>
					    	</ul>
					    </div>
			    	</div>
		    	</div>
		    </div>
		   </div>
	   </div>
    </div> 
  </body>
 <script type="text/javascript">
 	$("#search").click(function(){
 		$("#form1").submit();
 	})
 </script>
  
</html>
