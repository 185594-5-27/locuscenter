package com.zuul.controller;

import com.netflix.zuul.context.RequestContext;
import com.zuul.util.CombineException;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/*
* 类描述：
* @auther linzf
* @create 2017/12/26 0026 
*/
@RestController
public class ErrorHandlerController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String error(HttpServletRequest request) {
        RequestContext ctx = RequestContext.getCurrentContext();
        return CombineException.getErrorException(ctx.getThrowable()).toString();
    }



}
