public class assign { 
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = n1;

		n2 = 80;
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);

		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		arr2[0] = 10;

		System.out.println("====arr1的元素====");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("====arr2的元素====");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}