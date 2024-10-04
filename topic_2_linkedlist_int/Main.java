import java.util.Scanner;

public class main{

    public static void main(String[] args){


        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

    }

    System.out.println("Hello Welcome.");
    System.out.println("--------------");

    while (true){

        System.out.println("\nPlease choose a number you want to do: "
                    + "\n1. Add Items"
                    + "\n2. Delete an Item"
                    + "\n3. Move/Swap an Item"
                    + "\n4. Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    
                    System.out.println("Enter 5 elements that you want to add: ");
                    for (int i = 0; i < 5; i++) {
                        int element = scanner.nextInt();
                        linkedList.add(element);
                    }
                    System.out.println("Current Linked List:");
                    linkedList.printList();
                    break;

            case 2:
                    
                    System.out.println("Enter the value of the item you want to delete: ");
                    int valueToDelete = scanner.nextInt();
                    linkedList.deleteByValue(valueToDelete);
                    System.out.println("Item deleted (if existed). Current Linked List:");
                    linkedList.printList();
                    break;

                case 3:
                    
                    System.out.println("Enter the index of the item you want to move: ");
                    int currentIndex = scanner.nextInt();
                    System.out.println("Enter the new index to move the item to: ");
                    int newIndex = scanner.nextInt();
                    linkedList.moveNodePointer(currentIndex, newIndex);
                    System.out.println("Item moved! Current Linked List:");
                    linkedList.printList();
                    break;

                case 4:
                    
                    System.out.println("Exiting... Goodbye!");
                    scanner.close(); // Closing the scanner
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }        

    }
