public class LinkedList {
    private Node head;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

    }

    // Method to add a new node at the end of the list
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        if (head.value == value) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    // Method to move a node to a new position
    public void moveNodePointer(int oldIndex, int newIndex) {
        if (head == null || oldIndex == newIndex) return;

        Node currentNode = head;
        Node previousNode = null;
        Node nodeToMove = null;
        Node previousOfMovingNode = null;

}