 $(function () {          
            /*
        	 *  得到所有的错误信息，循环遍历之。调用一个方法来确定是否显示错误信息！
        	 */
        	$(".errorClass").each(function() {
        		showError($(this));//遍历每个元素，使用每个元素来调用showError方法
        	});
        	
        	
        	 $(".inputClass").focus(function() {
         		var labelId = $(this).attr("id") + "_Error";//通过输入框找到对应的label的id
         		$("#" + labelId).text("");//把label的内容清空！
         		showError($("#" + labelId));//隐藏没有信息的label
         	});
        	 
        	 /*
        	*  输入框失去焦点进行校验
        	*/
        	$(".inputClass").blur(function() {
        		var id = $(this).attr("id");//获取当前输入框的id
        		var funName = "validate_" + id + "()";//得到对应的校验函数名
        		eval(funName);//执行函数调用
        	});
        	
        	/*
        	 *  表单提交时进行校验
        	 */
        	$("#saveUI").submit(function() {
        		var bool = true;//表示校验通过
        		if(!validate_companyID()) {
        			bool = false;
        		};
        		if(!validate_roleID()) {
        			bool = false;
        		};
        		if(!validate_e_Mail()) {
        			bool = false;
        		};   		
        		return bool;
        	});

});
 
 /*
  * 判断当前元素是否存在内容，如果存在显示，不页面不显示！
  */
 function showError(ele) {
 	var text = ele.text();//获取元素的内容
 	if(!text) {//如果没有内容
 		ele.css("display", "none");//隐藏元素
 	} else {//如果有内容
 		ele.css("display", "");//显示元素
 	}
 }
 /*
  * 公司校验方法
  */
 function validate_companyID() {
 	var id = "companyID";
 	var value = $("#" + id+" option:selected").val();//获取输入框内容
 	/*
 	 * 1. 非空校验
 	 */
 	if(value=="") {
 		/*
 		 * 获取对应的label
 		 * 添加错误信息
 		 * 显示label
 		 */
 		$("#" + id + "_Error").text("单位不能为空！");
 		showError($("#" + id + "_Error"));
 		return false;
 	}
 	return true;
 }
 
 /*
  * 角色校验方法
  */
 function validate_roleID() {
	 var id = "roleID";
	 	var value = $("#" + id+" option:selected").val();//获取输入框内容
	 	/*
	 	 * 1. 非空校验
	 	 */
	 	if(value=="") {
	 		/*
	 		 * 获取对应的label
	 		 * 添加错误信息
	 		 * 显示label
	 		 */
	 		$("#" + id + "_Error").text("角色不能为空！");
	 		showError($("#" + id + "_Error"));
	 		return false;
	 	}
	 	return true;
 }
 


 	/*
 	  * Email校验方法
 	  */
 	 function validate_e_Mail() {
 	 	var id = "e_Mail";
 	 	var value = $("#" + id).val();//获取输入框内容
 	 	/*
 	 	 * 1. 非空校验
 	 	 */
 	 	if(!value) {
 	 		/*
 	 		 * 获取对应的label
 	 		 * 添加错误信息
 	 		 * 显示label
 	 		 */
 	 		$("#" + id + "_Error").text("E_Mail不能为空！");
 	 		showError($("#" + id + "_Error"));
 	 		return false;
 	 	}
 	 	/*
 		 * 2. Email格式校验
 		 */
 		if(!/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,6}){1,2})+$/.test(value)) {
 			/*
 			 * 获取对应的label
 			 * 添加错误信息
 			 * 显示label
 			 */
 			$("#" + id + "_Error").text("错误的Email格式！");
 			showError($("#" + id + "_Error"));
 			return false;
 		}
 		return true;
 	 }
 	 
 