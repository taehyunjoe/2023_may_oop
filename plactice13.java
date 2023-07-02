import java.util.Scanner;
public class plactice13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("1부터 100 사이의 숫자를 추측해보세요!");

        do {
            System.out.print("숫자를 입력하세요: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("더 큰 숫자를 추측해보세요!");
            } else if (guess > secretNumber) {
                System.out.println("더 작은 숫자를 추측해보세요!");
            } else {
                System.out.println("정답입니다! 축하합니다!");
                System.out.println("시도 횟수: " + attempts);
            }
        } while (guess != secretNumber);
    }
}
