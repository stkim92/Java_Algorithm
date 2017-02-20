import java.util.Scanner;

public class dh {

   public static void main(String args[]) {

      Scanner scan = new Scanner(System.in); //입력받을 스캐너 선언
      dh main = new dh();               //메소드 호출을 위한 객체 생성
      int cols = Integer.parseInt(scan.next()); //세로 길이 입력받음
      int rows = Integer.parseInt(scan.next()); //가로 길이 입력받음
      scan.nextLine();   //남은 줄바꿈문자 제거

      String[][] cols_contents = new String[cols][rows];   //입력받은 문자열을 저장할 2차원 배열 선언
      
      for (int i = 0; i < cols; i++) {   //입력받은 문자열을 쪼개서 2차원배열에 저장
         cols_contents[i] = scan.nextLine().split("");
      }
      main.cal(cols_contents, cols, rows);   //메소드 호출
      scan.close();   //스캐너 종료
   }

   public void cal(String[][] cols, int col, int row) { //입력받은 문자들, 세로길이, 가로길이를 매개변수로 입력받음
      for (int a = 0; a < col; a++) {    //세로길이
         for (int b = 0; b < row; b++) {   //가로길이
            System.out.print(cols[a][(row - 1) - b]);   //반대로 출력하는 부분
         }
         System.out.println("");   //줄바꿈을 위한 부분

      }

   }
}