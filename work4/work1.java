public class work1 { 

	public static void main(String[] args) {

		double money = 100000;
		int count = 0; 
		while(true) { 
			if(money > 50000) { 
				money *= 0.95; 
				count++;
			} else if(money >=1000) {
				money -= 1000;
				count++;
			} else { 
				break;
			}
		}
		System.out.println("100000 可以过 " + count + " 路口..");
	}
}