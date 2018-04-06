简介
====
这是一个ssm框架简单练习项目，在实现了基本的CRUD业务的基础上，融合了shiro、bootstrap等常用技术，比较适合入门者学习

学习历程
====
* 第一版比原来增加了登录和注册功能<br/>
* 第二版增加了分页功能，并用了bootstarp进行了一点美化<br/>
* 第三版增加了shiro认证，必须登录后权限为client的用户才可以访问queryAll等界面 <br/>
* 第四版增加了全局异常处理，并且完善了系统权限（管理员账号和游客账号）

主要使用技术
====
* SSM（spring、spring MVC、mybatis）三大框架<br/>
* shiro安全框架进行登录验证<br/>
* 前端框架bootstrap<br/>

快速上手
====
* 在数据库中建立名为music的数据库，再在navicate导入运行我提供的jay_ssm.sql文件，生成相关数据源
* 修改src/main/resource中的jdbc.properties的数据库账号和密码为本机的
* 将项目添加进tomcat中，并启动服务器，运行
* 项目包结构<br/>
<div align=center> <img src="https://github.com/luocai/jay_ssm/blob/master/image/structure.png"/></div>


相关界面
===
登录界面<br/>
![Image text](https://github.com/luocai/jay_ssm/blob/master/image/login.png)

管理界面<br/>
![Image text](https://github.com/luocai/jay_ssm/blob/master/image/admin.png)

编辑界面<br/>
![Image text](https://github.com/luocai/jay_ssm/blob/master/image/edit.png)

功能介绍
====
用户登录，若为管理员账户，则进入管理员界面，可以进行对歌曲的增删改查操作，若为游客账户，则进入游客界面，只能进行查询操作
内置账户如下(1为管理员账户，0为游客账户）<br/>

<div align=center> <img src="https://github.com/luocai/jay_ssm/blob/master/image/datasource.png"/></div>



