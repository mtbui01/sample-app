package de.mobilcom.dpvo.demo;

public class ApiResult {
    
    private int error;
    
    private String result;

    
    public ApiResult(String result) {
        this.error = 0;
        this.result = result;
    }
    
    public ApiResult(int error, String result) {
        this.error = error;
        this.result = result;
    }
    
    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

}
