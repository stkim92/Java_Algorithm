/*
32회 한국정보 올림피아드 시도 본선 15년 고등부
No. 11718
Writed by st

문제는 폴더에 참고

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
				System.out.println("다시 입력");
				test.inpuNum = in.nextInt();
		}
			
		test.initialize();
		test.cal();
		
		test.printOut();
	}
	
	// 초기화 
	public void initialize(){
		Arr = new int[inpuNum][2];	
		for(int i=0; i<inpuNum; i++){
			for(int j=0; j<2; j++){
				getData[j] = in.nextInt(); // 엔터를 입력받지 않아 연속으로 입력 2번 입력가능
				Arr[i][j] = getData[j];
					
				}
			}
		}
		
	
	
	// 계산 
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