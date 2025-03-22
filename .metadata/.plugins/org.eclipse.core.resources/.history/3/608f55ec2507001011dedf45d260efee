package homework;
import java.util.Scanner;

/*
switch에서는 if else문과 다르게 switch문 내에서 break를 사용하면 switch문만 사용이 끝남, 즉 while문은 계속 작동하기에 다시 계산식을 입력하세요. 
라는 문구가 출력됨, 그러므로 switch안에 while문을 끝낼 수 있는 방법을 넣어둬야함. 여기서는 넣어둔 것이 exit를 true로 정의하고 if문을 사용하여 while문 반복을 끝내는 방식. 
연산자를 잘못 입력했을 경우에는 재시작시키고 싶기에 이런 방식을 택했음.
*/

public class homework2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("계산식을 입력하세요 (예시 3.6 + 10.5) 또는 '0'을 입력하면 종료됩니다: ");

            double a = scanner.nextDouble();

            if (a == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String operator = scanner.next();
            double b = scanner.nextDouble();
            boolean exit = false; // while 문을 종료할지 여부를 저장하는 변수

            switch (operator) {
                case "+":
                    System.out.println("결과: " + (a + b));
                    exit = true;
                    break;
                case "-":
                    System.out.println("결과: " + (a - b));
                    exit = true;
                    break;
                case "*":
                    System.out.println("결과: " + (a * b));
                    exit = true;
                    break;
                case "/":
                    if (b != 0) {
                        System.out.println("결과: " + (a / b));
                    } else {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                    }
                    exit = true;
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하세요.");
                    break;
            }
            if (exit) {
                break; // while 문을 종료합니다.
            }
        }
/*
 * 만약 3.3+2.3처럼 공백 없이 입력할 경우 오류가 발생함.
 * 오류 처리 방법도 고민해볼 것.
 */
        scanner.close();
    }
}