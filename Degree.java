package week2;
import java.util.Scanner;

public class Degree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.화씨->섭씨");
		System.out.println("2.섭씨->화씨");
		System.out.println("==============================");
		System.out.println("번호 선택:");
		int menu = sc.nextInt();
		
		String print = (menu ==1) ? "화씨온도를 입력하세요:"	:"섭씨온도를 입력하세요";
		System.out.print(print);
		double degree =  sc.nextDouble();
		
		double result=(menu==1)? degree+100: degree/10;
		
		System.out.println("변환된 온도"+result);
		
		
		
		
		
		
		
		
	}

}
