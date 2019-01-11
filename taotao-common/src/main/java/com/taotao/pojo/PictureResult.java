package com.taotao.pojo;

/**
 * Created with IntelliJ IDEA.
 * User:admin
 * Date:2019/1/11
 * Time:10:26
 * Desc:
 */
public class PictureResult {
    private int error;
    private String url;
    private String message;
    public int getError() {
        return error;
    }
    public void setError(int error) {
        this.error = error;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
