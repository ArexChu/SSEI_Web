$(function () { 
   			
   		 /*获取form表单的id属性，判断修改公司（company_edit）还是添加公司（company_add）*/
   			var typeid=$("form").attr("action");
   		
   			if(typeid.indexOf("edit")>-1){
   				$(".inputClass").addClass("switchState");
   				$("form *").attr("disabled", "true");  
   				$("form *").css("cursor","default");
   				$("form :button").removeAttr("disabled");  
   				$("#submit").hide();
   			}
   			else{
   				$(".inputClass").removeClass("switchState");
   				$('#startEdit').hide();
   			}
   		/*修改、取消修改切换事件*/
   			$('#startEdit').toggle(
				  function(){			
					$("form *").removeAttr("disabled");  
		   			$(".inputClass").removeClass("switchState");
		   			$('#startEdit').text("取消修改");	
					$("#submit").show();
				  },
				  function(){
					$('#startEdit').text("修改");
 					$(".inputClass").addClass("switchState");
 					$("form *").attr("disabled", "true"); 
 					$("form *").css("cursor","default");	 
 					$("form :button").removeAttr("disabled");  
 					$("#submit").hide();
				  }
 			);
 	//多选框切割字符串
   			$(".hiddenBox").each(function() {
				var value_temp = $(this).attr("value");
				var str=value_temp.split(",");
				var name = $(this).attr("name")+"_Temp";
				
				$("input[name='"+name+"']").each(function() {
					for (var i=0;i<str.length;i++)
					{
						if($(this).attr('value')==str[i]){
							$(this).attr('checked', true);
						};
					};
			 	});
			});
		// 多选框拼接字符串	
			$(".temp").on("click", function () {
				var temp = $(this).attr("name");
				var finalName = temp.substring(0,temp.length - 5);
				 var string = "";
				 $("input[name="+temp+"]:checked").each(function() {
					 string += $(this).attr('value') + ",";
				 });
				 if (string.length > 0) {
					 string = string.substring(0, string.length - 1);
				 }
				 
				 $("#"+finalName).attr("value", string);
			   });
			
			
});

function mutilInputToOne(name){
 	var tempName= name+"_Temp";
	var size = $("input[name='"+tempName+"']").size();
	$("input[name='"+tempName+"']").on("change", function () {
		var key="";
		for(var i=1;i<=size;i++){
			var temp = $("#"+tempName+"_"+i).val();
			key=key+","+temp;
		}
		$("input[name='"+name+"']").attr("value", key);
	});
	var teststring=$("input[name='"+name+"']").val();
	var cut=teststring.split(",");
	for (var i=0;i<cut.length;i++)
	{$("#"+tempName+"_"+i).val(cut[i]);} 
}
