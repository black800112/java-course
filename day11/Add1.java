class Add1
{
	public static void main(String[] args) {
		Student s1=new Student("a",75,85);//constructors
		Student s2=new Student("b",55,85);
		s1.show();
		s2.show();
		System.out.println("====================");
		//s1.change(52,62);
		System.out.println("合計:"+(s1.change(52,62)+s2.change(80,70)));//methods
		s1.show();
		s2.show();
		System.out.println("====================");
		//s1.chi=-65;//filds
		s1.setChi(-65);
		s1.show();
		s2.show();
	}
}