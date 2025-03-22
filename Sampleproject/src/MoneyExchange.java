import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 금액 입력받기
        System.out.print("금액을 입력하세요: ");
        int amount = scanner.nextInt();
        scanner.close();

        // 각 화폐 단위
        int[] units = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        String[] unitNames = {"오만 원권", "만 원권", "천 원권", "오백 원", "백 원", "오십 원", "십 원", "일 원"};

        // 결과 출력
        System.out.println("\n변환 결과:");
        for (int i = 0; i < units.length; i++) {
            int count = amount / units[i]; // 해당 화폐 단위의 개수
            amount %= units[i]; // 남은 금액 업데이트
            if (count > 0) {
                System.out.println(unitNames[i] + " " + count + (i < 3 ? "매" : "개"));
            }
        }
    }
}
