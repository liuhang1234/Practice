package com.lh.myapplication.http;

public class BaseResponse<T> {

    /**
     * success : true
     * data : []
     * error : null
     * msg : 操作成功
     */

    private boolean success;
    private String error;
    private String msg;
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResponse{" + "success=" + success + ", error='" + error + '\'' + ", msg='" +
                msg + '\'' + ", data=" + data + '}';
    }
}