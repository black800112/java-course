class Fv
{
    int pv;
    //static int pv; static代表共用同一個物件
    //static代表絕對位置
    double r;
    int n;
    double fv;

    Fv(int pv,double r,int n)
    {
        this.pv=pv;
        this.r=r;
        this.n=n;
        fv=pv*(1+r*n);
    }
    void show()
    {

        fv=pv*(1+r*n);//只有一行可以打在show的前面 代表在輸出之前在跑一次
        //如果有很多行可以用void caculate()包起來 之後在輸出前在呼叫caculate()即可

        System.out.println("本金："+pv+
        "\n利率："+r+"\n期数："+n+"\n本利和："+fv);
    }
}