public class a_2Darray3 { 
	public static void main(String[] args) {
		int[][] arr = new int[3][]; 
		
		for(int i = 0; i < arr.length; i++) {
		
			arr[i] = new int[i + 1]; 

			for(int j = 0;  j < arr[i].length; j++) {
				arr[i][j] = i + 1;//赋值
			}

		}
		System.out.println("=====arr元素=====");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}