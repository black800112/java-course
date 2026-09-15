class Ex1
//考試第16題
{
    public static void main(String[] args)
    {
        Calc c=new Calc();//有經過new,就是區域變數
        c.set(100);//執行Calc c=new Calc();c.x=0;這兩個動作

        System.out.println(c);
        System.out.println(c.x);
    }
}