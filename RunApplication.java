import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] types = {"PS5", "XBOX", "NINTENDO SWITCH"};

        System.out.println("Select a console device type:");
        for (int i = 0; i < types.length; i++) {
            System.out.println((i + 1) + ". " + types[i]);
        }

        int choice;
        do {
            System.out.print("Enter choice (1-3): ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid. Enter choice (1-3): ");
                input.next();
            }
            choice = input.nextInt();
        } while (choice < 1 || choice > types.length);
        input.nextLine();

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        while (!input.hasNextInt()) {
            System.out.print("Invalid. Enter total amount of sales: ");
            input.next();
        }
        int sales = input.nextInt();

        ConsoleSales report = new ConsoleSales(types[choice - 1], store, sales);
        report.printReport();

        input.close();
    }
}
