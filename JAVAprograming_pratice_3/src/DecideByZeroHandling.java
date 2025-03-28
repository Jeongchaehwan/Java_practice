import java.util.InputMismatchException;
import java.util.Scanner;

public class DecideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("나뉨수를 입력하시오:");
			try {
				int dividend = scanner.nextInt();
				System.out.print("나눗수를 입력하시오:");
				int divisor = scanner.nextInt();

				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요!");
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
				scanner.nextLine(); // 버퍼에 남아있는 잘못된 입력 제거
			}
		}
		scanner.close();
	}
}