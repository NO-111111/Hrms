//package com.example.hrms.interceptors;
//
//import com.example.hrms.utils.JwtUtil;
//import com.example.hrms.utils.ThreadLocalUtil;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import java.util.Map;
//
//@Component
//public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        //令牌验证
//        String token = request.getHeader("Authorization");
//        try {
//            Map<String,Object> claims = JwtUtil.parseToken(token);
//
//            //把业务数据存储到ThreadLocalUtil
//            ThreadLocalUtil.set(claims);
//
//            return true;
//        } catch (Exception e) {
//
//            response.setStatus(401);
//            return false;
//        }
//
//    }
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        //清理ThreadLocalUtil
//        ThreadLocalUtil.remove();
//    }
//
//}
//
