import java.util.Scanner;

public class Student implements IMaths {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

         System.out.println("Enter any two integer values to perform addition");

         int a=kb.nextInt();

         int b=kb.nextInt();

         int s=a+b;

         System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

         System.out.println("Enter any two integer values to perform sub");

         int a=kb.nextInt();

         int b=kb.nextInt();

         int s=a-b;

         System.out.println("sub of "+a+" and "+b+" is "+s);

	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

         System.out.println("Enter any two integer values to perform mul");

         int a=kb.nextInt();

         int b=kb.nextInt();

         int s=a*b;

         System.out.println("Mul of "+a+" and "+b+" is "+s);

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

         System.out.println("Enter any two integer values to perform div");

         int a=kb.nextInt();

         int b=kb.nextInt();

         int s=a/b;

         System.out.println("Div of "+a+" and "+b+" is "+s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.add();
		s1.div();
		s1.mul();
		s1.sub();

	}

}
