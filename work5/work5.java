public class work5 { 
	public static void main(String[] args) {
		int[] arr = new int[10]; 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}

		System.out.println("arr的元素：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println("\narr的元素(倒序)：");
		for(int i = arr.length -1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		double sum = arr[0];
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++ ) {

			sum += arr[i]; 

			if( max < arr[i]) {//max不是最大值就变化
				max = arr[i];
				maxIndex = i;
			}
		}

		System.out.println("\nmax=" + max + " maxindex=" + maxIndex);
		System.out.println("\naverage=" + (sum / arr.length));

		int findNum = 8;
		int index = -1; 
		for(int i = 0; i < arr.length; i++) {
			if(findNum == arr[i]) {
				System.out.println("找到" + findNum + " 下标为" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("没有找到" + findNum );
		}	
	}
}