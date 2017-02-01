/*
Store Credit
Writed by st

예제 입력
100 "얼마있는지"
3 "상품개수"
5 25 75 "상품 가격"

예제 출력
Case #1: 2 3

ps. 테스트 케이스 입력은 안받았습니다.

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
		//testCase = in.nextInt();  //테스트 케이스
		//in.nextLine();
		
		test.credit = in.nextInt(); // 크레딧
		test.itemNum = in.nextInt(); // 상품 개수
		test.Arr = new int[test.itemNum]; // 아이템 개수 만큼 배열 생성
		
		for(int i=0; i<test.itemNum; i++){ // 상품 입력
			test.Arr[i] = in.nextInt();
		}
		
		test.cal();
		
	}
	
	// 계산
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