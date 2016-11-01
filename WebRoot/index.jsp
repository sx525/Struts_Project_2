<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<pre>rn
1：Servlet与Action
	<a href="<%=path%>/servlet/TestServlet.svr">1：Servlet在Struts工程中的访问</a>
	
	
	<a href="<%=path%>/servlet/TestServlet_2">2：Servlet在Struts工程中的访问</a>
	
	
2：Struts中Action的类型

	<a href="<%=path%>/type/actiontype_One">Action类型_1</a>
	
	<a href="<%=path%>/type/actiontype_Two">Action类型_2</a>
	
	<a href="<%=path%>/type/actiontype_Three">Action类型_3(开发中常用)</a>
	
3：访问Action中的其他方法（3种方式）
	
	Action中默认的方法是execute(),Struts允许我们访问Action中其他的方法。
	
	1：使用method属性来调用方法
	
		<a href="<%=path%>/method/actionMethod_One_List">读取</a>
		
		<a href="<%=path%>/method/actionMethod_One_Add">添加</a>
		
		<a href="<%=path%>/method/actionMethod_One_Edit">修改</a>
		
		<a href="<%=path%>/method/actionMethod_One_Delete">删除</a>
	
	2：使用动态调用来调用方法(开发常用)
		
		注意点：开启struts.enable.DynamicMethodInvocation这个常量。
		
		调用方式：action名称！方法名
	
		<a href="<%=path%>/method/actionMethod_Two!list">读取</a>
		
		<a href="<%=path%>/method/actionMethod_Two!add">添加</a>
		
		<a href="<%=path%>/method/actionMethod_Two!edit">修改</a>
		
		<a href="<%=path%>/method/actionMethod_Two!delete">删除</a>	
	
	3：使用通配符来调用方法
	
		对第一种方法的简化。通过请求的地址与Struts.xml定义Action名称进行
		
		通配的比较。符合通配，再使用通配索引来设定到mehtod属性中。

		<a href="<%=path%>/method/actionMethod_Three_list">读取</a>
		
		<a href="<%=path%>/method/actionMethod_Three_add">添加</a>
		
		<a href="<%=path%>/method/actionMethod_Three_edit">修改</a>
		
		<a href="<%=path%>/method/actionMethod_Three_delete">删除</a>	
		
4：Struts中如何获取Servlet的原生对象，

	<a href="<%=path%>/servletobj/servletObj_One">1：调用ServletActionContext对象的静态方法。</a>
	
	<a href="<%=path%>/servletobj/servletObj_Two">2：调用Struts中拦截器的功能来将Servlet对象进行注入。</a>

		
5：封装基类的Action公用类。

6：如何在Struts获取Request中的请求参数。

	1：使用Servlet的Request对象。
	<form action="<%=path%>/param/paramAction_One!requestObj" method="post">
		
		用户名：<input type="text" name="username"/>
		
		密码： <input type="text" name="password"/>
		
		性别：<input type="radio" name="gender" value="男"/>男<input type="radio" name="gender" value="女"/>女
		
		<Input type="submit" value="提交数据"/>
	</form>	
	2：使用Strust中的属性驱动来获取
	
		获取原则：Action中属性的名称与表单控件的名称一致。Struts中即可获取值。

		<form action="<%=path%>/param/paramAction_One!modelObj" method="post">
			
			用户名：<input type="text" name="username"/>
			
			密码： <input type="text" name="password"/>
			
			性别：<input type="radio" name="gender" value="男"/>男<input type="radio" name="gender" value="女"/>女
			
			爱好：<input type="checkbox" name="like" value="爱好1"/>爱好1
			
				<input type="checkbox" name="like" value="爱好2"/>爱好2
				
				<input type="checkbox" name="like" value="爱好3"/>爱好3
				
				<input type="checkbox" name="like" value="爱好4"/>爱好4
				
			<Input type="submit" value="提交数据"/>
		</form>
	
	
		获取原则：表单控件的名称(action中Bean属性的名称.Bean中属性的名称)。Struts中就可以将控件的值赋到Bean属性中。

		<form action="<%=path%>/param/paramAction_One!modelObj_Bean" method="post">
			
			用户名：<input type="text" name="userBean.username"/>
			
			密码： <input type="text" name="userBean.password"/>
			
			性别：<input type="radio" name="userBean.gender" value="男"/>男<input type="radio" name="userBean.gender" value="女"/>女
			
			爱好：<input type="checkbox" name="userBean.like" value="爱好1"/>爱好1
			
				<input type="checkbox" name="userBean.like" value="爱好2"/>爱好2
				
				<input type="checkbox" name="userBean.like" value="爱好3"/>爱好3
				
				<input type="checkbox" name="userBean.like" value="爱好4"/>爱好4
				
			<Input type="submit" value="提交数据"/>
		</form>	
	
	3：使用Struts中的模型驱动来获取.
	
		获取原则：控件的名称与Action中指定的数据模型的属性名称相同，即在在Action中获取值。
	
		<form action="<%=path%>/param/paramAction_Two" method="post">
			
			用户名：<input type="text" name="username"/>
			
			密码： <input type="text" name="password"/>
			
			性别：<input type="radio" name="gender" value="男"/>男<input type="radio" name="gender" value="女"/>女
			
			爱好：<input type="checkbox" name="like" value="爱好1"/>爱好1
			
				<input type="checkbox" name="like" value="爱好2"/>爱好2
				
				<input type="checkbox" name="like" value="爱好3"/>爱好3
				
				<input type="checkbox" name="like" value="爱好4"/>爱好4
				
			<Input type="submit" value="提交数据"/>
		</form>	
		
7：如何在Struts输出Response结果。
	
	<a href="<%=path%>/response/responseAction">1：使用jstl+EL表达式</a>
	
	2：使用Struts标签+OGNL表达式。
	
</pre>
  </body>
</html>
