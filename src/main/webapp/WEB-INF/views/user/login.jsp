<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<script src="/resources/js/user/login.js"></script>
		<c:import url="/WEB-INF/views/layout/header.jsp" charEncoding="UTF-8">
			<c:param name="title" value="로그인"></c:param>
		</c:import>
		<style type="text/css">
		.divider:after,
		.divider:before {
			content: "";
			flex: 1;
			height: 1px;
			background: #eee;
		}
		
		</style>
	</head>
	<body class="sb-nav-fixed">
    	<%-- top nav --%>
		<c:import url="/WEB-INF/views/layout/bodyNavbar.jsp">
			<c:param name="menu" value="true"></c:param>
		</c:import>
		<div id="layoutSidenav">
            <div id="layoutSidenav_content">
            	<main>
            	
				<%-- login --%>
				<section class="vh-100">
				  <div class="container py-5 h-100">
				    <div class="row d-flex align-items-center h-100">
				      <div class="col-md-8 col-lg-7 col-xl-6">
				        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
				          class="img-fluid" alt="Phone image">
				      </div>
				      <div class="col-md-7 col-lg-5 col-xl-5">
				      <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Login</p>
				        <form>
				          <!-- Email input -->
				          <div class="form-outline mb-4">
				            <input type="email" id="id" class="form-control form-control-lg" />
				            <label class="form-label" for="form1Example13">ID</label>
				          </div>
				
				          <!-- Password input -->
				          <div class="form-outline mb-4">
				            <input type="password" id="password" class="form-control form-control-lg" autocomplete="off"/><!-- autocomplete : 비밀번호 자동완성 off -->
				            <label class="form-label" for="form1Example23">Password</label>
				          </div>
				
				          <div class="d-flex justify-content-around align-items-center mb-4">
				            <!-- Checkbox -->
				            <div class="form-check">
				              <input class="form-check-input" type="checkbox" value="" id="form1Example3" checked />
				              <label class="form-check-label" for="form1Example3"> Remember me </label>
				            </div>
				            <a href="#!">Forgot password?</a>
				          </div>
				
				          <!-- Submit button -->
				          <button type="button" class="btn btn-primary btn-lg btn-block" onclick="loginCh()">Sign in</button>
				
<!-- 				          <div class="divider d-flex align-items-center my-4">
				            <p class="text-center fw-bold mx-3 mb-0 text-muted">OR</p>
				          </div>
				
				          <a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998" href="#!"
				            role="button">
				            <i class="fab fa-facebook-f me-2"></i>Continue with Facebook
				          </a>
				          <a class="btn btn-primary btn-lg btn-block" style="background-color: #55acee" href="#!"
				            role="button">
				            <i class="fab fa-twitter me-2"></i>Continue with Twitter</a> -->
				
				        </form>
				      </div>
				    </div>
				  </div>
				</section>
				<%-- login --%>
            	</main>
            </div>
		</div>
	</body>
</html>
