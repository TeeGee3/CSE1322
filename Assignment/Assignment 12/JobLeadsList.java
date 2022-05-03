public class JobLeadsList {
    private Node head; //a pointer which always points to the first node in the list
    private Node tail; //a pointer which always points to the last node in the list

    public JobLeadsList() {
        this.head = null;
        this.tail = null;
    }

    public void add_to_front(String companyName, String contactName, String contactNumber, String jobTitle, String jobDescription) {
        JobLead jl = new JobLead(companyName, contactName, contactNumber, jobTitle, jobDescription);
        Node n1 = new Node();

        n1.lead = jl;
        n1.next = null;
        n1.prev = null;

        if (tail == null) {
            tail = n1;
        }
        if (head == null) {
            head = n1;
        } else {
            n1.next = head;
            head.prev = n1;
            head = n1;
        }
        System.out.println("Node Added Successfully at Head..");
    }

    public void add_to_tail(String companyName, String contactName, String contactNumber, String jobTitle, String jobDescription) {
        JobLead jl = new JobLead(companyName, contactName, contactNumber, jobTitle, jobDescription);
        Node n1 = new Node();

        n1.lead = jl;
        n1.next = null;
        n1.prev = null;

        if (head == null) {
            head = n1;
        }
        if (tail == null) {
            tail = n1;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            n1.prev = temp;
            temp.next = n1;
            tail = n1;
        }

        System.out.println("Node Added Successfully at Tail..");
    }

    public void remove_lead(String companyName, String jobTitle) {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node currentNode = head;

            while (currentNode != null) {
                if (currentNode.lead.getCompanyName().matches(companyName) && currentNode.lead.getJobTitle().matches(jobTitle)) {
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }

            if (currentNode != null) {

                if (currentNode != head) {
                    Node previousNode = currentNode.prev;
                    previousNode.next = currentNode.next;
                } else {
                    head = currentNode.next;
                }

                if (currentNode != tail) {
                    Node nextNode = currentNode.next;
                    nextNode.prev = currentNode.prev;
                } else {
                    tail = currentNode.prev;
                }
                currentNode.next = null;
                currentNode.prev = null;
            } else {
                System.out.println("Required data does not found..");
            }
        }
    }

    public void print_head_to_tail() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node current = head;

            while (current != null) {
                System.out.println(current.lead);
                current = current.next;
            }
        }
    }

    public void print_tail_to_head() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node current = tail;

            while (current != null) {
                System.out.println(current.lead);
                current = current.prev;
            }
        }
    }
}
