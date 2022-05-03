import java.util.*;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Bank_Account> Bank_Accounts = new ArrayList<>();
        boolean isExit = false;

        while (!isExit) {
            System.out.println("\n1 - Create an account");
            System.out.println("2 - Delete an account");
            System.out.println("3 - Make An Account Deposit");
            System.out.println("4 - Make An Account Withdrawal");
            System.out.println("5 - Check An Account Balance");
            System.out.println("6 - Exit\n");
            int input;

            System.out.print("Enter Choice: ");

            try {
                input = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("\nError: Please enter a valid Choice(1 thru 6)");
                continue;
            }
            sc.nextLine();
            if (input < 1 || input > 6) {
                System.out.println("\nError: Please enter a valid Choice(1 thru 6)");
                continue;
            }

            try {
                switch (input) {
                    case 1://create an account
                        System.out.print("\nEnter Customer name: ");
                            String customer_name = sc.nextLine();
                        System.out.print("Enter User ID: ");
                            String user_id = sc.nextLine();
                        System.out.print("Enter User Password: ");
                            String user_pw = sc.nextLine();

                        if (!(user_pw.length() >= 8 && user_pw.indexOf("*") != -1)) {
                            throw new InvalidPasswordFormat("Error: Must Enter a Valid Password\n");
                                //  "InvalidPasswordFormatException: Invalid Password Format");
                        }
                        Bank_Account new_account = new Checking_Account(customer_name, user_id, user_pw);
                        Bank_Accounts.add(new_account);
                        break;

                    case 2: //delete an account
                        System.out.print("\nEnter User ID: ");
                             user_id = sc.nextLine();
                        System.out.print("Enter User Password: ");
                             user_pw = sc.nextLine();

                        int indexToRemove = -1;

                        for (int i = 0; i < Bank_Accounts.size(); i++) {
                            if (Bank_Accounts.get(i).getUser_id().equals(user_id) && Bank_Accounts.get(i).getUser_pw().equals(user_pw)) {
                                indexToRemove = i;
                                break;
                            }
                        }
                        if (!(user_pw.length() >= 8 && user_pw.indexOf("*") != -1)) {
                            throw new InvalidPasswordFormat("Error: Must Enter a Valid User ID and Password\n");
                            //  "InvalidPasswordFormatException: Invalid Password Format");
                        }

                        if (indexToRemove == -1) {
                            throw new CustomerAccountNotFound("CustomerAccountNotFoundException: Customer Account Not Found");
                        }

                        Bank_Accounts.remove(indexToRemove);
                        Bank_Account.decrease_number_of_accounts();
                        break;

                    case 3: //make an account deposit
                        System.out.print("\nEnter User ID: ");
                            user_id = sc.nextLine();
                        System.out.print("Enter User Password: ");
                            user_pw = sc.nextLine();

                        int index = -1;

                        for (int i = 0; i < Bank_Accounts.size(); i++) {
                            if (Bank_Accounts.get(i).getUser_id().equals(user_id) && Bank_Accounts.get(i).getUser_pw().equals(user_pw)) {
                                index = i;
                                break;
                            }
                        }

                        if (!(user_pw.length() >= 8 && user_pw.indexOf("*") != -1)) {
                            throw new InvalidPasswordFormat("Error: Must Enter a Valid User ID and Password\n");
                            //  "InvalidPasswordFormatException: Invalid Password Format");
                        }


                        if (index == -1) {
                            throw new CustomerAccountNotFound("\nCustomerAccountNotFoundException: Customer Account Not Found");
                        }

                        System.out.print("Please enter dollar amount :");
                            double value = sc.nextDouble();
                                sc.nextLine();

                        if (value < 0) {
                            throw new NegativeDollarAmounts("\nError: Must Enter a Positive Dollar Amount\n" +
                                    "NegativeDollarAmountException: Negative Dollar Amount");
                        } else {
                            Bank_Accounts.get(index).deposit_Amount(value);
                        }
                        break;

                    case 4: //make an account withdrawal
                        System.out.print("\nEnter User ID: ");
                            user_id = sc.nextLine();
                        System.out.print("Enter User Password: ");
                            user_pw = sc.nextLine();

                        int indexExist = -1;

                        for (int i = 0; i < Bank_Accounts.size(); i++) {
                            if (Bank_Accounts.get(i).getUser_id().equals(user_id) && Bank_Accounts.get(i).getUser_pw().equals(user_pw)) {
                                indexExist = i;
                                break;
                            }
                        }

                        if (indexExist == -1) {
                            throw new CustomerAccountNotFound("\nCustomer Account Doesnt exist");
                        }

                        System.out.print("Please enter dollar amount : ");
                            double withdrawlvalue = sc.nextDouble();
                                sc.nextLine();

                        if (withdrawlvalue < 0) {
                            throw new NegativeDollarAmounts("\nNegative value cannot be Withdrawl");
                        } else {
                            if (Bank_Accounts.get(indexExist).getAccount_balance() < withdrawlvalue) {
                                throw new InsufficientFund("\nInsufficient Fund");
                            } else {
                                Bank_Accounts.get(indexExist).withdraw_Amount(withdrawlvalue);
                            }
                        }
                        break;

                    case 5: //check account balance
                        System.out.print("\nEnter User ID: ");
                            user_id = sc.nextLine();
                        System.out.print("Enter User Password: ");
                            user_pw = sc.nextLine();

                        boolean indexExi = false;

                        for (int i = 0; i < Bank_Accounts.size(); i++) {
                            if (Bank_Accounts.get(i).getUser_id().equals(user_id) && Bank_Accounts.get(i).getUser_pw().equals(user_pw)) {
                                System.out.println(Bank_Accounts.get(i).toString());
                                indexExi = true;
                            }
                        }

                        if (!indexExi) {
                            throw new CustomerAccountNotFound("\nCustomer Account Doesn't exist");
                        }
                        break;

                    case 6:
                        isExit = true;
                        break;
                }

            } catch (InvalidPasswordFormat e) {
                System.out.println(e.getMessage());
            } catch (CustomerAccountNotFound e) {
                System.out.println(e.getMessage());
            } catch (NegativeDollarAmounts e) {
                System.out.println(e.getMessage());
            } catch (InsufficientFund e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
