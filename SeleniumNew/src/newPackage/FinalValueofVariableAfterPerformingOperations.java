package newPackage;

public class FinalValueofVariableAfterPerformingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"X++","++X","--X","X--"};
		System.out.println(finalValueAfterOperations(a));
	}

	public static int finalValueAfterOperations(String[] operations) {
		int sum = 0;
		for (int i = 0; i < operations.length; i++) {
			switch (operations[i]) {
			case "++X":
				sum += 1;
				break;
			case "X++":
				sum += 1;
				break;
			case "--X":
				sum -= 1;
				break;
			case "X--":
				sum -= 1;
				break;
			}
		}
		return sum;
	}
}
