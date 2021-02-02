package de.mobilcom.dpvo.demo;

public class ApiRespone {
    
    private int error;
    
    private String result;

    
    public ApiRespone(String result) {
        this.error = 0;
        this.result = result;
    }
    
    public ApiRespone(int error, String result) {
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
