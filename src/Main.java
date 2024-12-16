//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        //Завдання 1
        HashSet<String>sets =new HashSet();
        Scanner scanner = new Scanner(System.in);
        int Max= 5;
        int a = 0;
        System.out.println("Введіть імена");
        while(Max>a){
            String set =scanner.nextLine();
            sets.add(set);
            ++a;
        }
        System.out.println(sets);
        System.out.println("Унікальні імена"+ sets.size());
        System.out.println("Marta?"+sets.contains("Marta"));
        //Завдання 3
        HashMap<String, String> phoneBook = new HashMap<>();
        while(true){
            System.out.println("1. Додайте запис");
            System.out.println("2. Пошук за імям");
            System.out.println("3. Видалити ");
            System.out.println("4.Кінець");
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Введіть ім'я: ");
                    String name = scanner.nextLine();
                    System.out.print("Введіть номер телефону: ");
                    String phone = scanner.nextLine();
                    phoneBook.put(name, phone);
                    System.out.println("Запис додано.");
                    break;
                case 2:
                    System.out.print("Введіть ім'я для пошуку: ");
                    name = scanner.nextLine();
                    System.out.println("Номер телефону: " + phoneBook.getOrDefault(name, "Запис не знайдено."));
                    break;

                case 3:
                    System.out.print("Введіть ім'я для видалення: ");
                    name = scanner.nextLine();
                    if (phoneBook.remove(name) != null) {
                        System.out.println("Запис видалено.");
                    } else {
                        System.out.println("Нема.");
                    }
                    break;

                case 4:
                    System.out.println("Кінець");
                    return;
            }
        }
    }
}