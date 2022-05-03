import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JobLeadsList jobs = new JobLeadsList();

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        String companyName;
        String contactName;
        String contactNumber;
        String jobTitle;
        String jobDescription;

        do {
            System.out.println("\n1 - Add lead to head of list");
            System.out.println("2 - Add lead to tail of list");
            System.out.println("3 - Delete a lead");
            System.out.println("4 - Print list from head to tail");
            System.out.println("5 - Print list from tail to head");
            System.out.println("6 - Exit");

            System.out.print("\nEnter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    System.out.print("Enter company name: ");
                        companyName = sc.next();
                    System.out.print("Enter contact name: ");
                        contactName = sc.next();
                    System.out.print("Enter contact phone: ");
                        contactNumber = sc.next();
                    System.out.print("Enter job title: ");
                        jobTitle = sc.next();
                    System.out.print("Enter job description: ");
                        jobDescription = sc.next();

                    jobs.add_to_front(companyName, contactName, contactNumber, jobTitle, jobDescription);
                    break;

                case 2:
                    System.out.print("Enter company name: ");
                        companyName = sc.next();
                    System.out.print("Enter contact name: ");
                        contactName = sc.next();
                    System.out.print("Enter contact phone: ");
                        contactNumber = sc.next();
                    System.out.print("Enter job title: ");
                        jobTitle = sc.next();
                    System.out.print("Enter job description: ");
                        jobDescription = sc.next();

                    jobs.add_to_tail(companyName, contactName, contactNumber, jobTitle, jobDescription);
                    break;

                case 3:
                    System.out.print("Enter company name: ");
                        companyName = sc.next();
                    System.out.print("Enter job title: ");
                        jobTitle = sc.next();

                    jobs.remove_lead(companyName, jobTitle);
                    break;

                case 4:
                    System.out.println("\nList from head to tail: ");
                        jobs.print_head_to_tail();
                    break;

                case 5:
                    System.out.println("\nList from tail to head: ");
                        jobs.print_tail_to_head();
                    break;

                default:
                    System.out.println("Error: Please enter a valid choice(1 thru 6)");
                    break;
            }
        } while (choice != 6);
    }
}
