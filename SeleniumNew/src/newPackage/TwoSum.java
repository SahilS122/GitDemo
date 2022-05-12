package newPackage;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,11,15, 7};
		System.out.println(twoSum(a, 9)[0]);
		System.out.println(twoSum(a, 9)[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		int i,j=0;
		for ( i = 0; i < nums.length; i++) {
			int sum = 0;
			if (i != nums.length) {

				for ( j = i+1; j < nums.length; j++) {
					sum=nums[i]+nums[j];
					if(sum==target) {
						break;
					}
				}
			}
			if(sum==target) {
				break;
			}
		}
		int [] indexes= {i,j};
		return indexes;
	}
}
