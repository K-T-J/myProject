<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인</title>
		</head>
		
		<%-- user 로그인,회원가입,아이디/비번 찾기 폼 userStyle.css --%>
		<link rel="stylesheet" type="text/css" href="/resources/css/petBill/petBill_userStyle.css" />
		<link rel="icon" href="/resources/img/icon/favicon.ico"/>
		<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
		<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
		

		<script>
			//Kakao.init("5acd7d0abad958ae8f6e5399abee0118");
			//console.log(Kakao.isInitialized());//SDK 초기화 여부 판단 잘되었다면 true
			//console.log("SDK 초기화 됐다!");
			
		
			function kakaoLogin() {//로그인 버튼 누르면 실행~
				Kakao.Auth.loginForm({
					success: function (response) {
						Kakao.API.request({
							url: '/v2/user/me',
							success: function (response) {
								kakaoLoginPro(response)//성공했으면 kakaoLoginPro실행~
							},
							fail: function (error) {
								console.log(error)
							},
						})
					},
				})
			}
			
			function kakaoLoginPro(response){
				var data = {id:response.id,email:response.kakao_account.email}//data에 넘어온 값 담기
				$.ajax({
					type : 'POST',
					url : '/petBill/user/kakaologin',
					data : data,
					dataType : 'json',
					success : function(data){
						console.log(data)
						if(data.login == "YES"){
							alert("로그인되었습니다.");
							location.href = '/petBill/user/main'//메인으로 이동
						}else if(data.kakaosignup == "kakaosignup"){//db에 이메일이 없으면 회원가입
							$("#kakaoEmail").val(response.kakao_account.email);
							$("#kakaoId").val(response.id);
							$("#kakaoForm").submit();
						}else{
							alert("로그인에 실패했습니다");
						}
						
					},
					error: function(xhr, status, error){
						alert("로그인에 실패했습니다."+error);
					}
				});
			}
			function loginSubmit(){
				if(validation()){
					var loginFormData = {
							id : $('#id').val(),
							pw : $('#pw').val()
					}

					$.ajax({
						url : "/petBill/user/loginPro",
						method: "post",
						data : loginFormData,
						success : function(result){
							if(result === 'Y'){
								alert('로그인 성공');
								location.replace('/petBill/user/main');
							}else{
								alert('로그인 실패');
								$("#id").val("");
								$("#pw").val("");
								return
							}
						},
						error : function(error){
							console.log('error >> ' , error)
						}
						
					})
				}
				
			}			
			
			function validation(){
				if($('#id').val().trim().length === 0){
					alert("아이디를 입력해주세요");
					return false
				}
				if($('#pw').val().trim().length === 0){
					alert("비밀번호를 입력해주세요");
					return false
				}
				return true
			}
			
			
		</script>

	<body>
	
		<section>
	        <div class="color"></div>
	        <div class="color"></div>
	        <div class="color"></div>
	        <div class="box">
	            <div class="con">
	                <div class="form">
	                
	                	<%-- 카카오 로그인 form hidden --%>
						<form action="userSignupForm" id="kakaoForm" method="post">
							<input type="hidden" name="id" id="kakaoEmail"/>
							<input type="hidden" name="pw" id="kakaoId"/>
						</form>
						
	                    <h2>로그인</h2>
	                    <form name="login">
	                        <div class="inputBox">
	                            <input type="text" id="id" name="id" placeholder="UserID" />
	                        </div>
	                        <div class="inputBox">
	                            <input type="password" id="pw" name="pw" placeholder="Password" />
	                        </div>
	                        <br />
	                        <div>
	                            <input type="checkbox" id="auto" name="auto" value="1" /> 자동로그인
	                        </div>
	                        <div align="center">
	                            <button type="button" class="button" onclick="loginSubmit()">일반 로그인</button>
	                            <button class="btn-kakao" type="button" onclick="location.href='javascript:kakaoLogin()'">
									kakao 로그인
	                            </button>
	                        </div> 
	                        <div align="center">
	                            <button 
	                            	class="btn-join" 
	                            	type="button" 
	                            	onclick="window.location='/petBill/user/main'">메인으로 가기</button>
	                        </div> 
	                        <br />
	                        <p class="forget" align="center">
	                            <a href="findIdForm">아이디/비밀번호 찾기</a>
	                        </p>
	                        <p class="forget" align="center">
	                            <a href="userSignupForm">회원가입</a>
	                        </p>
	                    </form>
	                </div>
	            </div>
	        </div>
    	</section>
	
	</body>
</html>