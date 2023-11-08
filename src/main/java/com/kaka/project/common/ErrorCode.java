package com.kaka.project.common;


public enum ErrorCode {

    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "Error params"),
    NOT_LOGIN_ERROR(40100, "Not Login"),
    NO_AUTH_ERROR(40101, "No Auth"),
    NOT_FOUND_ERROR(40400, "Not Found"),
    FORBIDDEN_ERROR(40300, "Forbidden"),
    SYSTEM_ERROR(50000, "Internal Error"),
    OPERATION_ERROR(50001, "Operation Failed");

    private final int code;

    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
