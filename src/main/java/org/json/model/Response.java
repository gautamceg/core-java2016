package org.json.model;
public class Response {

    private Error error;
    private String summaryCode;
    private String message;

    public String getSummaryCode() {
        return summaryCode;
    }

    public void setSummaryCode(String summaryCode) {
        this.summaryCode = summaryCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String messsage) {
        this.message = messsage;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

}
