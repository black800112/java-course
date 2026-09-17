class Member
{
	String name;
	final String userName;
	//如果final不在field時給初始值,必須要寫建構式

	Member(String name,String userName)
	{
		this.name=name;
		this.userName=userName;
	}

}