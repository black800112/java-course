class Test1
{
    public static void main(String[] args)
    {
        int[][][] cube=new int[2][][];
        cube[0]=new int[][]{{1,2},{3}};

        cube[1]=new int[2][];
        cube[1][0]=new int[]{4};
        cube[1][1]=new int[]{5,6};

        int total=0;
        for(int i=0;i<cube.length;i++)
        {
            for(int j=0;j<cube[i].length;j++)
            {
                for(int k=0;k<cube[i][j].length;k++)
                {
                    total+=cube[i][j][k];
                    System.out.println(total);
                }
            }
        }
    }
}