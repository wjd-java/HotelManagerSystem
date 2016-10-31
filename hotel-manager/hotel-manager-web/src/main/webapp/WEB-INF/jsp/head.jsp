<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 背景设置-->
		<div class="settings" id="settings">
        <div class="wrapper">
            <div class="grid3">
                <div class="titre">Backgrounds</div>
                <a href="url(css/img/bg.html" class="backgroundChanger active" title="White"></a>
                <a href="url(css/img/dark-bg.html" class="backgroundChanger dark" title="Dark"></a>
                <a href="url(css/img/wood.html" class="backgroundChanger dark" title="Wood"></a>
                <a href="url(css/img/altbg/smoothwall.html" class="backgroundChanger" title="Smoothwall"></a>
                <a href="url(css/img/altbg/black_denim.html" class="backgroundChanger dark" title="black_denim"></a>
                <a href="url(css/img/altbg/carbon.html" class="backgroundChanger dark" title="Carbon"></a>
                <a href="url(css/img/altbg/double_lined.html" class="backgroundChanger" title="Double lined"></a>
                <div class="clear"></div>
            </div>
            <div class="grid3">
                <div class="titre">Bloc style</div>
                <a href="black.html" class="blocChanger" title="Black" style="background:url(css/img/bloctitle.png);"></a>
                <a href="white.html" class="blocChanger active" title="White" style="background:url(css/img/white-title.png);"></a>
                <a href="wood.html" class="blocChanger" title="Wood" style="background:url(css/img/wood-title.jpg);"></a>
                <div class="clear"></div>
            </div>
            <div class="grid3">
                <div class="titre">Sidebar style</div>
                <a href="grey.html" class="sidebarChanger active" title="Grey" style="background:#494949"></a>
                <a href="black.html" class="sidebarChanger" title="Black" style="background:#262626"></a>
                <a href="white.html" class="sidebarChanger" title="White" style="background:#EEEEEE"></a>
                <div class="clear"></div>
            </div>
            <div class="clear"></div>
        </div>
        <a class="settingbutton" href="#">

        </a>
    </div>  

	 <!-- 网页头部-->
	<div id="head">
		<div class="left">
			<a href="#" class="button profile"><img src="img/icons/top/huser.png" alt="" /></a>
			<c:if test="${empty admin_account}">
				<script type="text/javascript">
				window.location.href="/"; 
				</script>
			</c:if>
			<c:if test="${not empty admin_account}">
			你好, 
			<a href="#">${admin_account}</a>
			</c:if>
			|
			<a href="sign_out">退出</a>
		</div>
		<div class="right">
			<form action="#" id="search" class="search placeholder">
				<label>Looking for something ?</label>
				<input type="text" value="" name="q" class="text"/>
				<input type="submit" value="rechercher" class="submit"/>
			</form>
		</div>
	</div>
	 <!--侧栏-->
	<div id="sidebar">
		<ul>
			<li>
				<a href="index.html">
					<img src="img/icons/menu/inbox.png" alt="" />
					首页
				</a>
			</li>
			<li class="current"><a href="#"><img src="img/icons/menu/layout.png" alt="" /> 客户</a>
				<ul>
											<li class="current"><a href="user_add">添加</a></li>
											<li><a href="selectAllUser?page=1&rows=4">全部查询</a></li>
											<li><a href="find_inhotel">在店查询</a></li>
											<!--<li><a href="notifications.html?p=notif">Notifications</a></li>
											<li><a href="charts.html?p=charts">Charts</a></li>
											<li><a href="typography.html?p=typo">Typography</a></li>
											<li><a href="icons.html?p=icons">Icons</a></li>
											<li><a href="calendar.html?p=calendar">Calendar</a></li>-->
										</ul>
			</li>
			<li class="current"><a href="#"><img src="img/icons/menu/brush.png" alt="" />客房</a>
				<ul>
					<c:if test="${permissions == '管理员' }" >
					<li><a href="room_add.html">添加</a></li>
					</c:if>
					<li><a href="#">查看</a></li>
					<li><a href="#">修改</a></li>
					<li><a href="#">删除</a></li>
				</ul>
			</li>
			<li class="current"><a href="#"><img src="img/icons/menu/brush.png" alt="" />预订</a>
				<ul>
					<li><a href="order_add.html">添加</a></li>
					<li><a href="#">查看</a></li>
					<li><a href="#">修改</a></li>
					<li><a href="#">删除</a></li>
				</ul>
			</li>
			<li class="current"><a href="#"><img src="img/icons/menu/lab.png" alt="" /> 住宿登记</a>
				<ul>
					<li><a href="#">添加</a></li>
					<li><a href="#">查看</a></li>
					<li><a href="#">修改</a></li>
					<li><a href="#">删除</a></li>
				</ul>
			</li>
			<li class="nosubmenu"><a href="modal.html" class="zoombox w450 h700"><img src="img/icons/menu/comment.png" alt="" />退房</a></li>
		</ul>
	</div>
