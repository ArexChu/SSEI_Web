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
  	/*
	 *  表单提交时进行校验
	 */
	$('form').submit(function() {
		var bool = true;//表示校验通过
		if(!validate_s_Log_Pas()) {
			bool = false;
		};
		if(!validate_s_New_Pass()) {
			bool = false;
		};
		if(!validate_s_Re_New_Pass()) {
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
  * 密码校验
  */
 function validate_s_Log_Pas() {
 	var id = "s_Log_Pas";
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
 		$("#" + id + "_Error").text("原密码不能为空！");
 		showError($("#" + id + "_Error"));
 		return false;
 	}
 	/*
 	 * 2. 长度校验
 	 */
 	if(value.length < 3 || value.length > 15) {
 		/*
 		 * 获取对应的label
 		 * 添加错误信息
 		 * 显示label
 		 */
 		$("#" + id + "_Error").text("密码长度必须在3到15之间！");
 		showError($("#" + id + "_Error"));
 		return false;
 	}
 	return true;
 }
//校验新密码
 function validate_s_New_Pass() {
	 	var id = "s_New_Pass";
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
	 		$("#" + id + "_Error").text("新密码不能为空！");
	 		showError($("#" + id + "_Error"));
	 		return false;
	 	}
	 	/*
	 	 * 2. 长度校验
	 	 */
	 	if(value.length < 3 || value.length > 15) {
	 		/*
	 		 * 获取对应的label
	 		 * 添加错误信息
	 		 * 显示label
	 		 */
	 		$("#" + id + "_Error").text("密码长度必须在3到15之间！");
	 		showError($("#" + id + "_Error"));
	 		return false;
	 	}
	 	return true;
	 }

 /*
  * 校验确认密码
  */
 function validate_s_Re_New_Pass() {
	 	var id = "s_Re_New_Pass";
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
	 		$("#" + id + "_Error").text("确认密码不能为空！");
	 		showError($("#" + id + "_Error"));
	 		return false;
	 	}
	 	/*
	 	 * 2. 一致校验
	 	 */
	 	if(value != $("#s_New_Pass").val()) {//两次输入是否一致
	 		$("#" + id + "_Error").text("两次输入不一致！");
	 		showError($("#" + id + "_Error"));
	 		return false;
	 	}
	 	return true;
	 }
