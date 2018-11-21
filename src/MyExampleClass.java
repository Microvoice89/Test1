import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

public class MyExampleClass {
	
	
	ArrayList <Double> num;
	
	public void Init () {System.out.println( num.get(2));}
	public MyExampleClass() {
		num=new ArrayList();
		for (double i=0;i<10;i++)
		num.add(i);
		
		
		// TODO Auto-generated constructor stub
	}
	public Double getNum(int indx) {return num.get(indx);}
	public static void main(String[]args) {
		
		MyExampleClass e =new MyExampleClass();
System.out.println(e.getNum(2));
	}
}