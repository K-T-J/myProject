<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<link rel="icon" href="/resources/img/icon/favicon.ico"/>
		<%-- user 로그인,회원가입,아이디/비번 찾기 폼 userStyle.css --%>
		<link rel="stylesheet" type="text/css" href="/resources/css/petBill/petBill_userStyle.css" />
		<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
		
	</head>
	<script>
	
	//아이디 체크
	$(function(){
		$("#id").change(function(){
			var idVal = $("#id").val();
			$.ajax({
				url : "/petBill/user/ajaxidcheck",
				type : "post",
				data : {id:idVal},
				success : function(data){
					$("#id_ckeck").css("color","red");
					if(data == null){
						$("#id_ckeck").html("사용 가능한 아이디 입니다")
					}else{
						$("#id_ckeck").html("이미 사용중인 아이디 입니다")
						$('#id').val('');
					}
				},
				error : function(e){
					console.log("error >> " , e);
				}
			});
		});
	
		//닉네임 체크
	    $("#nickname").change(function(){
	    	$("#nickname_ckeck").css("color","red");
	        var regExp = /[~!@#$%^&*()_+|<>?:;{}ㅂㅈㄷㄱㅅㅛㅕㅑㅐㅔㅁㄴㅇㄹㅎㅓㅏㅣㅋㅌㅊㅠㅍㅗㅜㅡㅖㅒ,/.]/;
	        var nicknameVal = $("#nickname").val();
	        if(regExp.test(nicknameVal)){
	        	$("#nickname_ckeck").html("닉네임은 한글, 영어, 숫자만 입력 가능합니다")
	        	$("#nickname").val("");
	           return false;
	        }
	        $.ajax({
	           url : "/petBill/user/ajaxnicknamecheck",
	           type : "post",
	           data : {nickname:nicknameVal},
	           success : function(data){
	              $("#nickname_ckeck").css("color","red");
	              if(data == null){
		              $("#nickname_ckeck").html("사용 가능한 닉네임 입니다")
	              }else{
	            	  $("#nickname_ckeck").html("이미 사용중인 닉네임 입니다")
	                 $("#nickname").val("");
	              }
	           },
	           error : function(e){
	              console.log("error >> " , e);
	           }
	        });
	     });
	})	
	
	
	function submitCheck(){			
		console.log('id >> ' , $('#id').val());
		console.log('pw >> ' , $('#pw').val());
		console.log('name >> ' , $('#name').val());
		console.log('nickname >> ' , $('#nickname').val());
		console.log('mobile >> ' , $('#mobile').val());
 		if(validation()){
			var formData = {
					id : $('#id').val(),
					pw : $('#pw').val(),
					name : $('#name').val(),
					nickname : $('#nickname').val(),
					mobile : $('#mobile').val()
			}
			$.ajax({
				url : '/petBill/user/userSignupPro',
				type : 'post',
				data : formData,
				async : false,
				success : function(data){
					if(data === 'Y'){
						alert('가입 축하합니다')
						location.replace('/petBill/user/loginForm');
					}else{
						alert('가입 실패')
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
		if($('#name').val().trim().length === 0){
			alert("이름을 입력해주세요");
			return false
		}		
		if($('#nickname').val().trim().length === 0){
			alert("닉네임을 입력해주세요");
			return false
		}
		if($('#mobile').val().trim().length === 0){
			alert("핸드폰번호를 입력해주세요");
			return false
		}		
		if($('pw').val() != $('pwch').val()){
			alert("비밀번호를 동일하게 입력하세요");
			$("#pw").val("");
			$("#pwch").val("");
			return false;
		}
	    var patternPhone = /01[016789]-[^0][0-9]{2,3}-[0-9]{3,4}/;
		if(!patternPhone.test($('#mobile').val())){
	        alert('핸드폰 번호를 확인 해주세요');
	        $("#mobile").val("");
	        return false;
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
	                	
	                    <h2>회원가입</h2>
	                    <form method="post">
	                    	<c:if test="${id == null && pw == null}">
		                        <div class="inputBox-signup">
		                        	아이디
		                            <input type="text" placeholder="영문/숫자 조합" name="id" id="id" maxlength='20' required />
		                        	<br/>
		                        	<span id="id_ckeck"></span>
		                        </div>
		                        <div class="inputBox-signup">
	                    			비밀번호
		                            <input type="password" name="pw" id="pw" placeholder="비밀번호를 입력하세요." maxlength='20' required/>
		                        </div>
	                    		<div class="inputBox-signup">
		                            비밀번호 확인
		                            <input type="password" name="pwch" id="pwch" placeholder="다시 비밀번호를 입력하세요." maxlength='20' required />
		                        </div>
		                        <div class="inputBox-signup">
	                    			이름
		                            <input type="text" name="name" id="name" maxlength='10' placeholder="이름을 입력하세요." required/>
		                        </div>
	                    		<div class="inputBox-signup">
	                    			닉네임
		                            <input type="text" name="nickname" id="nickname" maxlength='10'  placeholder="닉네임을 입력하세요." required />
		                            <br />
		                            <span id="nickname_ckeck"></span>
		                        </div>
		                  		<div class="inputBox-signup">
	                    			휴대폰
		                            <input type="text" name="mobile" id="mobile" placeholder="'-'를 포함하여 입력하세요." maxlength="13" required/>
		                        </div>
	                    	</c:if>
	                    	<!-- 
	                    	<c:if test="${id != null && pw != null}">
		                        <div class="inputBox-signup">
		                            <input type="hidden" name="id" id="id" value= "${id}"/>
		                        </div>
	                    		<div class="inputBox-signup">
		                            <input type="hidden" name="pw" id="pw" value="${pw}" required/>
		                        </div>
	                    		<div class="inputBox-signup">
		                            <input type="hidden" name="pwch" id="pwch" value="${pw}" required />
		                        </div>
	                    		<div class="inputBox-signup">
	                    			이름
		                            <input type="text" name="name" maxlength='10' required/>
		                        </div>
	                    		<div class="inputBox-signup">
	                    			닉네임
		                            <input type="text" name="nickname" maxlength='10' id="nickname"/>
		                            <br />
		                            <span id="nickname_ckeck"></span>
		                        </div>
		                  		<div class="inputBox-signup">
	                    			휴대폰
		                            <input type="text" name="mobile" id="mobile" placeholder="'-' 포함" maxlength="13" required/>
		                        </div>
	                    	</c:if>
	                    	 -->
	                    	<br />
	                        <div align="center">
                       		    <button type="button" class="btn-join" onclick="submitCheck()">가입</button>
	                        </div>   
	                        <div align="center">
	                            <button class="button" type="reset">재작성</button>
	                            <button class="btn-cancel" onmouseover="this.innerHTML='메인으로';" onmouseout="this.innerHTML='취소';" 
	                            onclick="window.location='/petBill/user/main'">취소</button>
	                        </div>
	                    </form>
	                </div>
	            </div>
	        </div>
    	</section>
	</body>
</html>