import java.util.*;


public class Main{


	public static void main(String[] args){
		Main test = new Main();
		int[] arr = {4,4,4,4,4,6};
		test.combination(arr, 0, 5, 3, 0);
		//permutation("abcd");
		 Scanner in = new Scanner(System.in);
		 String input = in.nextLine();
		 int input1 = in.nextInt();
		 in.nextLine();
		 String Arr[] = new String[input1];
		 
		 for(int i=0; i<input1; i++){
			 Arr[i] = in.nextLine();
		 }
		 
		 
	}
	
	public static void permutation(String str) {

		permutation("", str);

	}



	private static void permutation(String prefix, String str) {

		int n = str.length();

		if (n == 0)

			System.out.println(prefix);

		else {

			for (int i = 0; i < n-1; i++)

				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));

		}

	}
	
	
	public static void combination(int[] arr, int index, int n, int r, int target) {
		if (r == 0) print(arr, index);
		else if (target == n) return;
		else {
			arr[index] = target; combination(arr, index + 1, n, r - 1, target + 1);
			combination(arr, index, n, r, target + 1);
			}
	}
			//end combination()
	public static void print(int[] arr, int length) {
		int result =0;
		for (int i = 0; i < length; i++){
			System.out.print(arr[i]);
			result += arr[i];
		}
		
		System.out.println(" "+result);
		} 


}
	
