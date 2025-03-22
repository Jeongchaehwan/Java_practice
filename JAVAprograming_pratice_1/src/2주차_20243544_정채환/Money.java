import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하세요>>");
        int amount = scanner.nextInt();
        scanner.close();
        
        int man5 = amount / 50000;
        amount %= 50000;

        int man1 = amount / 10000;
        amount %= 10000;

        int chun1 = amount / 1000;
        amount %= 1000;

        int bag5 = amount / 500;
        amount %= 500;

        int bag1 = amount / 100;
        amount %= 100;

        int sip5 = amount / 50;
        amount %= 50;

        int sip1 = amount / 10;
        amount %= 10;

        int won1 = amount;
        System.out.println("오만 원권 " + man5 + "매");
        System.out.println("만 원권 " + man1 + "매");
        System.out.println("천 원권 " + chun1 + "매");
        System.out.println("오백 원 " + bag5 + "개");
        System.out.println("백 원 " + bag1 + "개");
        System.out.println("오십 원 " + sip5 + "개");
        System.out.println("십 원 " + sip1 + "개");
        System.out.println("일 원 " + won1 + "개");
    }
}
