public class Seven_Dwarves {

	public static void main(String[] args) {
		int dw1=27,dw2=3,dw3=4,dw4=8,dw5=18,dw6=30,dw7=10,dw8=16,dw9=2;
		//check dw1
		if(dw8+dw9+dw3+dw4+dw5+dw6+dw7 == 100)
			System.out.println("dw1,dw2 Is Fake");
		if(dw8+dw2+dw9+dw4+dw5+dw6+dw7 == 100)
			System.out.println("dw1,dw3 Is Fake");
		if(dw8+dw2+dw3+dw9+dw5+dw6+dw7 == 100)
			System.out.println("dw1,dw4 Is Fake");
		if(dw8+dw2+dw3+dw4+dw9+dw6+dw7 == 100)
			System.out.println("dw1,dw5 Is Fake");
		if(dw8+dw2+dw3+dw4+dw9+dw9+dw7 == 100)
			System.out.println("dw1,dw6 Is Fake");
		if(dw8+dw2+dw3+dw4+dw5+dw6+dw9 == 100)
			System.out.println("dw1,dw7 Is Fake");
		if(dw7+dw2+dw3+dw4+dw5+dw6+dw9 == 100)
			System.out.println("dw1,dw8 Is Fake");
		if(dw7+dw2+dw3+dw4+dw5+dw6+dw8 == 100)
			System.out.println("dw1,dw9 Is Fake");
		if(dw7+dw2+dw3+dw4+dw5+dw6+dw8 == 100)
			System.out.println("dw1,dw9 Is Fake");
		//check dw2
		if(dw1+dw8+dw9+dw4+dw5+dw6+dw7 == 100)
			System.out.println("dw2,dw3 Is Fake");
		if(dw1+dw8+dw3+dw9+dw5+dw6+dw7 == 100)
			System.out.println("dw2,dw4 Is Fake");
		if(dw1+dw8+dw3+dw9+dw9+dw6+dw7 == 100)
			System.out.println("dw2,dw5 Is Fake");
		if(dw1+dw8+dw3+dw4+dw9+dw9+dw7 == 100)
			System.out.println("dw2,dw6 Is Fake");
		if(dw1+dw8+dw3+dw4+dw9+dw9+dw9 == 100)
			System.out.println("dw2,dw7 Is Fake");
		if(dw1+dw9+dw3+dw4+dw5+dw6+dw7 == 100)
			System.out.println("dw2,dw8 Is Fake");
		if(dw1+dw8+dw3+dw4+dw5+dw6+dw7 == 100)
			System.out.println("dw2,dw9 Is Fake");
		//check dw3
		if(dw1+dw2+dw8+dw9+dw5+dw6+dw7 == 100)
			System.out.println("dw3,dw4 Is Fake");
		if(dw1+dw2+dw8+dw9+dw5+dw6+dw7 == 100)
			System.out.println("dw3,dw5 Is Fake");
		if(dw1+dw2+dw8+dw4+dw5+dw9+dw7 == 100)
			System.out.println("dw3,dw6 Is Fake");
		if(dw1+dw2+dw8+dw4+dw5+dw6+dw9 == 100)
			System.out.println("dw3,dw7 Is Fake");
		if(dw1+dw2+dw7+dw4+dw5+dw6+dw9 == 100)
			System.out.println("dw3,dw8 Is Fake");
		if(dw1+dw9+dw8+dw4+dw5+dw6+dw7 == 100)
			System.out.println("dw3,dw9 Is Fake");
		//check dw4
		if(dw1+dw2+dw3+dw8+dw9+dw6+dw7 == 100)
			System.out.println("dw4,dw5 Is Fake");
		if(dw1+dw2+dw3+dw8+dw5+dw9+dw7 == 100)
			System.out.println("dw4,dw6 Is Fake");
		if(dw1+dw2+dw3+dw8+dw5+dw6+dw9 == 100)
			System.out.println("dw4,dw7 Is Fake");
		if(dw1+dw2+dw3+dw7+dw5+dw6+dw9 == 100)
			System.out.println("dw4,dw8 Is Fake");
		if(dw1+dw2+dw3+dw8+dw5+dw6+dw7 == 100)
			System.out.println("dw4,dw9 Is Fake");
		//check dw5
		if(dw1+dw2+dw3+dw4+dw8+dw9+dw7 == 100)
			System.out.println("dw5,dw6 Is Fake");
		if(dw1+dw2+dw3+dw4+dw8+dw6+dw9 == 100)
			System.out.println("dw5,dw7 Is Fake");
		if(dw1+dw2+dw3+dw4+dw7+dw6+dw9 == 100)
			System.out.println("dw5,dw8 Is Fake");
		if(dw1+dw2+dw3+dw4+dw8+dw6+dw7 == 100)
			System.out.println("dw5,dw9 Is Fake");
		//check dw6
		if(dw1+dw2+dw3+dw4+dw5+dw8+dw9 == 100)
			System.out.println("dw6,dw7 Is Fake");
		if(dw1+dw2+dw3+dw4+dw5+dw7+dw9 == 100)
			System.out.println("dw6,dw8 Is Fake");
		if(dw1+dw2+dw3+dw4+dw5+dw7+dw8 == 100)
			System.out.println("dw6,dw9 Is Fake");
		//check dw7
		if(dw1+dw2+dw3+dw4+dw5+dw6+dw9 == 100)
			System.out.println("dw7,dw8 Is Fake");
		if(dw1+dw2+dw3+dw4+dw5+dw8+dw6 == 100)
			System.out.println("dw7,dw9 Is Fake");
		//check dw8,9
		if(dw1+dw2+dw3+dw4+dw5+dw6+dw7 == 100)
			System.out.println("dw8,dw9 Is Fake");
	}

}
