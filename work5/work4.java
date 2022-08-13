public class work4 { 
	public static void main(String[] args) {

		int[] arr = {10, 12, 45, 90};
		int insertNum = 111;
		int index = -1; 

		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break; //找到位置后退出
			}
		}
		//判断index 的值
		if(index == -1) { //还没有找到位置
			index = arr.length;
		}
		//扩容
		int[] arrNew = new int[arr.length + 1];
		for(int i = 0, j = 0; i < arrNew.length; i++) {

			if( i != index ) { //把 arr的元素符直到 arrNew
				arrNew[i] = arr[j];
				j++;
			} else { 
				arrNew[i] = insertNum;
			}
		}
		arr = arrNew;
		System.out.println("插入后数组的元素：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}