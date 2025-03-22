import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하세요>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        String result = "삼각형이 될 수 없습니다.";
        if (a + b > c && a + c > b && b + c > a) {
            result = "삼각형이 됩니다.";
        }
        System.out.println(result);
    }
}