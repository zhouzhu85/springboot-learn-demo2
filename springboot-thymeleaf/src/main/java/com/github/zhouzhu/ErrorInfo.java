package com.github.zhouzhu;

/**
 * @ClassName: ErrorInfo
 * @author:zhouzhu
 * @Date: 2018/9/26 11:06
 * @Version: V1.0
 */
public class ErrorInfo<T> {
    public static final Integer OK=0;
    public static final Integer ERROR=100;

    /**
     * 消息类型
     */
    private Integer code;
    /**
     * 消息内容
     */
    private String message;

    private String url;
    /**
     * 请求返回的数据
     */
    private T data;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
