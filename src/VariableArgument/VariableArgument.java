package VariableArgument;

public class VariableArgument {
	void display(int...x)
	{
		System.out.println("Element are: ");
		for(int i=0;i<x.length;i++)
		{
			  System.out.print(x[i] +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VariableArgument a =new VariableArgument();
		   int arr[]= {34,45,67,89,32};
		   a.display(45,56);
		   a.display(4,5,6,6,7,77,7);
		   a.display(45,56,4,523,434);
		   a.display();
		   a.display(arr);
		   
	} 

}
