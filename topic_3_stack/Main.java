package topic_3_stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack(5);

       System.out.println("Good day! Hello.");
       

    }

    while true {
        System.out.println("Please choose what you want to do: "
                + "0. Size"
                + "1. Push"
                + "2. Pop"
                + "3. Exit");
            int choice = sc.nextint();

        switch(choice) {
            case 1;

            System.out.println("Size of stack is: " + stack.size());
            System.out.println("---------------------------------");
            break;
            

        }
                
        

    }

}