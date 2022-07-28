package Assignment2;

public class Calculator {
	 public void addTwoNum() {
		 int a=99;
		 int b=10;
		 int c=a+b;
		 System.out.println("Addition of two number : " +c);
		  }
	 public void subTwoNum() {
		 int e=444;
		 int f=55;
		 int g=e-f;
		 System.out.println("Subtraction of two number : " +g);
		 }
	 public void multiTwoNum() {
		 int i=999;
		 int j=39;
		 int k=i*j;
		 System.out.println("multiplication of two number : " +k);
		 }
	 public void diviTwoNum() {
		 float x=5678;
		 float y=63;
		 float z=x/y;
		 System.out.println("Divition of two number : " +z);

	 }
    public static void main(String args[]) {
    	Calculator cal=new Calculator();
    	cal.addTwoNum();
    	cal.subTwoNum();
    	cal.multiTwoNum();
    	cal.diviTwoNum();
    
    }
}
