import java.util.Scanner;
//ȣ���� �Ⱦ��ϴ� �߰���, ����, �������

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
		System.out.print("����, ü�� , ���� ������ 3���� �����Է�>>");
		
		me.math=scan.nextInt();
		me.sciece=scan.nextInt();
		me.english=scan.nextInt();
		
		System.out.print("����� : " + me.average());
		
	}	
}

