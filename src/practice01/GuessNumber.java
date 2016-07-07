package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		System.out.println("수를 결정하였습니다. 맞추어 보세요");

		int min = 1;
		int max = 100;
		int count = 1;

		while (true) {
			System.out.println(min + "-" + max);
			System.out.print(count + ">>");
			int num = scanner.nextInt();
			if (num == k) {
				System.out.println("맞았습니다.\n다시하시겠습니까(y/n)>>");
				String answer = scanner.next();
				if (answer.equals("y")) {
					k = r.nextInt(100) + 1;
					min = 1;
					max = 100;
					count = 0;
					System.out.println("수를 결정하였습니다. 맞추어 보세요");
				} else if (answer.equals("n")) {
					break;
				} else {
					System.out.println("에러값 입력");
					break;
				}
			} else if (num > k) {
				System.out.println("더 낮게");
				max = num;
			} else {
				System.out.println("더 높게");
				min = num;
			}
			count++;
		}
		scanner.close();
	}
}