class Swap{

	public static void main(String[] args) {
		Student s1 = new Student(10,20);
		Student s2 = new Student(50,100);
		System.out.println("befor swapping s1 and s2 : "+s1.toString()+" "+s2.toString());
		badSwap(s1,s2);
		System.out.println("after swapping s1 and s2 : "+s1.toString()+" "+s2.toString());
	}
	public static void badSwap(Student parameter1, Student parameter2){
		Student temp = parameter1;
		parameter1 = parameter2;
		parameter2 = temp;
	}

}
class Student{

	int x;
	int y;

	Student(int x,int y){
		this.x = x;
		this.y = y;
	}
	
}

/*
	I understand this code also as passed by value because s1 and s2 are looking at different
	student objects. after calling badSwap method parameter1 is looking at the same object s1 is
	looking at and parameter2 is looking at the same object s2 is looking at. after executing 
	badSwap method what will happen is parameter1 is looking at the student object s2 is looking at
	and paremater2 is looking at the student object s1 is looking at.

	that does not mean s1 is looking at the student object, s2 is looking at  and 
	s2 is looking at the student object, s1 is lookin at. 

	swapping does not work like this.

*/