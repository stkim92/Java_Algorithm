

import java.util.*;

public class Main{
	String Arr[];
	char charArr[];
	public static void main(String[] args){
		Main test = new Main();
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		in.nextLine();
		test.Arr = new String[input];
		
		for(int i=0; i<input; i++){
			test.Arr[i] = in.nextLine();
			//in.nextLine();
		}
		
		//System.out.println("after : "+test.change(test.Arr[0]));
		
		for(int i=0; i<input; i++){
			test.Arr[i] = test.change(test.Arr[i]);
			System.out.println(test.Arr[i]);
			//in.nextLine();
		}
		
		
		
	}
	
	/*public char[] change(String _input){
		charArr = _input.toCharArray();
		for(int i=0; i<charArr.length; i++){
			if(charArr[i] == 'R'){
				charArr[i] = 'G';
				System.out.println("�ٲﰪ :" + charArr[i]);
			}
		}
		String charStr = charArr[0]+charArr[1];
		return charArr;
	}*/
	
	public String change(String _input){
		String chStr;
		chStr = _input.replace("R", "G");
		return chStr;
	}
	
	

	
}
	
	
