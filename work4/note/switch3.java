import java.util.Scanner;
public class switch3 { 
	public static void main(String[] args) {
		double score = 1.1;
		if( score >= 0 && score <= 100) {
			switch ((int)(score / 60)) {
				case 0 :
					System.out.println("不合格");
					break;
				case 1 :
					System.out.println("合格");
					break;
				// default :
				// 	System.out.println("输入有误");
			}
		} else {
			System.out.println("输入的成绩在0-100");
		}

		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入月份");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5: 
				System.out.println("这是春季");
				break;
			case 6:
			case 7:
			case 8: 
				System.out.println("这是夏季");
				break;
			case 9:
			case 10:
			case 11: 
				System.out.println("这是秋季");
				break;
			case 1:
			case 2:
			case 12: 
				System.out.println("这是冬季");
				break;
			default :
				System.out.println("你输入的月份不对(1-12)");
		}


	}
}