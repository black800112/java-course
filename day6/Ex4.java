class Ex4
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		/*
		1.輸入-->飲料代碼(x),會員(member),幾杯(cup)

		2.判斷計算-->杯數需>=0
		-代碼-->switch-->1,2,3-->單價
		-杯數-->杯數*單價-->小計
		-會員+>200,會員<200

		3.輸出報表
		飲料名稱、(product)
		單價、(price)
		杯數、
		原價小計、(sum)
		折扣金額(dis)
		應付金額(pay)
		*/
		//輸入
		System.out.print("輸入飲料代碼:1=紅茶、2=奶茶、3=咖啡: ");
		int x=sc.nextInt();

		System.out.print("輸入會員代碼：1=會員、0=非會員: ");
		int member=sc.nextInt();

		System.out.print("輸入購買杯數: ");
		int cup=sc.nextInt();

		//計算
		int sum=0,price=0;
		String product="";
		double dis=0.0;
		if(cup>=0)
		{
			switch(x)
			{
		  		case 1:
		  			price=30;
		  			product="紅茶";
		  			break;
		  		case 2:
		  			price=45;
		  			product="奶茶";
		  			break;
		  		case 3:
		  			price=60;
		  			product="咖啡";
		  			break;
		  		default:

			}

			sum=cup*price;

			if(member==1)
			{
				if(sum>=200)
				{
					dis=sum*0.9;
				}
				else
				{
					dis=sum*0.95;
				}
			}
		}
		else
		{
			System.out.println("杯數輸入錯誤");
		}
		


		System.out.println("============================");
		System.out.println("飲料："+product+
							"\n單價："+price+"元"+
							"\n杯數："+cup+
							"\n原價小計："+sum+"元"+
							"\n會員:"+member+
							"\n折扣後應付："+dis+"元");

		System.out.println("============================");

	}
}