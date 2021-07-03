import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static void outputHelp() {
        System.out.println("Choose one of the following actions: ");
        System.out.print("""
                1. Find the elements
                2. Add the elements
                3. Open a file
                4. Close the file and read from console
                5. Exit
                Your action:\s""");
    }

    public static void main(String[] args) throws FileNotFoundException {
        HashTable<String> table = new HashTable<>(10);
        Scanner scanner = new Scanner(System.in);
        String[] elems;
        int action = 0;

        outputHelp();
        while ((action = scanner.nextInt()) != 5) {
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.print("Input the elements to find: ");
                    elems = scanner.nextLine().split(" ");
                    for (String elem : elems)
                        System.out.println("Elem " + elem + " contains " + table.count(elem) + " times");
                    break;
                case 2:
                    System.out.print("Input the string: ");
                    elems = scanner.nextLine().split(" ");
                    for (String elem : elems) {
                        System.out.println("Adding elem " + elem);
                        table.add(elem);
                    }
                    break;
                case 3:
                    System.out.print("Input the filename: ");
                    String fileName = scanner.nextLine();
                    File file = new File(fileName);
                    if (file.exists())
                        scanner = new Scanner(file);
                    else
                        System.out.println("Wrong file");
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("Switched successfully");
                    break;
                default:
                    break;
            }

            table.output();
            System.out.println();
            outputHelp();
        }
    }

}
