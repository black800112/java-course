class School
{
	private String name;
	private int chi;
	School(String name)
	{
		this.name=name;
		//System.out.println("新增一位學生 , name="+name);
	}

	School(String name,int chi)
	{
		this.name=name;
		this.chi=chi;
		//System.out.println("新增一位學生 , name="+name+"\t國文:"+chi);
	}

	protected void skill()
	{
		System.out.println("School skill");
	}
        //

	

	String show()
	{
		return "名:"+name+"\t國文:"+chi;
	}

}