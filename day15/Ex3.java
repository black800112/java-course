class Ex3
{
    public static void main(String[] args)
    {
        int[][][] x=new int[2][2][3];
        /*
        三維陣列
        第一個[] -> x底下有兩組stack 主陣列（第一維）
        第二個[] -> 兩組stack下面再分兩組 次層陣列（第二維）
        第三個[] -> 一個次層陣列有三個heap 最內層資料陣列（第三維）
        */

       System.out.println(x);//x的位址
       System.out.println(x.length);//只看一層

       System.out.println("\t"+x[0]);//主陣列的位址
       System.out.println("\t"+x[0].length);//看x[0]下面分幾層

       System.out.println("\t\t"+x[0][0]);//次層陣列的位址
       System.out.println("\t\t"+x[0][0].length);

       System.out.println("\t\t\t"+x[0][0][0]);//值

       System.out.println("======");

       System.out.println(x+"“x的位址”");
       for(int i=0;i<x.length;i++)
       {
        System.out.println("\t"+x[i]+"“x[i]的位址”");
            for(int j=0;j<x[i].length;j++)
            {
                System.out.println("\t\t"+x[i][j]+"“x[i][j]的位址”");
                    for(int k=0;k<x[i][j].length;k++)
                    {
                        System.out.println("\t\t\t"+x[i][j][k]+"“值”");
                    }
            }
       }

       System.out.println("======");

       System.out.println(x);//抓出x的位址
       for(int[][] o:x)//抓出二維陣列
       {
        System.out.println("\t"+o);
            for(int[] u:o)//抓出二維陣列下的一維陣列
            {
                System.out.println("\t\t"+u);
                    for(int v:u)//抓出一維陣列下的值
                    System.out.println("\t\t\t"+v);
            }
       }

    }
}