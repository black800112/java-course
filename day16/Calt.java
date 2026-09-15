class Calt
//考試第16題
{
    public static void main(String[] args)
    [
        int x;

        void set(int o)
        {
            Calc c=new Calc();
            c.x=0;

            this.x=0;//這邊的this指的是class Calt這個檔案,x是第五行的x
            System.out.println(c);
        }
    ]
}