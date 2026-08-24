class Ex2
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("輸入國文分數");
        int chi=sc.nextInt();

        System.out.println("請輸入英文分數");
        int eng=sc.nextInt();

        System.out.println("請輸入數學分數");
        int math=sc.nextInt();

        int sum=chi+eng+math;

        if(sum>=200)
        {

            if(eng>=75)
            {
                System.out.println("\n你的\n國文分數為:"+chi+
            "\n英文分數為:"+eng+
            "\n數學分數為:"+math+
            "\n總分為:"+sum+
            "\n恭喜錄取");
            }
            else
            {
                System.out.println("\n你的\n國文分數為:"+chi+
                "\n英文分數為:"+eng+
                "\n數學分數為:"+math+
                "\n總分為:"+sum+
                "\n英文未達標,未錄取");
            }
        }
        else
        {
            System.out.println("\n你的\n國文分數為:"+chi+
                "\n英文分數為:"+eng+
                "\n數學分數為:"+math+
                "\n總分為:"+sum+
                "\n總分未達標,未錄取");
        }


    }
}