import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		 int gleft=1,gcenter=0,gright=0,temp,i;
		 String swap;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter Value : ");
		 swap = scan.next();
		 for(i=0;i<swap.length();i++){
		 if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
		 temp=gleft;
		 gleft=gcenter;
		 gcenter=temp;
		 }
		 else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
		 temp=gcenter;
		 gcenter=gright;
		 gright=temp;
		 }
		 else{
		 temp=gleft;
		 gleft=gright;
		 gright=temp;
		 }
		 }
		 if(gleft == 1) System.out.println("Coin is in gleft glass");
		 else if(gcenter == 1) System.out.println("Coin is in gcenter glass");
		 else System.out.println("Coin is in gright glass");

	}

}
