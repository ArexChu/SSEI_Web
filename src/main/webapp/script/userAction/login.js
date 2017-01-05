$(function() {
	/**
	 * 作用：自动适配右边框大小*/
	var width1=$("body").width(); 
	var width=width1-1099;
	$("#myframe-right").css({ width: width });
	$(window).resize(function() {
		var width1=$("body").width(); 
		var width=width1-1099;
		$("#myframe-right").css({ width: width });
	});
	
	/**
	 * 作用：点击会自动刷新验证码*/
	$("#imgVerifyCode").click(function() {
	$("#imgVerifyCode").attr({src: "/SSEI/VerifyCodeServlet?a=" + new Date().getTime()});
	});	
	 $(".inputClass").focus(function() {
	   		var labelId = $(this).attr("id") + "_Error";//通过输入框找到对应的label的id
	   		$("#" + labelId).text("");//把label的内容清空！
	   		$("#msg").text("");
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
		$("#userlogin").submit(function() {
			var bool = true;//表示校验通过
			if(!validate_s_Log_Name()) {
				bool = false;
			};
			if(!validate_s_Log_Pas()) {
				bool = false;
			};
			if(!validate_s_VerifyCode()) {
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
	 *
	 * 用户名校验方法
	 */
	function validate_s_Log_Name() {
		var id = "s_Log_Name";
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
			$("#" + id + "_Error").text("用户名不能为空！");
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
			$("#" + id + "_Error").text("用户名长度必须在3到15之间！");
			showError($("#" + id + "_Error"));
			return false;
		}	
		return true;
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
			$("#" + id + "_Error").text("密码不能为空！");
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
			 false;
		}
		return true;
	}
	/*
	  * 验证码校验方法
	  */
	 function validate_s_VerifyCode() {
	 	var id = "s_VerifyCode";
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
	 		$("#" + id + "_Error").text("验证码不能为空！");
	 		showError($("#" + id + "_Error"));
	 		return false;
	 	}
	 	/*
	 	 * 2. 长度校验
	 	 */
	 	if(value.length != 4) {
	 		/*
	 		 * 获取对应的label
	 		 * 添加错误信息
	 		 * 显示label
	 		 */
	 		$("#" + id + "_Error").text("错误的验证码！");
	 		showError($("#" + id + "_Error"));
	 		false;
	 	}
	 	/*
		 * 3. 是否正确
		 */
		$.ajax({
			url:"user_verifyCode.action",//要请求的action
			data:{verifyCode:value},//给服务器的参数
			type:"POST",
			dataType:"json",
			async:false,//是否异步请求，如果是异步，那么不会等服务器返回，我们这个函数就向下运行了。
			cache:false,
			success:function(result) {
				if(!result) {//如果校验失败
					$("#" + id + "_Error").text("验证码错误！");
					showError($("#" + id + "_Error"));
					return false;
				}
			}
		});
	 	return true;		
	 }