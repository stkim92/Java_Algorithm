/*
���� �˰���
No. 13908
Writed by st

�����̴� �ټ��� ����� �����̴�. �׷��� �ݰ� �� ��, ��� ������ ��������.
���� ��� ��й�ȣ�� 3���� ��� ����� �� ��, 000, 001, 002, 003, �� 998, 999�� ��� ������ ��������.
�׷��� �����̴� ���������� �־ ��й�ȣ�� � ���ڰ� ������ �Ϻ� �� �� �ִ�.
���� ��� 3���� ��й�ȣ�� 0�� ���� �ȴٸ� 999 �� ���� 0�� ���� �ʴ� ���� ���ɼ��� ����.
�׷��� 000, 012, 030�� ���� ���� �����ϴ�.
��й�ȣ�� ���̿� ������������ �˰Ե� ��й�ȣ�� �Ϻ� ���ڰ� �־��� ��, ��� ������ ��й�ȣ�� ������
����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է� 
ù�ٿ� ��й�ȣ�� ���� n (1 �� n �� 7), ������������ �˰Ե� ��й�ȣ�� ���� �� m(0 �� m �� n) �� �־�����, 
��° �ٿ� m���� ���� �ٸ� ����(0~9)�� �־�����.

��� 
������ ��� ��й�ȣ�� ������ ����Ѵ�.

���� �Է�
2 1
7

���� ���
19

ps. ���Ʈ������ ����, ���� ����� �״�� �ڵ�����
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
		
		int Arr2[] = new int[inputSec]; // �������� ����
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