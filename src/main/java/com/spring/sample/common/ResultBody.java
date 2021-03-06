package com.spring.sample.common;

import com.spring.sample.common.ErrorInfo;
import com.spring.sample.common.GlobalErrorInfoEnum;

import java.io.Serializable;

public class ResultBody implements Serializable {

    private String serverCode = "200";
    private String serverMessage;
    private Object results;

    public ResultBody(ErrorInfo errorInfo) {
        this.serverCode = errorInfo.getCode();
        this.serverMessage = errorInfo.getMessage();
    }

    public ResultBody() {
        this.serverCode = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.serverMessage = GlobalErrorInfoEnum.SUCCESS.getMessage();
    }

    public ResultBody(Object results) {
        this.serverCode = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.serverMessage = GlobalErrorInfoEnum.SUCCESS.getMessage();
        this.results = results;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }
}
