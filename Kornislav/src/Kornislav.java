import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		int sq1,sq2,sq3,sq4,temp;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Input sq_1 : ");
		 sq1=scan.nextInt();
		 System.out.print("Input sq_2 : ");
		 sq2=scan.nextInt();
		 System.out.print("Input sq_3 : ");
		 sq3=scan.nextInt();
		 System.out.print("Input sq_4 : ");
		 sq4=scan.nextInt();
		 if(sq1>sq2){
		 temp=sq1;
		 sq1=sq2;
		 sq2=temp;
		 }
		 if(sq1>sq3){
		 temp=sq1;
		 sq1=sq3;
		 sq3=temp;
		 }
		 if(sq1>sq4){
		 temp=sq1;
		 sq1=sq4;
		 sq4=temp;
		 }
		 if(sq2>sq3){
		 temp=sq2;
		 sq2=sq3;
		 sq3=temp;
		 }
		 if(sq2>sq4){
		 temp=sq2;
		 sq2=sq4;
		 sq4=temp;
		 }
		 if(sq3>sq4){
		 temp=sq3;
		 sq3=sq4;
		 sq4=temp;
		 }
		 System.out.print("\nRectangle Area = : "+""+sq3+""+" * "+sq1+" = "+sq3*sq1);

	}

}
