class Ex4
{
    /*
    for的規律性,製作99乘法表
    巢狀
    */

    public static void main(String[] args) 
    {
		
		for(int x=1;x<=9;x++)
        //
		{
			for(int y=1;y<=9;y++)
			{
				System.out.print(x+"*"+y+"="+(x*y)+"\t");
			}
			System.out.println();
		}
		


		/*
		int x1=1;
		for(int y=1;y<=9;y++)
		{
			System.out.print(x1+"*"+y+"="+(x1*y)+"\t");
		}
		System.out.println();


		int x2=2;
		for(int y=1;y<=9;y++)
		{
			System.out.print(x2+"*"+y+"="+(x2*y)+"\t");
		}
		System.out.println();


		int x3=3;
		for(int y=1;y<=9;y++)
		{
			System.out.print(x3+"*"+y+"="+(x3*y)+"\t");
		}
		System.out.println();
		*/
    }


}