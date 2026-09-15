class Ex2
{
    public static void main(String[] args)
    {
        /*
        int[][] x=new int[2][3];
        多維陣列 第一個[]代表有幾組stack 第二個[]代表每組底下分幾個heap
        */

        int[][] x=new int[][]{{10,20,30,},{40,50,60}};
        /*
        []有幾個,旁邊的大括號就要有幾個
        也可以拆段,如下
        int[][] x=new int[][]
        {
            {10,20,30},
            {40,50,60},
        };
        */

        System.out.println(x);//x的位址
        System.out.println("\t"+x[0]);//x第一組的位址
        System.out.println("\t\t"+x[1]);//x第二組的位址
        System.out.println("\t\t\t"+x[0][0]);//值
        System.out.println("\t\t\t\t"+x[0][1]);//值

        System.out.println("======");
        System.out.println(x.length);
        //.length代表抓位址,一次只能跑一層

        System.out.println("======");
        System.out.println(x[0].length);
        //x[0]第一組stack下面有3個heap

        /*
        System.out.println("======");
        System.out.println(x[0][0].length);
        編譯失敗,因為heap區下面沒有掛東西
        */

       System.out.println("========");
       //巢狀迴圈
        System.out.println(x);//抓x的位址
        for(int i=0;i<x.length;i++)
        {
            System.out.println("x="+x[i]);//抓x下面有幾組stack
            for(int j=0;j<x[i].length;j++)
            {
                System.out.println("\t\t"+x[i][j]);//抓x下面stack共有幾個heap
            }
        }

        System.out.println("==========");
        System.out.println(x);
        for(int[] o:x)
        {
            System.out.println("\t"+o);
            for(int u:o)
            {
                System.out.println("\t\t"+u);
            }
        }
    }
}