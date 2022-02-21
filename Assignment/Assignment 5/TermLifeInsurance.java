public class TermLifeInsurance extends InsurancePolicy{

    private String beneficiary;
    private int term;
    private double termPayout;

    TermLifeInsurance(String name, String bName, int terms, double payout) {
        super(name); //policy Holder
        beneficiary = bName;
        term = terms;
        termPayout = payout;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getTermPayout() {
        return termPayout;
    }

    public void setTermPayout(double termPayout) {
        this.termPayout = termPayout;
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
    public String toString() {
        return
                "beneficiary: " + beneficiary + '\'' +
                ", term: " + term +
                ", termPayout: " + termPayout ;
    }
}
