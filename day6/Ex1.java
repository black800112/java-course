class Ex1
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("請輸入次數");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            //if (i==101) break; //到101強制中斷(101不顯示,只顯示到100)
            //if (i==10) continue;
            if (i>=20 && i<=25) continue;
            if (i>=30 && i<=33) continue;
            if (i==40) break;
            System.out.println("i="+i+"\thello java");
        }
    }
}
//break為強制中斷
//continue為指定跳過