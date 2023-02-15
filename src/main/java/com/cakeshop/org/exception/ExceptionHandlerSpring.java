package com.cakeshop.org.exception;


import com.cakeshop.org.model.baseresponse.BaseResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class ExceptionHandlerSpring extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    protected ResponseEntity<BaseResponse> handleConflict(
            Exception ex, WebRequest request) {
        String bodyOfResponse = ex.getMessage();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(null);
        baseResponse.setMsg(bodyOfResponse);
        baseResponse.setStatusCode(500);
        return new ResponseEntity<>(baseResponse
                , HttpStatus.CONFLICT);
    }


}
