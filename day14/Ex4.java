class Ex4
{
    public static void main(String[] args)
    {
        int[] x=new int[]{10,20,30,40,50,60,70};

        System.out.println(x.length);//.length代表算大括號裡面有幾個值
        System.out.println(x);

        for(int i=0;i<7;i++)//索引名稱,如果數量太多可以直接把i<? ?改成 i<x.length
        {
            System.out.println("\t"+x[i]);
        }

        System.out.println("======");
        System.out.println(x);
        for(int o:x)//for each代表全抓
        {
            System.out.println("\t"+o);
        }
    }
}