import java.util.Scanner;
public class dh {

   public static void main(String args[]){
      
      dh quiz = new dh();
      int []first_input = new int [2];
      double val = 0;
      
      Scanner scan = new Scanner(System.in);
      
      for(int i=0; i<2;i++){
         first_input[i]=scan.nextInt();
         
      }
      scan.nextLine();

      
      quiz.switch_num(scan, first_input[1]);
      
      val = quiz.Calculate(first_input[0],first_input[1]);

      
      
      
      
      System.out.println((int)val);
      
   }
   public void switch_num(Scanner scan, int num){ //선경지명으로 알게 된 수

      for(int a =0; a<num; a++){
         scan.nextInt();
         
      }

      scan.nextLine();
      
   
      
   }
   public double Calculate(int total_length, int known_number_count){
      double sum =Math.pow(10,total_length);
      System.out.println("sum : "+sum);
      int count =9;
      for(int i=1; i<=known_number_count;i++){
         if(i%2==0){ //짝수
            System.out.println("i는 "+i+",이며 현재 짝수입니다");
            sum+=combination(known_number_count,i)*Math.pow(count, total_length);
            System.out.println("++ known number count is.."+known_number_count+"and i is "+i);
            System.out.println(known_number_count+"C"+i+"= "+combination(known_number_count,i)+"/ 제곱 :"+count+"^"+total_length+"= "+Math.pow(count, total_length));
            System.out.println("count is "+count);
            System.out.println("-----------------------------");
            count--;
            
         }
         else{
            System.out.println("i는 "+i+",이며 현재 홀수입니다");
            sum-=combination(known_number_count,i)*Math.pow(count,  total_length);
            System.out.println("-- known number count is.."+known_number_count+"and i is "+i);
            System.out.println(known_number_count+"C"+i+"= "+combination(known_number_count,i)+"/ 제곱 :"+count+"^"+total_length+"= "+Math.pow(count, total_length));
            System.out.println("count is "+count);
            System.out.println("-----------------------------");
            count--;
            
         }
      }
   
      return sum;
   }
   
   
   
      public int combination(int n, int r) {
      
      if(n == r || r == 0) return 1;
      else return combination(n - 1, r - 1) + combination(n - 1, r);
      
   }


}