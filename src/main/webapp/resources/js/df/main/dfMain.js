$(function(){
	
	$(".characterInfoCard").on("click", function(){
		
	})
	
})
 
 function btnSearch(){
	
	$.ajax({
		"method" : 'GET',
		"url" : '/api/get/df/searchInfo',
		"data": {
			"serverId" : $("#srchSelect").val(),
			"characterName" : $.trim($("#characterName").val())
		},
		"dataType": "json",
		"contentType": "application/json",
		"success": function(data, textStatus, xhr) {
			let containerDiv = $("#containerDiv");
			containerDiv.empty();
			$.each(data.rows, function(index, item){
				let appendDiv = $("#tempCard").clone().attr("id","").show();
				appendDiv.find(".characterInfoCard").on("click",function(){
					window.location.href = "/df/characterDetail?serverId="+item.serverId+"&characterId="+item.characterId;
				});
				
				
				appendDiv.find("img.characterImg").attr("src","https://img-api.neople.co.kr/df/servers/"+item.serverId+"/characters/"+item.characterId+"?zoom=3");
				appendDiv.find(".level").text("Lv."+item.level);
				appendDiv.find(".characterName").text(item.characterName);
				let serverIdText = serverIdSearch(item.serverId);
				appendDiv.find(".jobGrowNameAndServerId").text(item.jobGrowName + " । " +serverIdText);
				let fame = item.fame == null ? "0" : item.fame;
				appendDiv.find(".fame").text(fame);
				appendDiv.find(".fame").prepend("<img class='fameImg' src='/resources/img/icon/ico_fame.png' style='margin-right:5px; margin-bottom:4px;'>");
				appendDiv.find("input[name='serverId']").val(item.serverId);
				appendDiv.find("input[name='characterId']").val(item.characterId);
				
				containerDiv.append(appendDiv);
				
			})
		},
		"error" : function(result){
			commonAjaxError(result);
		}
	})
}

function test(){
	console.log(" >> ");
	
}

function serverIdSearch(serverId){
	let serverIdText = "";
	switch(serverId){
		case "anton":
			serverIdText = "안톤";
			break;
		case "bakal":
			serverIdText = "바칼";
			break;
		case "cain":
			serverIdText = "카인";
			break;
		case "casillas":
			serverIdText = "카시야스";
			break;
		case "diregie":
			serverIdText = "디레지에";
			break;
		case "hilder":
			serverIdText = "힐더";
			break;
		case "prey":
			serverIdText = "프레이";
			break;
		case "siroco":
			serverIdText = "시로코";
			break;
			
	}
	return serverIdText;
	
}
function commonAjaxError( result ) {
	var errorMsg = "처리를 실패하였습니다.";
	if ( result.responseText !== undefined && result.responseText != "" ) {
		errorMsg = result.responseText;
	}
	else if ( result.responseJSON !== undefined && result.responseJSON.message !== undefined && result.responseJSON.message != "" ) {
		errorMsg = result.responseJSON.message;
	} 
	alert( errorMsg );
}