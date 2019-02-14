<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link href="/resources/css/detail.css" rel="stylesheet">
<title>상세보기</title>
</head>
<body>
	<div id="wapper">
		<div id="content">
			<table class="table table-striped">
				<tr>
					<td>${rvo.name }</td>
				</tr>
			</table>
		
		<div>
			<input type="text"><input type="button" class="form-controller" value="댓글작성">
		</div>
		</div>
	</div>
</body>
</html>