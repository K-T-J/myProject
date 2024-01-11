/**
 * 
 */
 
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
				appendDiv.find("img").attr("src","https://img-api.neople.co.kr/df/servers/"+item.serverId+"/characters/"+item.characterId+"?zoom=1");
				let serverIdText = serverIdSearch(item.serverId);
				appendDiv.find(".characterName").text("[" +serverIdText+"] "+item.characterName);
				
				
				containerDiv.append(appendDiv);
				
			})
		},
		"error" : function(request, status, error){
			console.log('code' , request.status)
			console.log('code' , status)
			console.log('message' , request.responseText)
			console.log('error' , error)
		}
	})
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