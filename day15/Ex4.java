class Ex4
{
	//考試第12題
	static void show(int x,long y)
	{
		System.out.println("A");
	}

	/*
	static void show(int x,int y)
	{
		System.out.println("B");
	}
	預設int 先抓這一個
	*/


	/*
	static void show(long x,int y)
	{
		System.out.println("C");
	}
	*/

	static void show(long x,long y)
	//相同類型也可以
	{
		System.out.println("D");
	}

	public static void main(String[] args) {
		show(10,10);
	}
}