class Ex2
//講義6 Array陣列
{
    public static void main(String[] args)
    {
        int[] x=new int[3];
        System.out.println(x);

        for(int i=0; i<3 ; i++)
        {
            System.out.println(x[i]);
        }

        System.out.println("======");

        x[0]=10;
        x[1]=30;
        x[2]=40;

        for(int i=0; i<3 ; i++)
        {
            System.out.println(x[i]);
        }

        System.out.println("======");

        int[] x2=new int[]{10,20,30};
        //後面的大括號代表要自己給初始值,不要用系統的
        System.out.println(x2);
        for(int i=0; i<3 ; i++)
        {
            System.out.println(x2[i]);
        }
    }
}