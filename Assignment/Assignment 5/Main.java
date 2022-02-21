import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userChoice;

        ArrayList<InsurancePolicy> policyList = new ArrayList<>();

        do {
            System.out.println("1 – Create Health Insurance Policy\n" +
                    "2 – Create Term-Life Insurance Policy\n" +
                    "3 – Exit\n");
            System.out.print("Enter Choice: ");
            userChoice = sc.nextInt();
            String none = sc.nextLine();
            System.out.print("\n");


            switch (userChoice) {

                case 1: //health insurance
                    System.out.println("Enter name of policy holder:");
                        String policyHolderName = sc.nextLine();
                    System.out.println("Enter deductible amount: ");
                        double deductible = sc.nextDouble();
                    System.out.println("Enter co-payment amount: ");
                        double copay = sc.nextDouble();
                    System.out.println("Enter total out-of-pocket amount: ");
                        double totalooP = sc.nextDouble();

                    HealthInsurancePolicy h1 = new HealthInsurancePolicy(policyHolderName,deductible, copay, totalooP );
                    policyList.add(h1);
                        break;

                case 2:
                    System.out.println("Enter name of policy holder:");
                        policyHolderName = sc.nextLine();
                    System.out.println("Enter name of beneficiary: ");
                        String beneficiaryName = sc.nextLine();
                    System.out.println("Enter number of years in term: ");
                        int terms = sc.nextInt();
                            sc.nextLine();
                    System.out.println("Enter amount of payout: ");
                        double payout = sc.nextDouble();
                        System.out.println();

                    TermLifeInsurance t1 = new TermLifeInsurance(policyHolderName,beneficiaryName,terms, payout );
                    policyList.add(t1);
                        break;

                case 3:
                    if(userChoice == 3){
                        for(InsurancePolicy x : policyList){
                            System.out.print(x.getPolicyHolder()+", "+x.getPolicyNumber()+", ");
                            if(x instanceof HealthInsurancePolicy) {
                                System.out.print(x);

                            }
                            System.out.println();
                        }
                    } break;
                default: System.out.println("Error: Please enter valid input\n");
            }

        } while (userChoice != 3);



        }









    }

