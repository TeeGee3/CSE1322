public class InsufficientFund extends Exception{
    private String message;

    public InsufficientFund(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

