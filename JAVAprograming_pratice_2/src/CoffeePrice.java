import java.util.Scanner;
public class CoffeePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 커피를 드릴까요? \n");
		String order = scanner.next();
		int price = 0;
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 6500;
			break;
		case "아메리카노":
			price = 4500;
			break;
		default:
			System.out.println("그런 메뉴는 없습니다!");
		}
		if(price != 0)
			System.out.printf("%s는 %d원 입니다.", order, price);
		scanner.close();
	}
}
