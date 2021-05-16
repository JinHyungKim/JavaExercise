import java.util.Random;
import java.util.Scanner;

class JavaExercise20_1{
	public static void main(String[] args){
	int start_num;
	int finish_num;
	
	Scanner sc = new Scanner(System.in);

	System.out.print("시작범위 지정: ");
	start_num = sc.nextInt();
	System.out.print("종료범위 지정: ");
	finish_num = sc.nextInt();

	Random rand = new Random();
	int gap = finish_num - start_num;
	for(int i=0; i<10; i++){
		System.out.println((rand.nextInt(gap+1))+start_num);
	}
	}
}
