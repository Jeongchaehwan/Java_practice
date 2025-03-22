import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count = 0; // 입력된 정수의 개수를 저장하는 변수
        int sum = 0;   // 입력된 정수의 합을 저장하는 변수
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
        int n = scanner.nextInt(); // 첫 번째 정수 입력

        while (n != -1) { // -1이 입력될 때까지 반복
            sum += n;     // 입력된 정수를 sum에 더함
            count++;      // 입력된 정수의 개수를 1 증가
            n = scanner.nextInt(); // 다음 정수 입력
        }

        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.print("정수의 개수는 " + count + "개이며 ");
            System.out.println("평균은 " + (double) sum / count + "입니다.");
        }

        scanner.close();
    }
}