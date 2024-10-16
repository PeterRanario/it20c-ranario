package topic_4_queue;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    Queue customerQueue = new Queue();

    System.out.println("Hello! Good Day Ma'am/Sir!");
             
        while(true) {
                               
            System.out.println("Choose what you want:"
            + " 1. Display Queue."
            + " 2. Add Customer. "
            + " 3. Serve Customer."
            + " 4. Exit");

            int choices = sc.nextInt();
            switch(choices) {
                case 1:
                    System.out.println();
                    customerQueue.displayQueue();
                    break;

                case 2;
                    sc.nextLine();
                    System.out.println("Enter new customer: ");
                    String name = sc.nextLine();
                    System.out.println();
                    customerQueue.enqueue(new Customer(name));
                    break;
            }
        }
        
            
}
