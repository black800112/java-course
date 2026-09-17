class Add1
//如果變抽象class 就不能new
//變成抽象類別以後，本身無法實體化，即無法”new”,只剩提共繼承的功能當父類別的角色
{
	public static void main(String[] args) {
		/*
		Student s1=new A("abc",75);//is-a Student
		
		System.out.println(s1);
		System.out.println(s1.show());
		//((A)s1).setChi(100);
		s1.setChi(60);
		System.out.println(s1.show());
		*/

		Student[] s=new Student[3];
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		System.out.println("==分隔線==");

		s[0]=new A("a1",40);
		s[1]=new B("b1",100);
		s[2]=new C("c1",70);


		System.out.println(s[0]+"\t"+s[0].show());
		System.out.println(s[1]+"\t"+s[1].show());
		System.out.println(s[2]+"\t"+s[2].show());

		System.out.println("===分隔===");

		s[2].set(50);

		System.out.println(s[0]+"\t"+s[0].show());
		System.out.println(s[1]+"\t"+s[1].show());
		System.out.println(s[2]+"\t"+s[2].show());

	}
}