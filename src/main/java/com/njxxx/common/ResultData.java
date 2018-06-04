package com.njxxx.common;

/**
 * Created by 陈亚兰 on 2018/6/4.
 */
public class ResultData<T> {
    private static final Integer ERROR_CODE=400;
    private static final Integer SUCCESS_CODE=200;
    private Integer code;
    private String message;
    private T result;


    public ResultData(){}
    public static ResultData getInstance(){
        return new ResultData();
    }

    public static <T> ResultData<T> success(T t){
        ResultData<T> resultData=ResultData.getInstance();
        resultData.setCode(SUCCESS_CODE);
        resultData.setMessage("成功");
        resultData.setResult(t);
        return resultData;
    }

    public static <T> ResultData<T> error(T t){
        ResultData<T> resultData=ResultData.getInstance();
        resultData.setCode(ERROR_CODE);
        resultData.setMessage("失败");
        resultData.setResult(t);
        return resultData;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
