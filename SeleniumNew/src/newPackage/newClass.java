package newPackage;

public class newClass {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIVIX"));
	}

	public static int romanToInt(String s) {
		System.out.println("new changes");
		int intValue = 0;
		char[] ch = s.toCharArray();
		int charIndex;
		for (charIndex = 0; charIndex < ch.length; charIndex++) {
			if (ch[charIndex] == 'I') {
				if (!(charIndex==ch.length-1) && (ch[charIndex + 1] == 'V')) {
					intValue += 4;
					charIndex++;
					continue;
				} else if (!(charIndex==ch.length-1) && (ch[charIndex + 1] == 'X')) {
					intValue += 9;
					charIndex++;
					continue;
				}
				intValue += 1;
			} else if (ch[charIndex] == 'V') {
				intValue += 5;
			} else if (ch[charIndex] == 'X') {
				if (!(charIndex==ch.length-1) && (ch[charIndex + 1] == 'L')) {
					intValue += 40;
					charIndex++;
					continue;
				} else if (!(charIndex==ch.length-1) && (ch[charIndex + 1] == 'C')) {
					intValue += 90;
					charIndex++;
					continue;
				}
				intValue += 10;
			} else if (ch[charIndex] == 'L') {
				intValue += 50;
			} else if (ch[charIndex] == 'C') {
				if (!(charIndex==ch.length-1) && (ch[charIndex + 1] == 'D')) {
					intValue += 400;
					charIndex++;
					continue;
				} else if (!(charIndex==ch.length-1) && (ch[charIndex + 1] == 'M')) {
					intValue += 900;
					charIndex++;
					continue;
				}
				intValue += 100;
			} else if (ch[charIndex] == 'D') {
				intValue += 500;

			} else if (ch[charIndex] == 'M') {
				intValue += 1000;
			}
		}
		return intValue;
	}
}
