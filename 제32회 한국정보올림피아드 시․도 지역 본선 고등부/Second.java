/*
32ȸ �ѱ����� �ø��ǾƵ� �õ� ���� 15�� ����
No. 11718
Writed by st

������ ������ ����

*/
import java.util.*;

public class Second{
	
	private int Arr[][];
	private int getData[]= new int[2];
	private int inpuNum;
	private int result[];
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		Second test = new Second();
		test.inpuNum = in.nextInt();
		test.result = new int[test.inpuNum];
		in.nextLine();
		
		while(test.inpuNum < 1 || test.inpuNum >200000){
				System.out.println("�ٽ� �Է�");
				test.inpuNum = in.nextInt();
		}
			
		test.initialize();
		test.cal();
		
		test.printOut();
	}
	
	// �ʱ�ȭ 
	public void initialize(){
		Arr = new int[inpuNum][2];	
		for(int i=0; i<inpuNum; i++){
			for(int j=0; j<2; j++){
				getData[j] = in.nextInt(); // ���͸� �Է¹��� �ʾ� �������� �Է� 2�� �Է°���
				Arr[i][j] = getData[j];
					
				}
			}
		}
		
	
	
	// ��� 
	public void cal(){
		for(int i =0; i<inpuNum; i++){
			for(int j=0; j<inpuNum; j++){
				if(Arr[i][0] != Arr[j][0] && Arr[i][1] > Arr[j][1]){
					result[i] += Arr[j][1];
					
				}
			}
		}
	}
	
	public void printOut(){
		for(int i=0; i<inpuNum; i++){
			System.out.println(result[i]);
		}
	}
}