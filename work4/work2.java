
import java.util.Scanner;
public class work2 {
 
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个数：");
    int a = sc.nextInt();
    if(a>0){
    	System.out.println("a大于零");
    }
    else if(a==0){
    	System.out.println("a等于零");
    }
    else{
    	System.out.println("a小于零");
    }
    }
}