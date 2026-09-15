/*
1.輸入(new)-->constructors
--引數-->接收-->this.
--計算

2.輸出->methods
*/

class Parking
{
    int number;//序號
    int hour;//小時
    int member;//會員
    int rate;//費率
    int pay;//原始費用
    double dis;//折扣
    double finalpay;//最後應付

    //計算
    Parking(int number,int hour,int member)
    {
        this.number=number;
        this.hour=hour;
        this.member=member;
        this.rate=40;
        this.pay=hour*rate;

       
        if(member==0) dis=0;
        
        else if(member==1) dis=0.1;
        
        else if(member==2) dis=0.2;

        this.finalpay=pay*(1-dis);
        
    }

    void show()
    {
        System.out.println("===停車收費結果==="+
                            "\n序號："+number+
                            "\n小時："+hour+
                            "\n會員："+member+
                            "\n費率："+rate+
                            "\n原始費用："+pay+
                            "\n折扣率："+dis+
                            "\n應付金額："+finalpay);
    }
        
                            
    

}