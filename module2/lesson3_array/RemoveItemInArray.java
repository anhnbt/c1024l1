import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (anhnb (anhnbt.it@gmail.com))
 * Date: 2025/01/08
 * Time: 19:52 PM
 */
public class RemoveItemInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int x = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                index_del = i;
            }
        }
        for (int i = index_del; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
