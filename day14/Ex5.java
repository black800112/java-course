class Ex5
{
    public static void main(String[] args)
    {
        int[] x=new int[]{10,20,30};
        int[] y=new int[]{40,50,60};

        System.out.println("x="+x[0]);
        System.out.println("y="+y[0]);
        System.out.println("x[0]"+x[0]);
        System.out.println("y[0]"+y[0]);

        System.out.println("======");

        x=y;//位置=位置 -->相同位置 -->兩個都變成y位置 --> 傳位址address --> x位址會被消滅
        //回收記憶體 --> Garbage collection
        x[0]=y[0];//值=值,複製
        System.out.println("x="+x[0]);
        System.out.println("y="+y[0]);

        System.out.println("======");

        y[0]=100;
        System.out.println("x="+x[0]);
        System.out.println("y="+y[0]);

        System.out.println("======");

       
    }
}