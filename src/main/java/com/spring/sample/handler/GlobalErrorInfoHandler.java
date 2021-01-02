package com.spring.sample.handler;

import com.spring.sample.common.ErrorInfo;
import com.spring.sample.common.GlobalErrorInfoEnum;
import com.spring.sample.common.ResultBody;
import com.spring.sample.exception.GlobalErrorInfoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@ControllerAdvice
public class GlobalErrorInfoHandler {

    private static Logger logger = LoggerFactory.getLogger(GlobalErrorInfoHandler.class);



    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public ResultBody errorHandlerOverJson(HttpServletRequest request, RuntimeException exception) {

        System.out.println("error 1" + exception);

        ResultBody result = new ResultBody(GlobalErrorInfoEnum.PARAM_NOT_NULL);
        return result;
    }



    @ExceptionHandler(value = GlobalErrorInfoException.class)
    @ResponseBody
    public ResultBody handleGlobalErrorInfoException(HttpServletRequest request, Locale locale, GlobalErrorInfoException exception) {
        ErrorInfo errorInfo = exception.getErrorInfo();

        System.out.println("error 2");

        //getMessage(errorInfo, locale, exception.getArgs());

        ResultBody result = new ResultBody(errorInfo);
        return result;
    }

    /*
    private void getMessage(ErrorInfo errorInfo, Locale locale, Object... args) {
        String message = null;

        System.out.println("error 3");

        if (!StringUtils.isEmpty(errorInfo.getCode())) {
            message = MessageUtils.message(errorInfo.getCode(), locale, args);
        }
        if (message == null) {
            message = errorInfo.getMessage();
        }
        errorInfo.setMessage(message);
    }

     */
}
