$(function () {
		var td_length =$('.tableValue').find('tr').eq(0).find("td").length;//获得列数
		var value=$("#tablevalue").attr("value");
		var trs =value.split(';');//切割行
		var trsNum =trs.length;//计算行数
		//通过行数与demo生成html
		 var _html= "<tr>"+$('.tableValue').find('tr').eq(1).html()+"</tr>";;//获得一行模板，模板放在第一行
		 for(var i=1;i<=trsNum;i++){
			 $('.tableValue').append(_html);//添加一行
			 var tr =$('.tableValue').find('tr').eq(i+1);//获得该行
			 var trValue = trs[i-1];
			 for(var j=0;j<td_length;j++){
				 var td=tr.children().eq(j);//获得第j列
				 var tdValue = trValue.split(',');//获得该单元格的值
				 td.children().eq(0).attr("value",tdValue[j]);
			 }
		 }

	 	$('form').submit(function(){
	 		
			var tr_length =$('.tableValue').find('tr').length;//获得行数
			var value="";
			for(var i=2;i<tr_length;i++){
				var tr =$('.tableValue').find('tr').eq(i);//获得第i行,从第三行开始。
				for(var j=0;j<td_length;j++){
					 var td=tr.children().eq(j);//获得第j列
					 var temp =td.children().eq(0).attr("value");
					 value+=temp;
					 value+=",";
				}
				value=value.substring(0,value.length-1);
				value=value+";";
			}
			value=value.substring(0,value.length-1);
			$("#tablevalue").attr("value",value);
	 	});
		 
		 $('.table_add').click(function(){
			 var _active_html= "<tr>"+$('.tableValue').find('tr').eq(1).html()+"</tr>";;//获得一行模板，模板放在第一行
			 $('.tableValue').append(_active_html);//添加一行
		 });
		 
		 
		 $('.table_delete').click(function(){
			 var tr_length =$('.tableValue').find('tr').length;//获得行数
			 $('.tableValue').find('tr').eq(tr_length-1).remove();
		 });
		 
	 });