public class HealthInsurancePolicy extends InsurancePolicy implements iDeductible{

    private double deductibleLimit;
    private double totalDeductiblePaid;
    private double coPayment;
    private double totalCoPaymentPaid;
    private double totalOutOfPocket;




    HealthInsurancePolicy(String name, double deductibleLimit, double coPayment, double totalOutOfPocket) {
        super(name); //policy holder
        this.deductibleLimit = deductibleLimit;
        totalDeductiblePaid = 0;
        this.coPayment = coPayment;
        this.totalOutOfPocket = totalOutOfPocket;
        totalCoPaymentPaid = 0;
    }

    @Override
    public String getPolicyHolder() {
        return super.getPolicyHolder();
    }

    @Override
    public void setPolicyHolder(String policyHolder) {
        super.setPolicyHolder(policyHolder);
    }

    public double getDeductibleLimit() {
        return deductibleLimit;
    }

    public void setDeductibleLimit(double deductibleLimit) {
        this.deductibleLimit = deductibleLimit;
    }

    public double getTotalDeductiblePaid() {
        return totalDeductiblePaid;
    }

    public void setTotalDeductiblePaid(double totalDeductiblePaid) {
        this.totalDeductiblePaid = totalDeductiblePaid;
    }

    public double getCoPayment() {
        return coPayment;
    }

    public void setCoPayment(double coPayment) {
        this.coPayment = coPayment;
    }

    public double getTotalCoPaymentPaid() {
        return totalCoPaymentPaid;
    }

    public void setTotalCoPaymentPaid(double totalCoPayment) {
        this.totalCoPaymentPaid = totalCoPayment;
    }

    public double getTotalOutOfPocket() {
        return totalOutOfPocket;
    }

    public void setTotalOutOfPocket(double totalOutOfPocket) {
        this.totalOutOfPocket = totalOutOfPocket;
    }

    @Override
    void selectPolicyCoverage() {
        System.out.println("selecting policy coverages");
    }

    @Override
    void calculatePremium() {
        System.out.println("calculating and updating premium");
    }


    @Override
    public boolean hasMetDeductible() {
        boolean result;

        if(totalDeductiblePaid>=deductibleLimit){
            result = true;
        } else{
            result = false; }

        return result;
    }

    @Override
    public boolean hasMetTotalOutOfPocket() {
        boolean result;

        if((totalDeductiblePaid + totalCoPaymentPaid) >= totalOutOfPocket){
            result = true;
        } else{
            result = false; }

        return result;
    }

    @Override
    public String toString() {
        return "Met Deductible: "+ hasMetDeductible() + ", Met Total Out-of-Pocket: "+hasMetDeductible();
//                "Deductible Limit: " + deductibleLimit +
//                ", total Deductible Paid: " + totalDeductiblePaid +
//                ", Co-payment: " + coPayment +
//                ", Total Co-payment Paid: " + totalCoPaymentPaid +
//                ", Total Out Of Pocket: " + totalOutOfPocket;
    }
}
