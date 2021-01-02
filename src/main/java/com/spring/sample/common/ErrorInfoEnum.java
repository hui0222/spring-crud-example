package com.spring.sample.common;

public enum ErrorInfoEnum implements ErrorInfo {

    PARAMS_NOT_NULL("ERR0001", "params not null"),
    PARAMS_NOT_NULL2("ERR0002", "params not null2"),

    ERR0002("ERR0002","오류가 발생하였습니다. 관리자에게 문의하여 주십시오.")
    , ERR0003("ERR0003","로그아웃 상태입니다.")
    , ERR0004("ERR0004","비밀번호가 올바르지 않습니다.")
    ;

    private String code;

    private String message;

    ErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
