/*
Store Credit
Writed by st

���� �Է�
100 "���ִ���"
3 "��ǰ����"
5 25 75 "��ǰ ����"

���� ���
Case #1: 2 3

ps. �׽�Ʈ ���̽� �Է��� �ȹ޾ҽ��ϴ�.

*/
import java.util.*;

public class StoreCredit{
	
	private int Arr[];
	private int itemNum = 0;
	private int indexI = 0;
	private int indexJ = 0;
	private int credit = 0;	
		
	public static void main(String[] args){
		StoreCredit test = new StoreCredit();
		Scanner in = new Scanner(System.in);
		
		//int testCase = 0;
		//testCase = in.nextInt();  //�׽�Ʈ ���̽�
		//in.nextLine();
		
		test.credit = in.nextInt(); // ũ����
		test.itemNum = in.nextInt(); // ��ǰ ����
		test.Arr = new int[test.itemNum]; // ������ ���� ��ŭ �迭 ����
		
		for(int i=0; i<test.itemNum; i++){ // ��ǰ �Է�
			test.Arr[i] = in.nextInt();
		}
		
		test.cal();
		
	}
	
	// ���
	public void cal(){
		for(int i=0; i<itemNum; i++){
			for(int j=0; j<itemNum; j++){
				if(i != j){
					if(Arr[i] + Arr[j] == credit){
						indexI = i+1;
						indexJ = j+1;
						System.out.println("Case #1: " + indexI +" " +indexJ);
						return; 
					}
				}
			}
		}
	}
}