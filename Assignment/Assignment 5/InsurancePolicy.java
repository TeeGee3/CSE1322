public abstract class InsurancePolicy {

    private String policyHolder;
    private int policyNumber;
    private static int numberOfPolicies = 0;
    private double premium = 0;

//    InsurancePolicy(){
//       // policyHolder = "new";
//        premium = 0;
//        policyNumber = ++numberOfPolicies;
//    }

    InsurancePolicy(String name){
        setPolicyHolder(name);
        policyNumber = numberOfPolicies++;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }


    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public static int getNumberOfPolicies() {
        return numberOfPolicies;
    }

    public static void setNumberOfPolicies(int numberOfPolicies) {
        InsurancePolicy.numberOfPolicies = numberOfPolicies;
    }

    abstract void selectPolicyCoverage();
    abstract void calculatePremium();

    @Override
    public String toString() {
        return "Insurance Policy: " +
                "Policy Holder: " + policyHolder + '\'' +
                ", Policy Number: " + policyNumber +
                ", Premium: " + premium ;
    }
}
