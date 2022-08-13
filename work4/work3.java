
import java.util.Scanner;
public class work3 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("输入年份:");
    int year=scan.nextInt();
    if(year%4==0 && year%100!=0){
        System.out.print("不是闰年");
    }else 
    if(year%400==0){
        System.out.print("是闰年");
    }   
    scan.close();
    }
}
