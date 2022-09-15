/**
 * sign Up JS 파일
 */

$(function(){
	$('#id').keyup(function(){
		$.ajax({
			method : 'post',
			url : '/idCheck',
			data : {id : $('#id').val()},
			success : function(result){
				console.log('result >> ' , result);
				if(result === "Y"){
					$('#idConfirm').text('이미 사용중인 아이디 입니다').css('color',"red");
				}else{
					$('#idConfirm').text('사용가능한 아이디 입니다').css('color',"red");
				}
			},
			error : function(err){
				console.log('err >> ' ,err)
			}
		})
	})
})
	

	


 
function signUpCheck(){
	
	if(this.validation()){
		var data = {
			id : $('#id').val(),
			email : $('#email').val(),
			password : $('#password').val(),
		}		
		$.ajax({
			method : 'post',
			url : '/signupSubmit',
			data : data,
			success : function(result){
				if(result === 'Y'){
					alert("가입을 축하해요");
					location.replace("/login"); //이전페이지로 이동x / location.href() : a태그와 동일 이전페이지 이동o / window.open() : 새창으로 열기 
				}else{
					alert("가입에 실패 했어요");
				}
			},
			error : function(request,error){
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error); //에러 원인
			}
		})
	}
}

function validation(){
	if($('#id').val().trim().length === 0){
		alert("아이디를 입력해주세요");
		return false
	}
	if($('#email').val().trim().length === 0){
		alert("이메일을 입력해주세요");
		return false
	}
	if($('#password').val().trim().length === 0){
		alert("비밀번호를 입력해주세요");
		return false
	}
	if($('#passwordCh').val().trim().length === 0){
		alert("비밀번호 확인을 입력해주세요");
		return false
	}
	//비밀번호, 비밀번호 체크 확인
	if($('#password').val().trim() !== $('#passwordCh').val().trim()){
		alert("비밀번호가 서로 달라요");
		return false
	}
	//이메일 형식
	var emailRule = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	if(!emailRule.test($('#email').val())){// test : 찾는 문자열이 들어있는지 아닌지 알려준다.  없다면 false / 들어있다면 true
		alert("올바른 이메일 형식이 아니에요");
		return false
	}
	return true
}