/*
백준 알고리즘
No. 13900
Writed by st

문제 
N개의 정수 중 서로 다른 위치의 두 수를 뽑는 모든 경우의 두 수의 곱의 합을 구하라.
예를 들어 N = 3이고 주어진 정수가 2, 3, 4일 때, 두 수를 뽑는 모든 경우는 (2, 3), (2, 4), (3, 4)이며 이 때 각각의 곱은 6, 8, 12이다.
따라서 총합은 26이다.

입력 
첫 번째 줄에는 입력 받을 정수의 개수 N(2 ≤ N ≤ 100,000)
두 번째 줄에는 N 개의 정수가 주어진다. 이 때 입력 받는 정수들의 범위는 0이상 10,000 이하이다.

출력 
모든 경우의 곱의 합을 출력한다.

예제 입력
3
2 3 4

예제 출력
26

ps. 예제 입력 출력은 잘되나, 오답으로 처리됨;;
*/

import java.util.*;

public class Main{

	private int Arr[];

    public static void main(String arg[]){
		
		Main test = new Main();
		
		long finResult =0;
		int getData = in.nextInt();
		
		Scanner in = new Scanner(System.in);
		in.nextLine();
		
		test.Arr = new int[getData];
		
		for (int i = 0; i < test.Arr.length; i++) {
            test.Arr[i] = in.nextInt();
         }

		for(int i=test.Arr.length-1; i>0; i--){
			finResult += test.cal(i);
		}
		System.out.println(finResult);
	}
	
	public int cal(int _a){
		int result =0;
		for(int i=_a-1; i<Arr.length-1; i++){
			result += Arr[_a-1]* Arr[i+1];
		}
		return result;
	}
	
	/*public int[] parsing(String _inputString,int _inputInt){
		
		String array[] = new String[_inputInt];
		int array2[] = new int[_inputInt];
		array = _inputString.split(" ");
		for(int i=0; i<_inputInt; i++){
			array2[i] = Integer.parseInt(array[i]);
			
		}

		return array2;
	}*/

}