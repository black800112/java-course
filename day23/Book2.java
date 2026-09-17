class Book2 implements BookStyle
{
    public double bookPrice(double price)
	{
		return price*0.9;
	}

	public String bookName(String name)
	{
		return "java:"+name;
	}

    
}