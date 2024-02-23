<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
    <head>
		<c:import url="/WEB-INF/views/layout/header.jsp" charEncoding="UTF-8">
			<c:param name="title" value="D&F메인"></c:param>
		</c:import>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <link href="/resources/css/df/styles.css" rel="stylesheet" />
    </head>
<body>
	<!-- Header-->
	<header class="bg-dark py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder">던인포</h1>
			</div>
		</div>
	</header>
	<!-- Section-->
	<section class="py-5" style="min-height: 1000px;">
		<div class="form-group row">
			<div class="d-flex justify-content-center mt-5 mb-5" >
				<div class="align-self-center" style="margin-right: 10px;">
					<select class="form-select" id="srchSelect">
						<option value="all">캐릭터 검색</option>
						<c:forEach var="serverItem" items="${serverId.rows}" >
						<option value="${serverItem.serverId}"> ${serverItem.serverName} </option>	                        
						</c:forEach>                        	
					</select>
				</div>
				<div class="align-self-center mr-3" style="width: 800px; margin-right: 3px;">
					<input class="form-control" type="text" id="characterName" placeholder="캐릭터명" aria-label="Search" onkeypress="if( event.keyCode == 13 ){btnSearch();}">
				</div>
				<div class="align-self-center">
					<button class="btn btn-outline-success" type="button" onclick="btnSearch();">Search</button>
				</div>
			</div>
		</div>        
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center" id="containerDiv">
			</div>
		</div>
	</section>	
	<!-- Footer-->
	<footer class="py-5 mt-auto bg-dark" >
	    <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p></div>
	</footer>
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="/resources/js/df/main/scripts.js"></script>	
</body>
</html>