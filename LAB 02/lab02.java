import java.util.Scanner;

public class lab02 {
    
    public static void main(String[] args) {
        String[] name_list = new String[1024]; 
        int pos = 0;

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Show all names");
            System.out.println("5. Exit");
            System.out.println("0. Press '0' to continue");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a name: ");
                    String name = sc.nextLine();
                    boolean isValid = true;
                    for (int i = 0; i <pos; i++) {
                        if (name_list[i].equals(name)) {
                            System.out.println("Name already exists. Try again.");
                            nameisValid = false;
                            break;
                        }
                    }
                    if (!nameisValid) {
                        break;
                    }
                    if (name.isEmpty() || name.length() > 100) {
                        System.out.println("Invalid name. Try again.");
                        break;
                    }
                    names[pos++] = name;
                    System.out.println("Name added successfully.");
                    break;
                case 2:
                    System.out.print("Enter a name to search: ");
                    name = sc.nextLine();
                    boolean search = false;
                    for (int i = 0; i < pos; i++) {
                        if (name_list[i].equals(name)) {
                            System.out.println("Name found.");
                            search = true;
                            break;
                        }
                    }
                    if (!search) {
                        System.out.println("Name not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter a name to remove: ");
                    name = sc.nextLine();
                    search = false;
                    for (int i = 0; i < pos; i++) {
                        if (names[i].equals(name)) {
                            for (int j = i; j < pos - 1; j++) {
                                names[j] = name_list[j + 1];
                            }
                            pos--;
                            System.out.println("Name removed successfully.");
                            search = true;
                            break;
                        }
                    }
                    if (!search) {
                        System.out.println("Name not found.");
                    }
                    break;
                case 4:
                    System.out.println("All names:");
                    for (int i = 0; i < pos; i++) {
                        System.out.println(name_list[i]);
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                }
            }
            while (choice != 5);
    System.out.println("Exiting program...");
  }
}





