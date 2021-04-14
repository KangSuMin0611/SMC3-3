import java.util.Random;
import java.util.Scanner;

public class Numberr {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("10°³ÀÇ ·£´ı ¼ıÀÚ Áß ÇÏ³ª¸¦ ¸ÂÃçº¸¼¼¿ä(1 ~ 50): ");
		int diff = 0;
		int a = scan.nextInt();
		int lotto[] = new int[10];
		
		for(int i=0; i<lotto.length; i++){
				lotto[i] = (int)(Math.random()*50+1);
				System.out.print(lotto[i]+" ");
		}
		
		for(int j = 0; j<10; j++ ){
			if(lotto[j]== a){
				System.out.println("´çÃ·!");
				diff=1;
			}
		}
		if(diff==0){
			System.out.println("²Î ¼ö¹Î¾Æ!!!!");
		}
	}
}
