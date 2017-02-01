/*
32회 한국정보 올림피아드 시도 본선 15년 고등부
No. 11718
Writed by st

문제요약
1-20까지의 카드가 있다 
[1.3]의 입력이 주어지면
3,2,1,4,5,6,7,8,9 ...
이렇게 출력되도록 한다. (해당 구간만 리버스)

입력 
10개의 구간을 입력받는다. 한줄에 한구간씩 ex) 1 2 

출력 
섞인 카드 20개 출력

예제 입력
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


예제 출력
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
			test.getData[i] = in.nextInt(); // 엔터를 입력받지 않아 연속으로 입력 2번 입력가능 
			}
			in.nextLine();
			
			while(test.getData[0]<1 || test.getData[1]>20 || test.getData[1] - test.getData[0] <0){
				System.out.println("다시 입력");
				for(int i=0; i<2; i++){
				test.getData[i] = in.nextInt(); // 엔터를 입력받지 않아 연속으로 입력 2번 입력가능 
				}
			}
			test.cal();
		}
		
		test.printOut();
	}
	
	//배열 초기화
	public void initialize(){ 
		for(int i=0; i<20; i++){ 
			Arr[i] = i+1;
		}
	}
	
	//출력 
	public void printOut(){
		for(int i=0; i<20; i++){ 
			System.out.println(Arr[i]);
		}
	}
	
	// 계산 메소드
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
	

	
	

