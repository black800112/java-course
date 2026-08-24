class Ex1
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("輸入整數");
        int n=sc.nextInt();
        //二分法,先分出偶數奇數,在分出正負數

        if(n%2==0)
        {
            if(n>=0)
            {
                System.out.println("正偶數");
            }
            else
            {
                System.out.println("負偶數");
            }
        }
        else
        {
            if(n>=0)
            {
                System.out.println("正奇數");
            }
            else
            {
                System.out.println("負奇數");
            }
            
        }
    }
}