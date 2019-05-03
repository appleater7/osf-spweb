<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>로그인 화면</title>
<!-- Bootstrap core CSS -->
<link href="/resources/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/resources/signin.css" rel="stylesheet">
</head>
<script>
	window.addEventListener('load', function() {
		document.querySelector('#signinBtn').onclick = function() {
			var idObj = document.querySelector('#id');
			var pwdObj = document.querySelector('#pwd');
			var pwdCheckObj = document.querySelector('#pwdCheck');
			var enameObj = document.querySelector('#ename');
			var jobObj = document.querySelector('#job');
			var deptnoObj = document.querySelector('#deptno');
			if (idObj.value.trim().length < 4) {
				alert('ID 는 4글자 이상입니다.');
				return;
			}
			if (pwdObj.value.trim().length < 6) {
				alert('PWD 는 6글자 이상입니다.');
				return;
			}
			if (pwdObj.value!==pwdCheckObj.value){
				alert('PWD 를 다시 확인해주세요.');
				return;
			}
			if (enameObj.value.trim().length < 1) {
				alert('이름을 입력해 주세요.');
				return;
			}
			if (jobObj.value.trim().length < 1) {
				alert('직급을 입력해 주세요.');
				return;
			}
			if (deptnoObj.value==="") {
				alert('부서를 선택하여 주세요.');
				return;
			}
			console.log(deptnoObj);
			var xhr = new XMLHttpRequest();
			xhr.open('POST', '/emp/join');
			xhr.setRequestHeader('content-type',
					'application/x-www-form-urlencoded');
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4) {
					var obj = JSON.parse(xhr.response);
					if (obj.result === 'false') {
						alert('아이디가 잘못되었습니다.');
						idObj.value = '';
						pwdObj.value = '';
						idObj.focus();
					} else {
						location.href = "/uri/index";
					}
				}
			}
			var param = 'id=' + idObj.value + '&pwd=' + pwdObj.value+ '&ename=' + enameObj.value + 
			'&job=' + jobObj.value +'&deptno=' + deptnoObj.value ;
			xhr.send(param);
		}
	});
</script>
<body class="text-center">
	<form class="form-signin" action="/emp/join" method="post">
		<img class="mb-4" src="/resources/bootstrap-solid.svg" alt=""
			width="72" height="72">
		<h1 class="h3 mb-3 font-weight-normal">Please Join</h1>
		<input type="text" id="id" class="form-control" placeholder="ID" required autofocus name="id">
		<input type="password" id="pwd"	class="form-control" placeholder="Password" required name="pwd">
		<input type="password" id="pwdCheck" class="form-control" placeholder="CheakPwd" required  name="password"> 
		<input type="text" id="ename" class="form-control" placeholder="Name" required name="ename">
		<input type="text" id="job" class="form-control" placeholder="Job" required  name="job"> 
		<select id="deptno" name="deptno" class="form-control">
			<option value="" disabled selected>Select your Dept</option>
			<c:forEach items="${deptList}" var="dept">
				<option value="${dept.DEPTNO}">${dept.DNAME}</option>
			</c:forEach>
		</select>
		<button class="btn btn-lg btn-primary btn-block" type="button" id="signinBtn">Join</button>
		<p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
	</form>
</body>
</html>
