import java.util.Scanner;
//호수가 싫어하는 견과류, 버섯, 마요네즈

class Grade{
	
	int math;
	int sciece;
	int english;
		 	
	public int average(){
		return (math + sciece + english)/3;
	}
	
}

public class Prob_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Grade me = new Grade(); 
		System.out.print("수학, 체육 , 영어 순으로 3개의 점수입력>>");
		
		me.math=scan.nextInt();
		me.sciece=scan.nextInt();
		me.english=scan.nextInt();
		
		System.out.print("평균은 : " + me.average());
		
	}	
}

