package week2;

import java.util.Scanner;


public class Degree2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("온도를 입력하세요: ");
        double degree = sc.nextDouble();

        System.out.println("섭씨-> 화씨");
        System.out.println("화씨->섭씨");
        System.out.println("=====================");
        int choice = sc.nextInt();

        double convertedTemperature = 0;

        switch (choice) {
            case 1:
                convertedTemperature = (degree * 9 / 5) + 32;
                System.out.println(degree + " 섭씨 " + convertedTemperature + " 화씨입니다.");
                break;
            case 2:
                convertedTemperature = (degree - 32) * 5 / 9;
                System.out.println(degree + " 화씨 " + convertedTemperature + " 섭씨입니다.");
                
            
        }
    }
}


