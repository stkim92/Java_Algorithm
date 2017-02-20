/*
백준 알고리즘
No. 13900
Writed by st

문제 
N개의 정수 중 서로 다른 위치의 두 수를 뽑는 모든 경우의 두 수의 곱의 합을 구하라.
예를 들어 N = 3이고 주어진 정수가 2, 3, 4일 때, 두 수를 뽑는 모든 경우는 (2, 3), (2, 4), (3, 4)이며 이 때 각각의 곱은 6, 8, 12이다.
따라서 총합은 26이다.

입력 
첫 번째 줄에는 입력 받을 정수의 개수 N(2 ≤ N ≤ 100,000)
두 번째 줄에는 N 개의 정수가 주어진다. 이 때 입력 받는 정수들의 범위는 0이상 10,000 이하이다.

출력 
모든 경우의 곱의 합을 출력한다.

예제 입력
3
2 3 4

예제 출력
26

ps. 예제 입력 출력은 잘되나, 오답으로 처리됨;;
*/

import java.util.*;

public class Main{

    public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int result[] = new int[input];
		
		int input1[] = new int[4];
		
		for(int j=0; j<input; j++){
			for(int i=0; i<4; i++){
				input1[i] = in.nextInt();
			}
			
			int couponNum = (input1[1] / input1[0])*input1[3] ;
			int couponWithChickenNum1 = (couponNum / input1[2]);
			int couponWithChickenNum2 = (couponNum / input1[2]);
			
			int remainCoupon = (couponNum % input1[2]);
			
			couponNum= couponWithChickenNum2*input1[3] + remainCoupon;
			
			int plusChicken =0;

			while(couponNum>=input1[2]){
				
				plusChicken = couponNum/input1[2];
				couponWithChickenNum2 += plusChicken;
				remainCoupon = couponNum%input1[2];
				couponNum = plusChicken*input1[3] +remainCoupon;
			}
			System.out.println(couponWithChickenNum2-couponWithChickenNum1);
		}
			
			

	
	}
	
	
}