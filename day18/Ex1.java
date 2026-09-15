class Ex1
{
    public static void main(String[] args)
    {
        A a1=new A();//class A+class Schoole提供fields
        System.out.println(a1);
        System.out.println(a1.excel);
        a1.show();
        System.out.println(a1.name);//class School提供
        System.out.println(a1.chi);//class School提供

        /*
        A is-a A 意指 A物件(宣告的變數) 可以到 class A 找功能
        A is-a School

        A has-a excel 意指 class A 提供 excel的功能
        A has-a show()
        A has-a name
        A has-a chi
        */

        System.out.println("====");

        B b1=new B();
        /*
        B is-a B 意指B物件 可以到B class找功能
        B is-a School

        B has-a word 意指B class提供了word功能
        B has-a show()
        B has-a name
        B has-a chi
        */


       /*
    給定下面程式碼，哪些選項的描述是對的?(選擇3個)
	01. class Animal{}
	02. class Dog extends Animal{Tail tail;}
	03. class Beagle extends Dog{public void jumper(){}}
	04. class Cat extends Animal{public void jumper(){}}

	A. Cat is-a Animal
	B. Cat is-a jumper
	C. Dog is-a Animal
	D. Dog is-a jumper
	E. Beagle has-a Tail

    answer:ACE
    */
    System.out.println("==================");
		School s=new School();//is-a School
		System.out.println(s.name+"\t"+s.chi);
		//s.show();
    }
}

        