class Ex4
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);

        //購買數量
        System.out.println("購買數量");
        int book=sc.nextInt();

        //會員資格
        System.out.println("會員資格\n1)會員\n2)非會員");
        int member=sc.nextInt();

        //付款方式
        System.out.println("付款方式\n1)現金\n2)信用卡");
        int payment=sc.nextInt();

        //商品小計
        System.out.println("商品小計");
        int sum=book*650;

        //數量折扣
        if (book>=5)
        {
            System.out.println("金額:"+(int)(sum*0.9));
        }

        if (book>=3 && book<=4)
        {
            System.out.println("金額:"+(int)(sum*0.95));
        }

        //會員折扣
        if (member==1)
        {
            System.out.println(sum-50);
        }

        //付款折扣
        if (payment==1)
        {
            System.out.println(sum-30);
        }

        //運費
        if (sum>=2000)
        {
            System.out.println(sum);
        }

        else if (sum<2000)
        {
            System.out.println(sum+100);
        }
        //應付金額


        //報表
        System.out.println("商品單價"+)
    }
}