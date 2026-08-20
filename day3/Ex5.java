class Ex5
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("請輸入分數");
        int x;
        x=sc.nextInt();

        if(x>=60) 
        {
            System.out.println("及格");
            System.out.println("恭喜");

        }
            
        else
        {
            System.out.println("不及格");
            System.out.println("再加油");
        }
    }
}