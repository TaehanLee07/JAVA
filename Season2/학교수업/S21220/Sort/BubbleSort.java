package Sort;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 7, 5, 4, 3, 1 };

		System.out.println("Array Length : " + arr.length);

		System.out.print("초기 값 : ");
		for (int arrs : arr) {
			System.out.print(arrs + " ");
		}
		System.out.println();
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.print(i + " 회전 ");
			for (int arrs : arr) {
				System.out.print(arrs + " ");
			}
			System.out.println();
		}

	}
}
