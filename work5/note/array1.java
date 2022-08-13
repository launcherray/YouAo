public class array1 { 
	public static void main(String[] args) { 
		double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 88.8,1.1,5.6,100};
		double totalWeight = 0;
		for( int i = 0; i < hens.length; i++) {
			totalWeight += hens[i];
		}
		System.out.println("总体重=" + totalWeight + "平均体重=" + (totalWeight / hens.length) );		
	}
}