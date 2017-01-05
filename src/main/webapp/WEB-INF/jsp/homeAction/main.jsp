<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>承压特种设备管理系统</title>
    <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>	
    <script type="text/javascript" src="script/homeAction/main.js"></script>
  </head>
  
  <body>
    <div class="warp">
        <!--头部开始-->
        <div class="top_c">
            <div class="top-menu">
                <ul class="top-menu-nav">
                	<li><a href="#">首页</a></li>
                	
                	<%-- 显示一级菜单 --%>
					<s:iterator value="#application.topPrivilegeList">
						<s:if test="#session.user.hasPrivilegeByName(name)">
							<li>
								<a> 
									${name}
								 <i class="tip-up"></i>
								 </a>
                    		<ul class="kidc">
							<%-- 显示二级菜单 --%>
								<s:iterator value="children">
									<s:if test="#session.user.hasPrivilegeByName(name)">
										<li><b class="tip"></b>
											<a target="Conframe" href="${pageContext.request.contextPath}${url}.action"> ${name}</a>
										</li>
									</s:if>
								</s:iterator>
							</ul>
							</li>
						</s:if>
					</s:iterator> 
                </ul>
            </div>
            
            
         <div class="top-nav">
         	<s:if test="#session.user==null">
         		 您还没有登录&nbsp;&nbsp;&nbsp;&nbsp;请 <a href="index.jsp">登录</a> &nbsp;  
         	</s:if>
         	<s:else>
         			 <ul class="top-menu-nav">
         			 	<li><a href="javascript:void(0)"> 欢迎您，<s:property value="#session.user.name"/>！<i class="tip-up"></i></a>
                    		<ul class="kidc" style="margin: 0 0 9px 180px;">
                    			<li><b class="tip"></b><a target="Conframe" href="${pageContext.request.contextPath}/user_editUI.action?id=<s:property value="#session.user.id"/>">个人信息</a></li>
                    			<li><b class="tip"></b><a target="Conframe" href="${pageContext.request.contextPath}/certificates_list.action?userId=<s:property value="#session.user.id"/>">证书信息</a></li>
                    			<li><b class="tip"></b><a target="Conframe" href="${pageContext.request.contextPath}/user_passwordUI.action">修改密码</a></li>
                    			<li><b class="tip"></b><a  href="${pageContext.request.contextPath}/user_logout.action">安全退出</a></li>   
                    		</ul>
                    	</li>
                    </ul>
         	</s:else> 
 		</div> 

        </div>
        <!--头部结束-->
         <!--左边菜单开始-->
        <div class="left_c">
            <h1><font>系统操作菜单</font></h1>
            <div class="acc">
                <div>                    
                    <%-- 显示一级菜单 --%>
					<s:iterator value="#application.topPrivilegeList">
						<s:if test="#session.user.hasPrivilegeByName(name)">
							<li>
								<a class="one"> 
									${name}
								</a>
                    		<ul class="kid">
							<%-- 显示二级菜单 --%>
								<s:iterator value="children">
									<s:if test="#session.user.hasPrivilegeByName(name)">
										<li><b class="tip"></b>
											<a target="Conframe" href="${pageContext.request.contextPath}${url}.action"> ${name}</a>
										</li>
									</s:if>
								</s:iterator>
							</ul>
						</li>
					</s:if>
				</s:iterator> 
                </div>
                <div id="datepicker"></div>
            </div>
                <div id="datepicker"></div>
            </div>
            
        </div>
        <!--左边菜单结束-->
        <!--右边框架开始-->
        <div class="right_c">
            <div class="nav-tip" onclick="javascript:void(0)">&nbsp;</div>

        </div>
        <div class="Conframe">
       	 	 <span class="errorClass" id="msg">
					${msg}
			 </span>
            <iframe name="Conframe" id="Conframe">
            
            </iframe>
        </div>
        <!--右边框架结束-->

        <!--底部开始-->
        <div class="bottom_c">Copyright &copy;2015-2020 华东理工大学 版权所有</div>
        <!--底部结束-->

  </body>
</html>
