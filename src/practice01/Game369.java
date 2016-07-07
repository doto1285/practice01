package practice01;

public class Game369 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			String sNum = String.valueOf(i);
			char[] temp = sNum.toCharArray();
			boolean isclap = false;
			for (int j : temp) {
				if (j == '3' || j == '6' || j == '9') {
					if (!isclap) {
						isclap = true;
						System.out.print(i + " 짝");
					} else {
						System.out.print("짝");
					}
				}
			}
			if(isclap) {
				System.out.println();
			}
			isclap = false;
		}
	}
}