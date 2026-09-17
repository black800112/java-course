class C extends Student
{
	private int math;
	C(String name,int math)
	{
		super(name);
		this.math=math;
	}

	/*
	void setChi(int chi)
	{	}
	改成下面的方式
	*/

	void set(int math)
	{
		this.math=math;
	}

	void setMath(int math)
	{
		this.math=math;
	}

	String show()
	{
		return super.show()+"\t數學:"+math;
	}

}