package homework;
import java.util.Scanner;

public class homework3_2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int rowA, colA, rowB, colB;

	        try {
	            // 행렬 크기 입력받기
	            System.out.print("두 행렬의 크기>> ");
	            rowA = scanner.nextInt();
	            colA = scanner.nextInt();
	            rowB = scanner.nextInt();
	            colB = scanner.nextInt();
	            
	            int[][] matrixA = new int[rowA][colA];
	            for (int i = 0; i < matrixA.length; i++) {
	                for (int j = 0; j < matrixA[i].length; j++) {
	                    matrixA[i][j] = (int) (Math.random() * 11); // 0~10 사이의 난수 생성
	                }
	            }
	            
	            int[][] matrixB = new int[rowB][colB];
	            for (int i = 0; i < matrixB.length; i++) {
	                for (int j = 0; j < matrixB[i].length; j++) {
	                    matrixB[i][j] = (int) (Math.random() * 11); // 0~10 사이의 난수 생성
	                }
	            }
	            
	            System.out.println("-- A 행렬 --");
	            for (int i = 0; i < matrixA.length; i++) {
	            	for (int j = 0; j < matrixA[i].length; j++) {
	            		System.out.printf("%02d ", matrixA[i][j]);
	            	}
	            	System.out.println();
	            }
	            
	            System.out.println("-- B 행렬 --");
	            for (int i = 0; i < matrixB.length; i++) {
	            	for (int j = 0; j < matrixB[i].length; j++) {
	            		System.out.printf("%02d ", matrixB[i][j]);
	            	}
	            	System.out.println();
	            }
	            
	            if (rowA == rowB && colA == colB) {
	                int row = matrixA.length, col = matrixA[0].length;
	            	int[][] result = new int[row][col];

	            	// A + B 계산
	            	for (int i = 0; i < row; i ++) {
	            		for(int j = 0; j < col; j++) {
	            			result[i][j] = matrixA[i][j] + matrixB[i][j];
	            		}
	            	}
	            	System.out.println("-- A + B --");
		            for (int i = 0; i < result.length; i++) {
		            	for (int j = 0; j < result[i].length; j++) {
		            		System.out.printf("%02d ", result[i][j]);
		            	}
		            	System.out.println();
		            }
		            
		            // A - B 계산
		            for (int i = 0; i < row; i ++) {
	            		for(int j = 0; j < col; j++) {
	            			result[i][j] = matrixA[i][j] - matrixB[i][j];
	            		}
	            	}
		            
		            System.out.println("-- A - B --");
		            for (int i = 0; i < result.length; i++) {
		            	for (int j = 0; j < result[i].length; j++) {
		            		System.out.printf("%02d ", result[i][j]);
		            	}
		            	System.out.println();
		            }
		            
	            } else {
	            	System.out.println("\n두 행렬의 크기가 달라 계산할 수 없습니다!");
	            }
	            
	    } catch (Exception e) {
	    	System.out.println("정수를 입력해줄래요?");
	    } finally {
	        scanner.close();
	    }
	}
}
