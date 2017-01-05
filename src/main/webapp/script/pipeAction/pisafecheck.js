		$(function () { 
			//var tr_length =$('.tr_demo').find('td').length;//获得列数
			var sub=1;
			$('.tr_data').each(function(){
				var tr=$(this);
				//var sub = tr.children().eq(0).html();
				var tr_length =tr.find('td').length-1;//获得列数
				var value = tr.children().eq(tr_length).children().eq(0).attr("value");
				var tds =value.split(',');//切割数据
				for(var i=1;i<tr_length;i++){
					 var td=tr.children().eq(i);//获得第j列
					 if(i==tr_length-2 ){
						 var name ="temp"+sub;
						 sub++;
						 $("input[name="+name+"][value="+tds[i-1]+"]").attr("checked",'checked');
					 }else if(i==tr_length-1){
						 td.children().eq(0).children().eq(0).attr("value",tds[i-1]);
					 }else{
						 td.children().eq(0).attr("value",tds[i-1]);
					 } 
				}
			});
			
			$('form').submit(function(){
				var sub=1;
				$('.tr_data').each(function(){
					var tr=$(this);
					var tr_length =tr.find('td').length-1;//获得列数
					var value="";
					//var sub = tr.children().eq(0).html();
					for(var i=1;i<tr_length;i++){
						 var td=tr.children().eq(i);//获得第j列
						 var temp="";
						 if(i==tr_length-2 ){
							 var name ="temp"+sub;
							 sub++;
							 temp = $('input[name='+name+']:checked').val();	 
						 }else if(i==tr_length-1){
							 temp =td.children().eq(0).children().eq(0).attr("value");
								
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