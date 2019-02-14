<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/main.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<title>서울 전통식당</title>
</head>
<body>
	<div id="wapper">
		<header>
			<div id="logo">
				<img alt="logo" src="/resources/images/logo.png">
			</div>
			<div>
				<strong>검색</strong><input type="text" id="searchKey"
					name="searchKey">
				<button id="searchBtn" name="searchBtn">검색</button>
			</div>
		</header>
		<aside>
			<ul>
				<li>음식점
				<li>서울호텔
				<li>음식점
				<li>음식점
			</ul>

		</aside>
		<div id="content" class="row">
			<table class="table table-striped">
				<thead>
					<tr>
						<td>카테고리1</td>
						<td>카테고리2</td>
						<td>식당명</td>
						<td>도시</td>
						<td>구</td>
						<td>동</td>
					</tr>
				</thead>
				<tbody>

					<c:choose>
						<c:when test="${not empty list }">
							<c:forEach items="${list }" var="rest">
								<tr>
									<td>${rest.category1}</td>
									<td>${rest.category2}</td>
									<td><a href="/restaurant/detail?no=${rest.no }">${rest.name}</a></td>
									<td>${rest.city}</td>
									<td>${rest.region}</td>
									<td>${rest.district}</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="5">등록된 매장이 없습니다.</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
		</div>
	</div>
	<footer>
		<p>개발자:김희강
	</footer>
</body>
</html>