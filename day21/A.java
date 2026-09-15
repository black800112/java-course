class A extends Company
{
    private int lcd;

    A(String name,String address,int lcd)
    {
        super(name,address);
        this.lcd=lcd;
    }

    void setLcd(int lcd)
    {
        this.lcd=lcd;
    }
    //void 執行後消失(setLcd 設定可更改數值)

    int getLcd()
    {
        return lcd;
    }
    //11-21行 set & get 設定執行後得到

    /*
    String show()//override(置換非修改)(更改A class.show()的內容)
    {
        return "lcd:"+lcd;
    }
    */

    //整合,在自己的show前面加上服類別的show() => super.show()
    String show()
    {
        return super.show()+"\tlcd:"+lcd;
    }

}

