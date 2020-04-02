package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    public static String DEFAULT_ERROR_VIEW="error";

    @ExceptionHandler(value=Exception.class)
    public ModelAndView defaultErrorHandeler(HttpServletRequest request,Exception exception) throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception",exception);
        mv.addObject("url",request.getRequestURL());
        mv.setViewName(DEFAULT_ERROR_VIEW);
        return mv;
    }
}
