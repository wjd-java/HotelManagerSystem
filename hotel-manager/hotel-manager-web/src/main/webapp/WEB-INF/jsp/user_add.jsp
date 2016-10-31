<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <title>酒店管理系统</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

        
        <!-- jQuery AND jQueryUI -->
        <script type="text/javascript" src="js/libs/jquery/1.6/jquery.min.js"></script>
        <script type="text/javascript" src="js/libs/jqueryui/1.8.13/jquery-ui.min.js"></script>
        
        <!-- Compressed Version
        <link type="text/css" rel="stylesheet" href="min/b=CoreAdmin&f=css/reset.css,css/style.css,css/jqueryui/jqueryui.css,js/jwysiwyg/jquery.wysiwyg.old-school.css,js/zoombox/zoombox.css" />
        <script type="text/javascript" src="min/b=CoreAdmin/js&f=cookie/jquery.cookie.js,jwysiwyg/jquery.wysiwyg.js,tooltipsy.min.js,iphone-style-checkboxes.js,excanvas.js,zoombox/zoombox.js,visualize.jQuery.js,jquery.uniform.min.js,main.js"></script>
        -->
        <link rel="stylesheet" href="css/min.css" />
        <script type="text/javascript" src="js/min.js"></script>
        <script type="text/javascript" src="content/settings/main.js"></script>
         <script type="text/javascript" src="js/validate_useradd.js"></script>
		<link rel="stylesheet" href="content/settings/style.css" />
		
    </head>
    <body>
        

<%@include file="head.jsp" %>
                
      <!--            
              CONTENT 
                        --> 
     <div id="content" class="white">
		<form action="user_add" method="post">
		<div class="bloc">
			<div class="title">客户添加</div>
			<div class="content">
				<div class="input">
					<label for="input1">姓名</label>
					<input type="text" id="name" name="name"/>
					<span style="color:red;" id="name_val"></span>
				</div>
				<!--
				<div class="input">
					<label for="select">客人类型</label>
					<select name="user_category" id="select">
						<option value="1">First value</option>
						<option value="2">Second value</option>
						<option value="3">Third value</option>
					</select>
				</div>
				-->
				<div class="input">
					<label class="label">性别</label>
					<input type="radio" id="radio1" name="sex"  value="男" checked="checked"/><label for="radio1" class="inline">男</label> <br/>
					<input type="radio" id="radio2"  name="sex" value="女" /><label for="radio2" class="inline">女</label>
				</div>
				<div class="input">
					<label for="input2">身份证号码</label>
					<input type="text" id="id_card" name="idCard"/>
					<span style="color:red;" id="id_card_val"></span>
				</div>
				<div class="input">
					<label for="input2">手机</label>
					<input type="text" id="phone_number" name="phoneNumber"/>
					<span style="color:red;" id="phone_number_val"></span>
				</div>
				<div class="input long">
					<label for="input3">地址</label>
					<input type="text" id="address" name="address" />
					<span style="color:red;" id="address_val"></span>
				</div>
				<span style="color:red;">${user_add_error}</span><br />
				<div class="submit">
					<input type="submit" value="添加" id="submit"/>
					<input type="reset" value="重置" class="white"/>
				</div>
			</div>
		</div>      
		</form>
	</div>
				

	</div>
        
        
    </body>
</html>