import java.util.Scanner;

public class dh {

   public static void main(String args[]) {

      Scanner scan = new Scanner(System.in); //�Է¹��� ��ĳ�� ����
      dh main = new dh();               //�޼ҵ� ȣ���� ���� ��ü ����
      int cols = Integer.parseInt(scan.next()); //���� ���� �Է¹���
      int rows = Integer.parseInt(scan.next()); //���� ���� �Է¹���
      scan.nextLine();   //���� �ٹٲ޹��� ����

      String[][] cols_contents = new String[cols][rows];   //�Է¹��� ���ڿ��� ������ 2���� �迭 ����
      
      for (int i = 0; i < cols; i++) {   //�Է¹��� ���ڿ��� �ɰ��� 2�����迭�� ����
         cols_contents[i] = scan.nextLine().split("");
      }
      main.cal(cols_contents, cols, rows);   //�޼ҵ� ȣ��
      scan.close();   //��ĳ�� ����
   }

   public void cal(String[][] cols, int col, int row) { //�Է¹��� ���ڵ�, ���α���, ���α��̸� �Ű������� �Է¹���
      for (int a = 0; a < col; a++) {    //���α���
         for (int b = 0; b < row; b++) {   //���α���
            System.out.print(cols[a][(row - 1) - b]);   //�ݴ�� ����ϴ� �κ�
         }
         System.out.println("");   //�ٹٲ��� ���� �κ�

      }

   }
}