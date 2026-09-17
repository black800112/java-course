class Add1
{
	public static void main(String[] args) 
    {
		//BookStyle b1=new Book();

		BookStyle[] b=new BookStyle[2];
        //用BookStyle的規則來管理Book跟Book2這兩個物件
		b[0]=new Book();
		b[1]=new Book2();


		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i].bookName("java")+"\t"+b[i].bookPrice(1000));
		}

        System.out.println(BookStyle.pi+"\t"+BookStyle.pi2);

        System.out.println("===分隔線===");

        b[0].show1();
        b[1].show1();

        //b[0].show2();
        BookStyle.show2();
	}
}