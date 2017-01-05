		$(function () { 
			var tr_length =$('.tr_demo').find('td').length;//获得列数
			$('.tr_data').each(function(){
				var tr=$(this);
				var sub = tr.children().eq(0).html();
				var value = tr.children().eq(tr_length).children().eq(0).attr("value");
				var tds =value.split(',');//切割数据
				for(var i=1;i<tr_length;i++){
					 var td=tr.children().eq(i);//获得第j列
					 if(i==2 ){
						 var name ="temp"+sub;
						 $("input[name="+name+"][value="+tds[i-1]+"]").attr("checked",'checked');
					 }else{
						 td.children().eq(0).attr("value",tds[i-1]);
					 } 
				}
			});
			
			$('form').submit(function(){
				$('.tr_data').each(function(){
					var tr=$(this);
					var value="";
					var sub = tr.children().eq(0).html();
					for(var i=1;i<tr_length;i++){
						 var td=tr.children().eq(i);//获得第j列
						 var temp="";
						 if(i==2 ){
							 var name ="temp"+sub;
							 temp = $('input[name='+name+']:checked').val();	 
						 }else{
							 temp = td.children().eq(0).attr("value");
						 }
						 value+=temp;
						 value+=",";
					}
					value=value.substring(0,value.length-1);
					tr.children().eq(tr_length).children().eq(0).attr("value",value);
				});
	 		});
		});