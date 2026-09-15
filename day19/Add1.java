class Add1
{
    public static void main(String[] args)
    {
        //Company c1=new Company("abc");//is-a Company
        //沒有建構式但要new ->default consturctors(預設建構子)
        //System.out.println(c1.show());

        A a1=new A("teacher",123);//is-a A , is-a Company
        //new的時候 只要看要new的class的即可
        //System.out.println(a1.show());
    }
}


/*
程式碼如下，請問最後結果為何?
	01.  class Person{
	02.     String name="anonymity";
	03.     public Person(String n){name=n;}
	04.   }

	05.  class Employee extends Person{
	06.     String empID="E00";
	07.     public Employee(String id){empID=id;}
	08.   }

        **沒有加super()

	09.  class Execute{
	10.     public static void main(String args[]){
	11.       Employee em=new Employee("E01");
	12.       System.out.print(em.empID);
	13.   }
	14. }

	
	A. E00
	B. E01
	C. anonymity
	D. E00 E01
	E. 編譯失敗

    answer:E
*/