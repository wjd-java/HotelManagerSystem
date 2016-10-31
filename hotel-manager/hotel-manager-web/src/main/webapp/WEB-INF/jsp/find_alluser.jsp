<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <title>Your Admin Panel</title>
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
		<link rel="stylesheet" href="content/settings/style.css" />
		<script type="text/javascript">
			$(function(){
				var data= $("#select_current").text();
				var data2 = $("#end").text();
				if(data == 1){
					$("#one").addClass("current");
				}else if(data == 2){
					$("#two").addClass("current");
				}else if(data != data2){
					$("#other").addClass("current");
				}else{
					$("#end").addClass("current");
				}
			})
		</script>
    </head>
    <body>

 		 <%@include file="head.jsp" %>
        <!--            
              CONTENT 
                        --> 
    <div id="content" class="white">
		<div class="bloc">
			<div class="title">
				所有客户
			</div>
			<div class="content">
				<table>
					<thead>
						<tr>
							<th><input type="checkbox" class="checkall"/></th>
							<th>姓名</th>
							<th>性别</th>
							<th>身份证号码</th>
							<th>地址</th>
							<th>电话</th>
							<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;操作</th>
						</tr>
					</thead>
					<tbody id="tbody">
					<c:forEach var="user" items="${result.rows}">
						<tr>
							
							<td><input type="checkbox" /></td>
							<td><a href="#">${ user.name}</a></td>
							<td><a href="#">${ user.sex}</a></td>
							<td><a href="#">${ user.idCard}</a> 
							<td><a href="#">${ user.address}</a>
							<td>${ user.phoneNumber}</td>
							<td class="actions"><a href="#" title="Edit this content"><img src="img/icons/actions/edit.png" alt="" /></a><a href="#" title="Delete this content"><img src="img/icons/actions/delete.png" alt="" /></a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
<!-- 				<div class="left input">
					<select name="action" id="tableaction">
						<option value="">Action</option>
						<option value="delete">Delete</option>
					</select>
				</div> -->
				<div class="pagination">
					<span style="display:none;" id="select_current">${result.page}</span>
					<c:if test="${result.page != 1 }">
						<a href="selectAllUser?page=${result.page-1 }&rows=4" id="prev" class="prev">«</a>
					</c:if>
					<c:if test="${result.totalPage >1}">
						<a href="selectAllUser?page=1&rows=4" id="one">1</a>
					</c:if>
					<c:if test="${result.totalPage >2}">
						<a href="selectAllUser?page=2&rows=4" id="two">2</a>
					</c:if>
					<c:if test="${result.totalPage > 3 && result.page != 3}">
					...
					</c:if>
					<c:if test="${result.page > 2 && result.page != result.totalPage}">
							<a href="selectAllUser?page=${result.page}&rows=4" id="other">${result.page}</a>
					</c:if>
					<c:if test="${result.totalPage > result.page+1 }">
						<c:if test="${result.page > 2 && result.page != result.totalPage}">
							...
						</c:if>
					</c:if>
					<a href="selectAllUser?page=${result.totalPage}&rows=4" id="end">${result.totalPage}</a>
					<c:if test="${result.page < result.totalPage}">
						<a href="selectAllUser?page=${result.page+1 }&rows=4" id="next" class="next">»</a>
					</c:if>
				</div>
			</div>
		</div>
	</div>
    </body>
</html>