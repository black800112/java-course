class Ex6
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int ruler,pen,sum;

        System.out.println("請輸入尺的數量");
        ruler=sc.nextInt();

        System.out.println("請輸入筆的數量");
        pen=sc.nextInt();

        sum=ruler*29+pen*35;

        if(sum>=1000) sum=(int)(sum*0.95);

        System.out.println("訂單項目:"+
            "\n尺:"+ruler+"把"+
            "\n筆:"+pen+"筆"+
            "\n成交金額:"+sum+"元");
    }
}