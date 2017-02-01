/*
백준 알고리즘
No. 11718
Writed by st

문제
입력 받은 대로 출력하는 프로그램을 작성하시오.

입력 
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다.
또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

출력 
입력받은 그대로 출력한다.

예제 입력
Hello
Baekjoon
Online Judge

예제 출력
Hello
Baekjoon
Online Judge

ps. 여러줄 입력 후, 컨트롤+c를 눌러 입력을 종료하면 입력된 여러줄이 그대로 출력된다.
    이때, BufferedReader가 아닌 Scanner를 사용하면 컨트롤+c가 하면 런타임오류? 예외처리되므로 이럴때는
	BufferedReader로 하자~!
*/

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String getData[] = new String[100];
		String getLine;
		int count =0;

		while( (getLine = in.readLine()) != null )
		{
			getData[count] = getLine;
			count++;
		}
		
		for(int i=0; i<count; i++){
			System.out.println(getData[i]);
		}
	}
}