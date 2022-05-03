public class NegativeDollarAmounts extends Exception{
    private String message;

    public NegativeDollarAmounts(String message) {
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