package homework;
import java.util.Scanner;

public class homework2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("계산식을 입력하세요 (예시 3.2 + 5.5) 또는 '0'을 입력하면 종료됩니다: ");

            double a = scanner.nextDouble();
//            첫번째 실수 확인하는 코드
            
            
            if (a == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
//            만약 A가 0 일 경우 프로그램을 종료하는 코드

            String operator = scanner.next(); // 연산자를 operator에 저장하는 코드
            double b = scanner.nextDouble(); // 두 번째 실수를 확인하는 코드

            // operator에 맞는 연산을 수행하는 코드
            if (operator.equals("+")) {
                System.out.println("결과: " + (a + b));
                break;
            } else if (operator.equals("-")) {
                System.out.println("결과: " + (a - b));
                break;
            } else if (operator.equals("*")) {
                System.out.println("결과: " + (a * b));
                break;
            } else if (operator.equals("/")) {
                if (b != 0) {
                    System.out.println("결과: " + (a / b));
                    break;
                } else {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    break;
                    // 0이 아닐 경우 나눗셈을 수행, 0일경우 0으로 나눌 수 없다고 출력.
                }
            } else {
                System.out.println("올바른 연산자를 입력하세요.");
                // 만약 + - * / 이 아닌 다른 문자를 입력했을 경우 올바른 연산자를 입해달라 하고 프로그램을 다시 시작함.
            }
        }

        scanner.close();
    }
}
