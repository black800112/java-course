abstract class Student
{
	private String name;
	
	Student(String name)
	{
		this.name=name;
	}

	String show()
	{
		return "名:"+name;
	}

	/*
	abstract void setChi(int chi);
	//先有抽象文法 要在把class變成抽象類別 要在class前面加上abstract
	*/

	abstract void set(int x);

	
}