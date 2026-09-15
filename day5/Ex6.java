class Ex6
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("請輸入消費金額");
        int sum=0;//加總
        int count=0;//人數
        int pay=0;//消費金額
        pay=sc.nextInt();
        while (pay!=0)
        {
            sum=sum+pay;
            count++;

            System.out.println("請輸入消費金額");
            pay=sc.nextInt();
        }
        System.out.println("顧客人數"+count);
        System.out.println("總消費金額"+sum);

        if(sum>=3000)
        {
            System.out.println("今日業績：良好");
        }
        else if(sum>=1500 && sum<3000)
        {
            System.out.println("今日業績：普通");
        }
        else
        {
            System.out.println("今日業績：需加強");
        }
    }
}