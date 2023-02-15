package com.cakeshop.org.utils;

import com.cakeshop.org.model.baseresponse.BaseResponse;
import com.cakeshop.org.model.baseresponse.Data;
import com.mysql.cj.x.protobuf.Mysqlx;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseHandler {

    public <T> ResponseEntity<BaseResponse> successResponse(int code, String msg, boolean status, T response) {
        BaseResponse baseResponse = new BaseResponse();
       // Data<T> data1 = new Data<>();
      //  data1.setBody(response);
        baseResponse.setData(response);
        baseResponse.setMsg(msg);
        baseResponse.setStatus(status);
        baseResponse.setStatusCode(code);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
    public <T> ResponseEntity<BaseResponse> failureResponse(int code, String msg, boolean status) {
        BaseResponse baseResponse = new BaseResponse();
         baseResponse.setData(null);
        baseResponse.setMsg(msg);
        baseResponse.setStatus(status);
        baseResponse.setStatusCode(code);
        return new ResponseEntity<>(baseResponse, HttpStatus.NOT_FOUND);
    }
}
