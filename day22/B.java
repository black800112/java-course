class B extends Student
//實作介面的子類別一定要將抽象方法給實作出來,如18.19行
//兩種解決方式

{
	private int eng;
	B(String name,int eng)
	{
		super(name);
		this.eng=eng;
	}

	/*
	void setChi(int chi)
	{ }
	改成下面的
	*/

	void set(int eng)
	{
		this.eng=eng;
	}

	void setEng(int eng)
	{
		this.eng=eng;
	}

	String show()
	{
		return super.show()+"\t英文:"+eng;
	}

}