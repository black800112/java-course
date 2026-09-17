class A extends Student
{
	private int chi;
	A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}

	/*
	void setChi(int chi)
	{
		this.chi=chi;
	}
	改成下面的
	*/

	void set(int chi)
	{
		this.chi=chi;
	}

	String show()
	{
		return super.show()+"\t國文:"+chi;
	}
}