package topic_4_queue;
import java.util.LinkedList;

public class Queue {

    private LinkedList<Customer> customers;

    public Queue() {
        customers = new LinkedList<>();
    }
    
    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public int size() {
        return customers.size();
    }

     public void enqueue(Customer customer) {
        customers.addLast(customer);
        System.out.println(customer.getName() + " has been added to the queue.");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {            
            System.out.print("Current queue: ");
            for (Customer customer : customers) {
                System.out.print(customer.getName() + " | ");
            }
            System.out.println();
        }
    }
}