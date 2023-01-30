/**
 * 로그인
 */
 
 function loginCh(){
	
	if(this.validation()){
		var data = {
			id : $('#id').val(),
			password : $('#password').val()
		}
		
		
		$.ajax({
			method : 'post',
			url : '/loginCheck',
			data : data,
			success : function(result){
				if(result === 'N'){
					alert('아이디 또는 비밀번호를 잘못 입력했습니다');
				}else{
					location.replace('/main')
				}
			},
			error : function(error){
				console.log('error' , error)
			}
			
			
		})
	}
	
	
	
}

function validation(){
	
	if($('#id').val().trim().length === 0){
		alert("아이디를 입력해주세요");
		return false
	}
	if($('#password').val().trim().length === 0){
		alert("비밀번호를 입력해주세요");
		return false
	}
	
	return true
}
