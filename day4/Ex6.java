class Ex6
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("請輸入會員等級:\n1.VIP"+
            "\n2.金卡"+
            "\n3.銀卡"+
            "\n4.普通會員");

        int member=sc.nextInt();

        switch(member)
        {
            case 1:
                    System.out.println("VIP");
                    break;
            case 2:
                    System.out.println("金卡");
                    break;
            case 3:
                    System.out.println("銀卡");
                    break;
            case 4:
                    System.out.println("普通會員");
                    break;
            default:
                    System.out.println("請重新輸入");
        }
    }
}