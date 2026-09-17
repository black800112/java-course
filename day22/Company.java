/*final*/class Company

{
	private String name;
	private String address;
	final double pi=3.14;
	final double pi2=3.14;
	//final會把field的宣告變數變成常數,一定要給初始值,沒給編譯不會過
	//給final的常數,初始值都不會改變

	Company(String name,String address)
	{
		this.name=name;
		this.address=address;
	}

	String show()
	{
		return "名:"+name+"\t地址:"+address;
	}

	void setName(String name)
	{
		this.name=name;
	}

	void setLcd(int lcd)
	{
	}
}