public class for3 { 
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int start = 10;
		int end = 200;
		int t = 5; 
		for(int i = start; i <= end; i++) {
			if( i % t == 0) {
				System.out.println("i=" + i);
				count++;
				sum += i;
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
	}
}