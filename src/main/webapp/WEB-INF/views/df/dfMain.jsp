<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
    <head>
		<c:import url="/WEB-INF/views/layout/header.jsp" charEncoding="UTF-8">
			<c:param name="title" value="D&F메인"></c:param>
		</c:import>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <link href="/resources/css/df/styles.css" rel="stylesheet" />
    </head>
    <body>
        <!-- Navigation-->
        <!-- 
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="#!">Start Bootstrap</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="#!">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">About</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#!">All Products</a></li>
                                <li><hr class="dropdown-divider" /></li>
                                <li><a class="dropdown-item" href="#!">Popular Items</a></li>
                                <li><a class="dropdown-item" href="#!">New Arrivals</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
         -->
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
        
		<div id="tempCard"  style="display: none;">
			<div class="col mb-5">
				<div class="card h-100 characterInfoCard" onclick="test();" style="cursor : pointer;">
					<!-- Product image-->
					<img class="card-img-top characterImg" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."  style=""/>
					<!-- Product details-->
					<div class="card-body p-4">
						<div class="text-center">
							<P class="level">$40.00 - $80.00</P>
							<!-- Product name-->
							<h5 class="fw-bolder characterName">Fancy Product</h5>
							<!-- Product price-->
							<P class="jobGrowNameAndServerId">$40.00 - $80.00</P>
							<p class="fame"></p>
						</div>
					</div>
					<!-- Product actions-->
			<!-- 		<div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
						<div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
					</div> -->
				</div>
			</div>        
		</div>
        
        <!-- Footer-->
        <footer class="py-5 mt-auto bg-dark" >
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="/resources/js/df/main/scripts.js"></script>
        <script src="/resources/js/df/main/dfMain.js"></script>
    </body>
</html>
