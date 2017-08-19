class Swap{

	public static void main(String[] args) {
		int i=10;
		int j=20;
		System.out.println("before swapping i and j values : "+i+" "+j);
		badSwap(i,j);
		System.out.println("after swapping i and j values  : "+i+" "+j);
	}
	public static void badSwap(int a, int b){
		int temp = a;
		a= b;
		b=temp;
	}

}

/*
	I understand this code as pass by value, because i and j variables in the main method are 
	created in the stack fram created for main method. when calling badSwap method, what will
	happen is new stack frame will be creted and spaces for a and b variables are created 
	inside that stack frame and variable a is going to hold the same value variable i is holding
	and variable b is going to hold same value variable j is holding. 
	for i,j,a,b has seperate memory locations and 
	swapping a and b does not mean swapping i and j.
*/

	