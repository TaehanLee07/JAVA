package Sort;


public class InsertionSort {

	public static void main(String[] args) {
		int dims[] = { 7, 5, 4, 3, 1 };
		System.out.println("Array Length : " + dims.length);

		System.out.print("초기 값 : ");
		for (int dim : dims) {
			System.out.print(dim + " ");
		}
		System.out.println();
		for (int i = 1; i < dims.length; i++) {
			for (int j = i; j > 0; j--) {
				if (dims[j-1] > dims[j]) {
					int temp = dims[j - 1];
					dims[j - 1] = dims[j];
					dims[j] = temp;
				}
			}

			System.out.print(i + " 회전 ");
			for (int dim : dims) {
				System.out.print(dim + " ");
			}
			System.out.println();
		}
	}
}
