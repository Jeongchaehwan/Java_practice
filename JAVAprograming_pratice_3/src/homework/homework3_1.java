package homework;

public class homework3_1 {

	public static void main(String[] args) {
        int[] numbers = new int[10]; // 정수를 10개 저장하는 배열 생성
		int sum = 0;
		
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 9) + 11; // 11~19 범위의 난수 생성
            sum += numbers[i];
        }

        // 배열에 저장된 정수를 출력하기
        System.out.print("랜덤한 정수들...");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
       
        // 평균 계산하는 함수
        double average = sum / (double) numbers.length;
        System.out.println("\n평균은 " + average);
	}

}
