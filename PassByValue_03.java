class Swap{

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.i = 10;
		s1.j = 20;
		System.out.println("values of i and j in s1 object before swapping : "+s1.i+" "+s1.j);
		swap(s1);
		System.out.println("values of i and j in s1 object after swapping  : "+s1.i+" "+s1.j);
	}
	public static void swap(Student s2){
		s2.i = 20;
		s2.j = 10;
	}

}
class Student{
	int i;
	int j;
}

/*
	
	This is the problematic code because swapping is working

*/