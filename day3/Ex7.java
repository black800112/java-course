class Ex7
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("輸入分數");
        int x=sc.nextInt();

        if(x>=91 && x<=100)
        {
            System.out.println("A");
        }
        else if(x>=76 && x<=90)
        {
            System.out.println("B");
        }
        else if(x>=75 && x<=60)
        {
            System.out.println("C");
        }
        else if(x>=0 && x<=59)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("請重新輸入0~100");
        }
    }
}