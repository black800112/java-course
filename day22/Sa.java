class Sa extends Company
{
	private int lcd;
	Sa(String name,String address,int lcd)
	{
		super(name,address);
		this.lcd=lcd;
	}

	void setLcd(int lcd)
	{
		this.lcd=lcd;
	}

	int getLcd()
	{
		return lcd;
	}


	String showA()
	{
		return super.show()+"\tlcd:"+lcd;
	}
}