import java.util.Scanner;

public class Main {

    public static Main(String[] args) {

        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Hello! How are you?");
        System.out.println("-------------------");

        while true {

            System.out.println("\nKindly choose a number in the menu you want to do: "
                    + "\n1. Add Items"
                    + "\n2. Delete an Item"
                    + "\n3. Move/Swap an Item"
                    + "\n4. Exit");

            int userChoice = scanner.nextInt();
        }

    }
}