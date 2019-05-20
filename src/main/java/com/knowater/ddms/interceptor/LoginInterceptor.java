package com.knowater.ddms.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义登陆拦截器
 *
 * @author wangpf
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(LoggerFactory.class);

    private static final String REQUEST_GET = "GET";

    private static final String REQUEST_OPTIONS = "OPTIONS";

    @Resource
    private Environment environment;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String username = CookieUtil.getCookieValue("MPUser", request);
//
//        String profile = environment.getProperty("spring.profiles.active");
//        if(profile.equals("local")){
//            username = "test";
//        }
//        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(GlobalConstant.SESSION_ACTIVE_TIME);
//        // 把session放入threadLocal中
//        SysContextHolder.initSession(session);
//        if(StringUtils.isEmpty(username)){
//            logger.info("用户未登录！");
//            response.sendError(HttpServletResponse.SC_FORBIDDEN, "用户未登录");
//            return false;
//        }else {
//            User user = new User();
//            user.setUsername(username);
//            session.setAttribute(GlobalConstant.SESSION_USER_KEY, user);
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 完成请求对处理尽心日志处理,排除GET查询请求
        /*if(REQUEST_GET.equals(request.getMethod()) || REQUEST_OPTIONS.equals(request.getMethod())){
            return;
        }
        logService.insert(request, SysContextUtil.getUserName());*/
    }
}
