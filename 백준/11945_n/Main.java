/*
���� �˰���
No. 11718
Writed by st

����
�Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է� 
�Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. �� ���� 100���ڸ� ���� ������, �� ���� �־����� �ʴ´�.
��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.

��� 
�Է¹��� �״�� ����Ѵ�.

���� �Է�
Hello
Baekjoon
Online Judge

���� ���
Hello
Baekjoon
Online Judge

ps. ������ �Է� ��, ��Ʈ��+c�� ���� �Է��� �����ϸ� �Էµ� �������� �״�� ��µȴ�.
    �̶�, BufferedReader�� �ƴ� Scanner�� ����ϸ� ��Ʈ��+c�� �ϸ� ��Ÿ�ӿ���? ����ó���ǹǷ� �̷�����
	BufferedReader�� ����~!
*/

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException { 
	
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		long input = in.nextInt();
		long input1 = in.nextInt();
		
		if( input == 0){
			return;
		}
		in.nextLine();
		
		if( input1 >10 ){
			return;
		}
		
		String getData[] = new String[input];
	
		for(int i=0; i<input; i++){
			getData[i] = in.nextLine();
			//sb.append(getData[i]);
		}
		
		
		//System.out.println(sb.reverse());
		
		
		
		try{
		for(int i=0; i<input; i++){
			getData[i] = new StringBuffer(getData[i]).reverse().toString();
			System.out.println(getData[i]);
			
		}
		
		/*
		for(int i=0;i<input; i++){
			for(int j=getData[i].length()-1; j>= 0; j--){
				System.out.print(getData[i].charAt(j));
			}
			System.out.println();
		}
		*/
		
		}
		
		catch(Exception e){
			System.out.println("����");
		}
		
		
	}
}