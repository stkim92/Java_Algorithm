import java.util.*;

public class Main{
	
	int arrInt[];
	public static void main(String[] args){
		Main test = new Main();
		Scanner in = new Scanner(System.in);	
		
		int result =0;
		String str;
		int result1 =0;
		
		String input = in.nextLine();
		
		while(Integer.parseInt(Character.toString(input.charAt(0))) != 0){
			result = test.stringToIntSum(input); // ��Ʈ���� ��Ʈ �迭�� �ְ�,
			while(result > 9){
				str = Integer.toString(result);
				result = test.stringToIntSum(str);
			}
			System.out.println(result);
			input = in.nextLine();
		}
	}
	
	public int stringToIntSum(String _input){
		int length = _input.length();
		arrInt = new int[length];
		int result =0;
		for(int i=0; i<length; i++){
			arrInt[i] = Integer.parseInt(Character.toString(_input.charAt(i)));
		}
		for(int i=0; i<length; i++){ // ���ڸ��� ����
			result += arrInt[i];
		}
		return result;
		
	}
}