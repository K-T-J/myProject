<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>비밀번호 수정</title>
		<link rel="icon" href="/resources/img/icon/favicon.ico"/>
		<%-- user 로그인,회원가입,아이디/비번 찾기 폼 userStyle.css --%>
		<link rel="stylesheet" type="text/css" href="/resources/css/petBill/petBill_userStyle.css" />
		<!-- footer css 태준(09/29)-->
		<link href="/resources/css/petBill/petBill_footer.css" rel="stylesheet" type="text/css">
		<!--1. 부트스트랩 css 사용 -->
	    <link href="/resources/css/petBill/petBill_styles.css" rel="stylesheet" type="text/css">
	    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	</head>
	<script type="text/javascript">
		function pwModify(){
			if(validation()){
 				$.ajax({
					url : "/petBill/user/pwCheck",
					method : "post",
					data : {pw : $("#pw").val()},
					success : function(result){
						if(result == "Y"){
							pwModiFyPro();
						}else{
							alert("기존 비밀번호가 다릅니다");
							$("#pw").val("");
							$("#newPw").val("");
							$("#newPwCh").val("");
						}
					},
					error : function(error){
						console.log("error >> " , error);
					}
				})
			}
		}
		function pwModiFyPro(){
			$.ajax({
				url : "/petBill/user/pwModiFyPro",
				method : "post",
				data : { 
					pw : $("#pw").val(),
					newPw : $("#newPw").val() 
				},
				success : function(result){
					if(result === "Y"){
						alert("비밀번호가 변경되었습니다");
						location.replace("/petBill/user/userModifyForm");
					}else{
						alert("변경 실패 했습니다");
						$("#pw").val("");
						$("#newPw").val("");
						$("#newPwCh").val("");
					}
				},
				error : function(error){
					console.log("error >> " + error);
				}
			})
		}
	
		function validation(){
			if($('#pw').val().trim().length === 0){
				alert("기존 비밀번호를 입력해주세요");
				return false
			}
			if($('#newPw').val().trim().length === 0){
				alert("수정 비밀번호를 입력해주세요");
				return false
			}
			if($('#newPwCh').val().trim().length === 0){
				alert("비밀번호 체크를 입력해주세요");
				return false
			}
			if($('#newPw').val() !== $('#newPwCh').val()){
				alert("비밀번호가 서로 다릅니다");
				$("#newPw").val("");
				$("#newPwCh").val("");
				return false
			}
			return true
		}
	
	</script>
	<body>
	
		<section>
	        <div class="color"></div>
	        <div></div>
	        <div class="color"></div>
	        <div class="box">
	            <div class="con">
	                <div class="form">
	                    <h2>비밀번호 수정</h2>
	                    <form>
	                        <div class="inputBox">
	                       		기존 비밀번호
	                            <input type="password" id="pw" name="pw" required="required"/>
	                        </div>
	                        <div class="inputBox">
	                        	수정 비밀번호
	                            <input type="password" id="newPw" name="newPw" required="required"/>
	                        </div>
	                        <div class="inputBox">
	                        	수정 비밀번호 확인
	                            <input type="password" id="newPwCh" name="newPwCh" required="required"/>
	                        </div>
	                        <br />
	                        <div align="center">
	                            <button type="button" class="button" onclick="pwModify()">수정</button>
	                            <button 
										class="btn-cancel"type="button"
		                            	onclick="window.location='/petBill/user/userModifyForm'">취소
		                       	</button>
	                        </div> 
	                    </form>
	                </div>
	            </div>
	        </div>
    	</section>
	<!-- footer -->
	<footer class="footer">
		<div class="container bottom_border">
			<div class="row">
				<div class=" col-sm-4 col-md col-sm-4  col-12 col">
					<h1 class="headin5_amrc col_white_amrc pt2">🚑𝖕𝖊𝖙𝕭𝖎𝖑𝖑</h1>
				</div>
				
				<div class=" col-sm-4 col-md col-sm-4  col-12 col">
					<h5 class="headin5_amrc col_white_amrc pt2">🐕Bootstrap</h5>
					<!--headin5_amrc-->
					<p class="mb10">http://bootstrapk.com</p>
				</div>
				
				<div class=" col-sm-4 col-md col-sm-4  col-12 col">
					<h5 class="headin5_amrc col_white_amrc pt2">🐈Naver</h5>
					<!--headin5_amrc-->
					<p class="mb10">https://developers.naver.com/main</p>
				</div>
				
				<div class=" col-sm-4 col-md col-sm-4  col-12 col">
					<h5 class="headin5_amrc col_white_amrc pt2">🦮Kakao</h5>
					<!--headin5_amrc-->
					<p class="mb10">https://tableblog.tistory.com/117</p>
					<p class="mb10">https://developers.kakao.com/</p>
				</div>
				
				<div class=" col-sm-4 col-md col-sm-4  col-12 col">
					<h5 class="headin5_amrc col_white_amrc pt2">🐕‍🦺‍Chartjs</h5>
					<!--headin5_amrc-->
				<p class="mb10">https://www.chartjs.org/</p>
				</div>
			</div>
		</div>
		
		<div class="container">
			<ul class="foote_bottom_ul_amrc">
				<li>👨‍⚕️이건우</li>
				<li>👩‍⚕️안혜란</li>
				<li>👨‍⚕️김태준</li>
				<li>👩‍⚕️정샛별</li>
				<li>👨‍⚕️이용훈</li>
			</ul>
		</div>
	</footer> 	
	 	 
	</body>
</html>