/*
���� �˰���
No. 13900
Writed by st

���� 
N���� ���� �� ���� �ٸ� ��ġ�� �� ���� �̴� ��� ����� �� ���� ���� ���� ���϶�.
���� ��� N = 3�̰� �־��� ������ 2, 3, 4�� ��, �� ���� �̴� ��� ���� (2, 3), (2, 4), (3, 4)�̸� �� �� ������ ���� 6, 8, 12�̴�.
���� ������ 26�̴�.

�Է� 
ù ��° �ٿ��� �Է� ���� ������ ���� N(2 �� N �� 100,000)
�� ��° �ٿ��� N ���� ������ �־�����. �� �� �Է� �޴� �������� ������ 0�̻� 10,000 �����̴�.

��� 
��� ����� ���� ���� ����Ѵ�.

���� �Է�
3
2 3 4

���� ���
26

ps. ���� �Է� ����� �ߵǳ�, �������� ó����;;
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