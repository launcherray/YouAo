import java.util.Scanner;
public class if2 { 
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("你年龄大于18...");
		} else {
			System.out.println("你的年龄小于18...");
		}

		System.out.println("continue...");
	}
}