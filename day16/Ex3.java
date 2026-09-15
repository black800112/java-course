class Ex3
{
    public static void main(String[] args)
    {
        int[][][] x=new int[2][][];//意指三維陣列,二維陣列有兩組
        x[0]=new int[2][];//x[0](二維陣列)底下有兩個一維陣列
        x[0][0]=new int[2];//x[0][0](一維陣列)底下有兩個值
        x[0][1]=new int[3];//x[0][1](一維陣列)底下有三個值

        x[1]=new int[3][];
        x[1][0]=new int[2];
        x[1][1]=new int[3];
        x[1][2]=new int[4];

        System.out.println(x);

        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
                for(int j=0;j<x[i].length;j++)
                {
                    System.out.println(x[i][j]);
                        for(int k=0;k<x[i][j].length;k++)
                        {
                            System.out.println(x[i][j][k]);
                        }
                }
        }

        System.out.println("====");

        System.out.println(x);

        for(int[][] o:x)//x陣列底下有幾組二維陣列
        {
            System.out.println("\t"+o);
                for(int[] u:o)//每一組二維陣列下有幾組一維陣列
                {
                    System.out.println("\t\t"+u);
                        for(int v:u)//每一組一維陣列下有幾個值
                        {
                            System.out.println("\t\t\t"+v);
                        }
                }
        }
    }
}