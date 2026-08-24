class Ex3
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);

        //產品數量
        System.out.println("請輸入尺的購買數量");
        int ruler=sc.nextInt();

        System.out.println("請輸入筆的購買數量");
        int pen=sc.nextInt();

        //會員身份
        System.out.println("是否為會員\n1)yes\n2)no");
        int member=sc.nextInt();

        //金額試算
        int sum=ruler*29+pen*35;

        //會員打折
        if(member==1) sum=(int)(sum*0.95);
        
        //滿額打折
        if(sum>=2000) sum=(int)(sum*0.95);
        

        //報表
        System.out.println("\n您的訂單明細"+
            "\n尺"+ruler+"把"+
            "\n筆"+pen+"枝"+
            "\n會員"+member+
            "\n總金額:"+sum+"元");
    }
}