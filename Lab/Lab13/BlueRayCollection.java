public class BlueRayCollection {
    private Node head = null;
    int size = 0;

    public void add(String title, String director, int releaseYear, double cost){
        Node newNode = new Node(new BlueRayDisk(title, director, releaseYear, cost));

        if (head == null) {
            head = newNode;
        }
        else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
        ++size;
    }

    public void show_all() {
        if (head == null) {
            System.out.println("None Available");
        }
        else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.BRDisk.toString());
                currentNode = currentNode.next;
            }
        }
    }
}
