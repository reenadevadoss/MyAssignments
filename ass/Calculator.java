package ass;

public class Calculator {
	int a=10;
	int b=20;
	int c=a+b;
	public void add() {
		
	
	System.out.println(c);

	}
	public void sub() {
		int d=b-a;
		System.out.println(d);
		

	}
	public int multiply(int a,int b) {
		return a*b;

	}

	public static void main(String[] args) 
	{
		Calculator cc=new Calculator();
		cc.add();
		cc.sub();
		System.out.println(cc.multiply(10,20));
	

	}

}
