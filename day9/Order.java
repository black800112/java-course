class Order
{
    //fields
    String name;
    int lcd;
    int ram;
    int sum;
    boolean member;

    //constructors
    Order(String name,int lcd,int ram,boolean member)
    {
        if(lcd>=0 && ram>=0)
        {
            this.name=name;
            this.lcd=lcd;
            this.ram=ram;
            this.member=member;

            sum=lcd*4999+ram*1280;

            if(member)
            {
                sum=(int)(sum*0.9);
            }
        }
        
    }

    Order(int lcd,int ram)
    {
        this.lcd=lcd;
        this.ram=ram;
        sum=lcd*4999+ram*1280;
    }
    //  overload 意指為 可有多種填入方式 關鍵是小括號內的引數


    //methods

    void change1(int lcd,int ram)//void宣告為純粹走步驟
    {
        this.lcd=lcd;
        this.ram=ram;
        //電腦為一個口令一個動作 這裡只有更改資料 如果要重新計算 要再給一次口令
        sum=lcd*4999+ram*1280;
    }

    int change2(int lcd,int ram)//int change2=
    {
        this.lcd=lcd;
        this.ram=ram;
        sum=lcd*4999+ram*1280;

        return sum;//return意指assignment-->=
        //return後面的數值要跟前面宣告的變數一樣
    }

    void show()
        {
            System.out.println("姓名："+name+
                                "\nlcd數量："+lcd+
                                "\nram數量："+ram+
                                "\n總金額："+sum+
                                "\n是否為會員："+member);
        }

}