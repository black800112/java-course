class Ex4
{
    public static void main(String[] args)
    {
        int x=10;
        int y=3;

        System.out.println("x+y="+(x+y));
        System.out.println("x-y="+(x-y));
        System.out.println("x*y="+(x*y));
        System.out.println("x/y="+(x/y));//int是整數,所以10/3=3.333,取整數
        System.out.println("x%y="+(x%y));//%是取餘數,所以10/3=3餘1
        //""雙引號為文字,()有小括號要先算

        System.out.println("==========");
        System.out.println("x/y="+(double)(x/y));//(double)為強制轉型,但因為小括號(x/y)先算
        System.out.println("x/y="+((double)x/y));//(double)在(x/y)的括號裡面,所以先轉
    }
}