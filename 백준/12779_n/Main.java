import java.util.*;

public class Main{
	public static void main(String[] args){
		Main test = new Main();
		int resultCount =0;
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int input1 = in.nextInt();
		int yacNum =0;
		
		
		for(int i= input+1; i<=input1; i++){
			
			yacNum = test.YacSu(i);
			if(yacNum % 2 == 1){ //��� ������ Ȧ����
				resultCount++;
				//System.out.println(yacNum);
			}
			//System.out.println(resultCount);
			
		}
		System.out.println(resultCount+"/"+(input1-input));
		
		
	}
	
	public int YacSu(int _input){ //��ǲ�� ��� ����
		int count =0;
		for(int i=1; i<=_input; i++){
			if((_input % i) ==0){
				count ++;
				
			}
		}
		return count;
	}
}
