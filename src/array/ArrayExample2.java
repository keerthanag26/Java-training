package array;

public class ArrayExample2 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] array1 = new int[3][2];
		int k=1;
		
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				array1[i][j]=k++;
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}

	}
}
