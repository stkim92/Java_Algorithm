/*
백준 알고리즘
No. 13908
Writed by st

웅찬이는 근성이 대단한 도둑이다. 그래서 금고를 털 때, 모든 조합을 눌러본다.
예를 들어 비밀번호가 3글자 라는 사실을 알 때, 000, 001, 002, 003, … 998, 999의 모든 조합을 눌러본다.
그러나 웅찬이는 선견지명이 있어서 비밀번호에 어떤 숫자가 들어가는지 일부 알 수 있다.
예를 들어 3글자 비밀번호에 0이 들어감을 안다면 999 와 같이 0이 들어가지 않는 수는 가능성이 없다.
그러나 000, 012, 030과 같은 수는 가능하다.
비밀번호의 길이와 선견지명으로 알게된 비밀번호의 일부 숫자가 주어질 때, 모든 가능한 비밀번호의 개수를
출력하는 프로그램을 작성하시오.

입력 
첫줄에 비밀번호의 길이 n (1 ≤ n ≤ 7), 선견지명으로 알게된 비밀번호에 들어가는 수 m(0 ≤ m ≤ n) 이 주어지고, 
둘째 줄에 m개의 서로 다른 숫자(0~9)가 주어진다.

출력 
가능한 모든 비밀번호의 개수를 출력한다.

예제 입력
2 1
7

예제 출력
19

ps. 브루트포스를 통해, 식을 만들고 그대로 코딩했음
*/
import java.util.*;

public class Main{

	public static void main(String[] args){
		Main test = new Main();
		Scanner in = new Scanner(System.in);
		int inputNum;
		int inputSec;
		int seNum;
		int result1 =0;
		
		inputNum = in.nextInt();
		inputSec = in.nextInt();
		
		int Arr2[] = new int[inputSec]; // 선경지명 길이
		int Arr3[];
		
		for(int i=0; i< inputSec; i++){
			seNum = in.nextInt();
			Arr3 = new int[inputSec];
			Arr3[i] = seNum;
		}
		
		for(int i=0; i< Arr2.length+1; i++){
			if( i %2 ==0){
				result1 = result1 + test.combination(Arr2.length,i)*test.sejeGop(i,inputNum);
				
			} else if( 1 %2 ==1){
				result1 = result1 - test.combination(Arr2.length,i)*test.sejeGop(i,inputNum);
			}
		}
		System.out.println(result1);
	}
	
	public int combination(int n, int r) {
		if(n == r || r == 0) return 1;
		else return combination(n - 1, r - 1) + combination(n - 1, r);
	}
	
	public int sejeGop(int _input, int _jaritSu){
		int sejegop = 10-_input;
		int sejegop1 = 10-_input;


		for(int i=0; i< _jaritSu-1; i++){
			sejegop *= sejegop1;
			
		}

		return sejegop;
	}


}