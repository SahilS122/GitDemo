package newPackage;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(backspaceCompare("j##xfix", "j###xfix"));
	}

	public static boolean backspaceCompare(String s, String t) {
		StringBuffer sbf = new StringBuffer(s);
		StringBuffer tbf = new StringBuffer(t);
		for (int i = 0; i < sbf.length(); i++) {

			if (i == 0 && sbf.charAt(i) == '#') {
				sbf.replace(i, i + 1, "");
				i = -1;
			} else if (sbf.charAt(i) == '#') {
				sbf.replace(i - 1, i + 1, "");
				i = -1;
			}
		}
		for (int i = 0; i < tbf.length(); i++) {

			if (i == 0 && tbf.charAt(i) == '#') {
				tbf.replace(i, i + 1, "");
				i = -1;
			} else if (tbf.charAt(i) == '#') {
				tbf.replace(i - 1, i + 1, "");
				i = -1;
			}

		}
		System.out.println(sbf);
		System.out.println(tbf);
		return sbf.toString().equals(tbf.toString());
	}

}
