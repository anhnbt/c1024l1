import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (anhnb (anhnbt.it@gmail.com))
 * Date: 2025/01/03
 * Time: 19:26 PM
 */
// PascalCase
public class HienThiLoiChao {

    // camelCase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // camelCase
        String name;
        do {
            System.out.println("Mời nhập vào tên của bạn: ");
            name = scanner.nextLine();
//            if (!name.equals("q")) {
//                System.out.printf("Xin chào, %s%n", name);
//            } else {
//                System.out.println("Chào tạm biệt!");
//            }

            System.out.println("Mời nhập năm sinh (dd/MM/yyyy):");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Mời nhập điểm toán: ");
            double math = scanner.nextDouble();
            System.out.println("========================");
//            System.out.printf("%s %s %.0f%n", name, dateOfBirth, math);
            System.out.println(name + " " + dateOfBirth + " " + math);
            System.out.println("========================");
        } while (!name.equals("q"));
    }
}
