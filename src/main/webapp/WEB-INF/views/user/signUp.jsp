<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
	<head>
		<script src="/resources/js/user/signUp.js"></script>
		<c:import url="/WEB-INF/views/layout/header.jsp" charEncoding="UTF-8">
			<c:param name="title" value="회원가입"></c:param>
		</c:import>
	</head>
	<body class="sb-nav-fixed">
	    	<%-- top nav --%>
			<c:import url="/WEB-INF/views/layout/bodyNavbar.jsp">
				<c:param name="menu" value="${ menu }"></c:param>
			</c:import>
			<div id="layoutSidenav">
	            <div id="layoutSidenav_content">
	            	<main>
	            		<%-- sign up form --%>
						<section class="vh-100" style="background-color: #fff;">
						  <div class="container h-100">
						    <div class="row d-flex justify-content-center align-items-center h-100">
						      <div class="col-lg-12 col-xl-11">
						        <div class="text-black" style="border-radius: 25px;">
						          <div class="card-body p-md-5">
						            <div class="row justify-content-center">
						              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
						
						                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>
						
						                <form class="mx-1 mx-md-4" id="signupForm" name="signupForm" method="post">
						
						                  <div class="d-flex flex-row align-items-center mb-4">
						                    <i class="fas fa-user fa-lg me-3 fa-fw mb-4"></i>
						                    <div class="form-outline flex-fill mb-0 ">
						                      <input type="text" id="id" name="id" class="form-control" maxlength="20"/>
						                      <label class="form-label" for="form3Example1c">Your ID</label>
						                    </div>
						                  </div>
						
						                  <div class="d-flex flex-row align-items-center mb-4">
						                    <i class="fas fa-envelope fa-lg me-3 fa-fw mb-4"></i>
						                    <div class="form-outline flex-fill mb-0">
						                      <input type="email" id="email" name="email" class="form-control" />
						                      <label class="form-label" for="form3Example3c">Your Email</label>
						                    </div>
						                  </div>
						
						                  <div class="d-flex flex-row align-items-center mb-4">
						                    <i class="fas fa-lock fa-lg me-3 fa-fw mb-4"></i>
						                    <div class="form-outline flex-fill mb-0">
						                      <input type="password" id="password" name="password" class="form-control" maxlength="13"/>
						                      <label class="form-label" for="form3Example4c">Password</label>
						                    </div>
						                  </div>
						
						                  <div class="d-flex flex-row align-items-center mb-4">
						                    <i class="fas fa-key fa-lg me-3 fa-fw mb-4"></i>
						                    <div class="form-outline flex-fill mb-0">
						                      <input type="password" id="passwordCh" name="passwordCh" class="form-control" maxlength="13"/>
						                      <label class="form-label" for="form3Example4cd">Repeat your password</label>
						                    </div>
						                  </div>
						
						                  <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
						                    <button type="button" class="btn btn-primary btn-lg" onclick="loginCheck()">Register</button>
						                  </div>
						
						                </form>
						
						              </div>
						              <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
						
						                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
						                  class="img-fluid" alt="Sample image">
						
						              </div>
						            </div>
						          </div>
						        </div>
						      </div>
						    </div>
						  </div>
						</section>
	            		<%-- sign up form --%>
	            	</main>
	            
	            
	            </div>
            </div>
           
	</body>
</html>