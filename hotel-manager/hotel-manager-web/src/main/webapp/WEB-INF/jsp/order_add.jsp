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
        
    </head>
    <body>
        
        <script type="text/javascript" src="content/settings/main.js"></script>
<link rel="stylesheet" href="content/settings/style.css" />

<%@include file="head.jsp" %>
      <!--            
              CONTENT 
                        --> 
     <div id="content" class="white">
		<form action="" method="">
		<div class="bloc">
			<div class="title">订单添加</div>
			<div class="content">
				<div class="input">
					<label for="input1">姓名</label>
					<input type="text" id="name" />
				</div>
				<div class="input">
					<label for="input2">手机/电话</label>
					<input type="text" id="phone_number" />
				</div>
				<div class="input">
					<label for="select">房间类型</label>
					<select name="user_category" id="select">
						<option value="1">First value</option>
						<option value="2">Second value</option>
						<option value="3">Third value</option>
					</select>
				</div>
				<div class="input">
					<label for="input1">房间数量</label>
					<input type="text" id="name" name="count" />
				</div>
				<div class="input">
					<label for="input1">住店时间</label>
					<input type="text" name="entry_time" />
				</div>
				<div class="input">
					<label for="input1">离店时间</label>
					<input type="text" name="leave_time" />
				</div>
				<div class="input">
					<label for="input1">天数</label>
					<span>1</span>
				</div>
				<div class="input">
					<label for="input1">总计</label>
					<span>100</span>
				</div>
				<div class="submit">
					<input type="submit" value="添加" />
					<input type="reset" value="重置" class="white"/>
				</div>
			</div>
		</div>      
		</form>
	</div>
				

	</div>
        
        
    </body>
</html>