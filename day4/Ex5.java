class Ex5
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);

        //輸入購買數量
        System.out.println("購買數量:");
        int bluetooth=sc.nextInt();

        //輸入是否為會員
        System.out.println("是否為會員:\t1.會員\n2.非會員");
        int member=sc.nextInt();

        //若為會員，再輸入會員等級
        if(member==1)
        {
            System.out.println("會員等級:");
            int MembershipLevel=sc.nextInt();
        }
        
		//輸入付款方式
        System.out.println("付款方式:\t1.現金\t2.信用卡\t3.行動支付");
        int pay=sc.nextInt();
        
		//輸入配送方式
        System.out.println("配送方式:\t1.超商取貨\t2.宅配");
        int delivery=sc.nextInt();

		//計算商品小計
        int sum=bluetooth*1280;

		//計算數量折扣
        if (bluetooth>=10)
        {
            System.out.println((int)(sum=sum*0.85));
        }

        else if (bluetooth>=5 && bluetooth<=9)
        {
            System.out.println((int)(sum=sum*0.9));
        }

        else if (bluetooth>=3 && bluetooth <=4)
        {
            System.out.println((int)(sum=sum*0.95));
        }

		//計算會員折扣
        if (member==1)
        {
            System.out.println("會員等級:\t1.一般\n2.VIP\n3.VVIP");
            int MembershipLevel=sc.nextInt();
            if(MembershipLevel==1) sum=sum-50;
            if(MembershipLevel==2) sum=sum-100;
            if(MembershipLevel==3) sum=sum-150;
        }

		//計算付款優惠
        if(pay==1) sum=sum-50;
        if(pay==3) sum=sum-80;


		//判斷免運與運費


		//計算最後應付金額


		//判斷是否贈送購物金


		//輸出完整訂單明細



    }
}