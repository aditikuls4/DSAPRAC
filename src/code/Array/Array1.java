package code.Array;

public class Array1 {

	public static void main(String args[])
	{
		//q--: store a roll no.
		int a=4;
		//q--: store a person name
	String name="aditi";
	//q--: store 5 roll num
	int rolln1=2;
	int rolln2=5;
	//but its is hard to store roll no of 500 again and again so we used array of this
	//array is a collection of datatypes(primitives,objects,complex datatypes)
	//syntax
	//  datatype[] variablename=new datatype[size];
	//store 5 roll numbers
	
	int[] rollnum=new int[5];
	//or directly
	int[] rollnum2= {23,12,3,4,3};
	//datatype-> represents what is the type of the data store in the array
	//note-: cannot do like mixture i.e integer,string,char together in an array
	
	//(int[] rollnum=new int[5];)rhs-> object(runtime) lhs-> reference variable(compile time)(dynamic memory allocation)
	
	
	//lets see
	int[] roll;   //declaration: of an array(roll is getting defined in the stack)
	roll=new int[5]; //initialisation:actually here object is being created in memory(heap)
	//array have continous memory allocation(in c++) but in java it is tollay depend on jvm whether it will be continous or not
	//{1,2}....{3,4}(cells memory one by one allocated)
	//q--: why?
	//1)array objects are in heap 
	//2) in jls ((documentation) they mention that heap objects are not continous
    //3) dynamic memory allocation
	//hence -: array objects in java may not be continous(depends on jvm)
	
	
	
	
	}
}
