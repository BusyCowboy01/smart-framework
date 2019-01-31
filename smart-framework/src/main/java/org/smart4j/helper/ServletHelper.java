package org.smart4j.helper;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author BusyCowboy01
 * @date 2018/7/31.
 * @description
 */

public final class ServletHelper {
    //使每个
    private static final ThreadLocal<ServletHelper> SERVLET_HELPER_THREAD_LOCAL = new ThreadLocal<ServletHelper>();

    private HttpServletRequest request;
    private HttpServletResponse response;

    public ServletHelper(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    /**
     * 初始化
     *
     * @param request
     * @param response
     */
    public static void init(HttpServletRequest request, HttpServletResponse response) {
        SERVLET_HELPER_THREAD_LOCAL.set(new ServletHelper(request, response));
    }

    /**
     * 销毁
     */
    public static void destroy() {
        SERVLET_HELPER_THREAD_LOCAL.remove();
    }

    /**
     * 将属性放入request中
     */
    public static void setRequsetAttribute(String key, Object value) {
        getRequset().setAttribute(key, value);
    }

    /**
     * 从request中获取属性
     */
    @SuppressWarnings("unchecked")
    public static <T> T getRequestAttribute(String key){
        return (T)getRequset().getAttribute(key);
    }

    /**
     * 从request中移除属性
     * @param key
     */
    public static void remoteRequestAttribute(String key){
        getRequset().removeAttribute(key);
    }

    /**
     * 发送重定向响应
     */
    public static void sendRedirect(String location){
        try {
            getResponse().sendRedirect(getRequset().getContextPath()+location);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将属性放入session
     */
    public static void setSessionAttribute(String key,Object value){
        getSession().setAttribute(key,value);
    }

    /**
     * 从session中获取属性
     */
    @SuppressWarnings("unchecked")
    public static <T> T getSessionAttribute(String key){
        return (T)getRequset().getSession().getAttribute(key);
    }

    /**
     * 从session中移除属性
     */
    public static void removeSessionAttribute(String key){
        getRequset().getSession().removeAttribute(key);
    }

    /**
     * 使session失效
     */
    public static void invalidateSession(){
        getRequset().getSession().invalidate();
    }

    /**
     * 获取request对象
     *
     * @return
     */
    public static HttpServletRequest getRequset() {
        return SERVLET_HELPER_THREAD_LOCAL.get().request;
    }

    /**
     * 获取response对象
     *
     * @return
     */
    public static HttpServletResponse getResponse() {
        return SERVLET_HELPER_THREAD_LOCAL.get().response;
    }

    /**
     * 获取session对象
     *
     * @return
     */
    public static HttpSession getSession() {
        return getRequset().getSession();
    }

    /**
     * 获取servletContext对象
     *
     * @return
     */
    public static ServletContext getServletContext() {
        return getRequset().getServletContext();
    }
}
