class A extends School
{
	private int word;
	A(String name,int word)
	{
		super(name);
		//super(name,100);
		this.word=word;		
		//System.out.println("A 班學生 , word="+word);
	}

	A(String name,int chi,int word)
	{
		super(name,chi);
		this.word=word;
		//System.out.println("A 班學生 , word="+word);
	}


	String show()
	{
		return super.show()+ "\tword:"+word;
	}

	public void skill()
	{
		System.out.println("A skill");
		
	}

	private int skill(int x)
	{
		return x;
	}


	/*void skillA()
	{
		System.out.println("A skill");
	}*/
}