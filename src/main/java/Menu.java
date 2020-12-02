import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        boolean quit = false;
        printMenu();
        while (!quit){
            System.out.println("Welcome to TeamEfforts contact list");
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    contanctBook.search();
                    break;
                case 2:
                    addNewFriend();
                    break;
                case 3:
                    contactBook.showContactList();
                    break;
                case 4:
                    contactBook.delete();
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }

        private static void printMenu(){
            System.out.println("\nVälj\n");
            System.out.println(
                    "1 - Search for a friend\n" +
                            "2 - Add new friend\n" +
                            "3 - Show your friends list\n" +
                            "4 - Delete a friend\n" +
                            "5 - Show the menu again\n");
        }

    }
}
