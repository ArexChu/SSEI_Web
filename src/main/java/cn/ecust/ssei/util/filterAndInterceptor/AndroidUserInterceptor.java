package cn.ecust.ssei.util.filterAndInterceptor;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.ecust.ssei.domain.user.User;
import cn.ecust.ssei.service.user.UserService;

public class AndroidUserInterceptor  extends HandlerInterceptorAdapter{
		
		@Autowired
		private UserService userService;
		
        @Override  
        public boolean preHandle(HttpServletRequest request,  
                HttpServletResponse response, Object handler) throws Exception {  
        	String userName = request.getParameter("userName");
        	String password = request.getParameter("passWord");
        	User user = userService.findByLoginNameAndPassword(userName, password);
        	if (user!=null) {
        		return true;
			}else {
				printData(response,"No User");
				return false;
			}	
        } 
        
        private void printData(HttpServletResponse response, String msg) {
            try {
             response.setContentType("text/html;charset=utf-8");
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF-8"));
                out.println(msg);
                out.close();
            } catch (Exception e) {  
                e.printStackTrace();  
            }
        }
        
       
}