class Ex3
{
    public static void main(String[] args)
    {
        /*
        猜密碼
        1.輸入密碼
        2.密碼=1234
        3.
        輸入1234(正確)=猜對
        猜錯=繼續猜
        */

        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("請輸入密碼");
        int password=sc.nextInt();
        while(password!=1234)
        //!= 意思為不等於
        //密碼不等於1234即繼續跑步驟
        {
            System.out.println("錯誤,請繼續輸入:");
            password=sc.nextInt();
        }
        System.out.println("密碼正確");

    }
}