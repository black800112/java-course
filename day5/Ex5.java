class Ex5
{
    //
    public static void main(String[] args)
    {
        /*
        迴圈
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
            System.out.println("i="+i+"\tsum="+sum);
        }
        */
        
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int sum=0,pay=0,ave=0;
        for(int x=1;x<=5;x++)
        {
            System.out.println("請輸入第"+x+"位顧客消費金額");
            pay=sc.nextInt();
            sum=sum+pay;
        }

        System.out.println("總金額"+sum+"元");

        ave=sum/5;

        System.out.println("平均消費金額"+ave+"元");

    }
}