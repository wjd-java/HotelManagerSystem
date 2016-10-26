<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta charset="utf-8">
        <title>登录</title>

        <!-- CSS -->
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
		<!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>
    </head>

    <body>

        <div class="page-container">
            <h1>登录</h1>
            <form action="login" method="post">
                <input type="text" name="username" class="username" placeholder="账号">
                <input type="password" name="password" class="password" placeholder="密码"><span style="margin-left:5px;margin-top:18px;float:left;">${error }</span>
                <button type="submit">提交</button>
                <div class="error"><span>+</span></div>
            </form>
        </div>
    </body>

</html>


