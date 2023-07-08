
package code.Array;
import java.util.*;
public class Array2 {

	public static void main(String args[])
	{
		//index-> (position of an array start from zero)
		//{0:a,1:b,2:c} -: here 0,1,2 are indexes
		//q-: print arr[0] o/p-:a 
		int[] a=new int[5];
		//here new keyword is used to create new objects
		//i.e it will create the object in heap memory of size 5
		//lets see what will print if we don't put anything inside array
		System.out.println(a[1]);  //o/p-:0(i.e for integer val by default it takes 0)
		String [] arrayname=new String[5];
		System.out.println(arrayname[2]);  //o/p-:null(i.e for String val by default it takes null)
		//null-: special literal of a null type ie. you can cast it to any particular reference type but you can't create a null type
		//you can only assign null to non-primitives
		//primitives are stored in the stack memory
		//all object are stored in the heap memory
		String [] arr=new String[5];
		//internal working of an object
		// each particular objects will have seperate memory in the heap memory which are pointing to null
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.next();
		}
		
		for(String s:arr)
		{
			System.out.print(s+" ");
			
		}
		System.out.println();
		
		// use to string method
			System.out.print(Arrays.toString(arr));
			System.out.println();
			arr[1]="mango";
			System.out.println(Arrays.toString(arr));
			//i.e string changes the  original object
		
		
	}
}
