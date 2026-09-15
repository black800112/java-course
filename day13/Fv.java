class Fv
{
    private static int pv;
    //static int pv; static代表共用同一個物件
    //static代表絕對位置
    private double r;
    private int n;
    private double fv;
    //private意指封裝,不可隨意更改數值,只能透過建構式或方法更改

    //Fv(int pv,double r,int n)//原先的版本
    Fv(double r,int n)
    //前面有絕對位置的pv,所以可以不用輸入
    {
        //this.pv=pv;//原先的版本
        //建構式也可以不用給
        this.r=r;
        this.n=n;
        fv=pv*(1+r*n);
    }

    //mothds

    //String companyname() //原先的版本
    static String companyName()//加了static
    {
        return "巨匠電腦";
    }

    static int cal(int x,int y)
    //裡面的計算數跟上面的fields沒有關係,所以可以加static
    {
        return x*y;
    }

    /*static*/ void setR(double r)
    //如果要用static,就不能用this.r,因為this.r是屬於物件的,而static是屬於class的
    {
        if(r>=0)
        {this.r=r;}
    }

    static void setPv(int pv)
    {
        if(pv>=0)
        {Fv.pv=pv;}
        /*
        this要經過new
        這裡是static,所以不需要new,所以不能用this,要直接呼叫class名稱
        */
    }

    void show()
    {

        fv=pv*(1+r*n);//只有一行可以打在show的前面 代表在輸出之前在跑一次
        //如果有很多行可以用void caculate()包起來 之後在輸出前在呼叫caculate()即可

        System.out.println("本金："+pv+
        "\n利率："+r+"\n期数："+n+"\n本利和："+fv);
    }
}