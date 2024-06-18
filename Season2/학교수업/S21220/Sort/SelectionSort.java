package Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int dims[] = { 4, 5, 7, 2, 3, 1 };
		System.out.println("Array Length : " + dims.length);

		System.out.print("초기 값 : ");
		for (int dim : dims) {
			System.out.print(dim + " ");
		}
		System.out.println();
		for (int i = 0; i < dims.length; i++) {
			for (int j = i+1; j < dims.length; j++) {
				int min = i;
				if (dims[j] < dims[min]) {
					min = j;
					if (min == j) {
						int temp = dims[i];
						dims[i] = dims[min];
						dims[min] = temp;						
					}
					
				}
			}

			System.out.print(i+1 + " 회전 ");
			for (int dim : dims) {
				System.out.print(dim + " ");
			}
			System.out.println();
		}
	}
}
