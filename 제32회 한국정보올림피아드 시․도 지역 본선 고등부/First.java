/*
32ȸ �ѱ����� �ø��ǾƵ� �õ� ���� 15�� ����
No. 11718
Writed by st

�������
1-20������ ī�尡 �ִ� 
[1.3]�� �Է��� �־�����
3,2,1,4,5,6,7,8,9 ...
�̷��� ��µǵ��� �Ѵ�. (�ش� ������ ������)

�Է� 
10���� ������ �Է¹޴´�. ���ٿ� �ѱ����� ex) 1 2 

��� 
���� ī�� 20�� ���

���� �Է�
5 10
9 13 
1 2 
3 4 
5 6 
1 2 
3 4 
5 6 
1 20 
1 20


���� ���
1 2 3 4 10 9 8 7 13 12 11 5 6 14 15 16 17 18 19 20 

*/
import java.util.*;

public class First{

	public int getData[]= new int[2];
	public int Arr[] = new int[20];
	public int loop =0;
	public int temp =0;

    public static void main(String arg[]){
		First test = new First();
		Scanner in = new Scanner(System.in);
		test.initialize();
		
    	for(int j=0; j<10; j++){
			for(int i=0; i<2; i++){
			test.getData[i] = in.nextInt(); // ���͸� �Է¹��� �ʾ� �������� �Է� 2�� �Է°��� 
			}
			in.nextLine();
			
			while(test.getData[0]<1 || test.getData[1]>20 || test.getData[1] - test.getData[0] <0){
				System.out.println("�ٽ� �Է�");
				for(int i=0; i<2; i++){
				test.getData[i] = in.nextInt(); // ���͸� �Է¹��� �ʾ� �������� �Է� 2�� �Է°��� 
				}
			}
			test.cal();
		}
		
		test.printOut();
	}
	
	//�迭 �ʱ�ȭ
	public void initialize(){ 
		for(int i=0; i<20; i++){ 
			Arr[i] = i+1;
		}
	}
	
	//��� 
	public void printOut(){
		for(int i=0; i<20; i++){ 
			System.out.println(Arr[i]);
		}
	}
	
	// ��� �޼ҵ�
	public void cal(){ 
		if((getData[1] - getData[0]) % 2 == 1){
				
				loop = (getData[1] - getData[0])/2 +1 ;
				
				
				for(int i=0; i<loop; i++){
					temp = Arr[getData[0]+i-1];
					Arr[getData[0]+i-1] = Arr[getData[1] -i-1];
					Arr[getData[1] -i-1] = temp;
				}
			} else{
				loop = (getData[1] - getData[0])/2;
				for(int i=0; i<loop; i++){
					temp = Arr[getData[0]+i-1];
					Arr[getData[0]+i-1] = Arr[getData[1] -i-1];
					Arr[getData[1] -i-1] = temp;
				}
			}
	}

}
	

	
	

