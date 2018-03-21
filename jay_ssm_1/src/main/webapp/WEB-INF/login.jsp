<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  
  <body>
  <div align="center">
  ${msg }
  </div>
   
    <form action="login" method = "POST" align = "center">
    	用户名:<input type = "text" name = "username" /> <br/>
    	密码码:<input type = "text" name = "password"/> <br/></br>
    	<input type = "submit" value = "登录" />
    	<a href="toRegister">注册</a>
    </form>
  </body>
</html>
