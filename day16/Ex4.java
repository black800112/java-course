class Ex4
{
    public static void main(String[] args)
    {
        int[][][] x=new int[2][3][2];//寫法1
        int[][] x2[]=new int[2][3][2];//寫法2
        int[] x3[][]=new int[2][3][2];//寫法3
        int x4[][][]=new int[2][3][2];//寫法4

        int[][][] x5=new int[][][]//寫法1
        /*
        幾個中括號後面就要有幾個大括號{{{{值},{值}
                                            ,{值},{值}}}}
       {{ {10,20},{20,30,40} },{ {10,20},{20,30,40} }}
       */

        {
            {
                {10,20},
                {20,30,40}
            }
            ,
            {
                {10,20},
                {20,30,40}
            }
        };

    System.out.println(x);
    for(int i=0;i<x5.length;i++)
        {
            System.out.println("\t"+x5[i]);
                for(int j=0;j<x5[i].length;j++)
                {
                    System.out.println("\t\t"+x5[i][j]);
                        for(int k=0;k<x5[i][j].length;k++)
                        {
                            System.out.println("\t\t\t"+x5[i][j][k]);
                        }
                }
        }

    }
}