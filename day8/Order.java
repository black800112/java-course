class Order
{//(在最外圍的{}代表Globel全區)
    //fields//靜態式的fields只能宣告管理資料庫 資料表的欄位項目 不能運算
    String name;
    int ruler;
    int pen;
    double sum;
    boolean member;


    //constructors 建構式(有設計即會強制自動執行)(運算只能在constructors跟methods)
    /*
    1.UI(介面)輸入,name,ruler,pen,member
    2.ruler,pen皆為>=0,填入加計算
    3.會員-->0.95
    */

    Order(String name,int ruler,int pen,boolean member)//小括號代表引數(arguments) --> int ruler=? (小括號裡面的引數對應使用者使用的介面 等待使用者輸入資料後計算)
    //建構式名要跟定義宣告的class名稱一定要一樣
    {   /*
        this.ruler=ruler;//(加this代表為物件object本身的意思(在Globel區的物件)(如果沒加this代表為local區的物件)
        21行右邊的ruler是指18行的引數
        int ruler=50;//local區(在全區裡面的小區域 有自己的{})
        ruler=50;//Globel(找全區)(因為找不到宣告資料 會往外找)
        System.out.println("constructors");這行代表就算沒有宣告也會自動執行
        */

       if(ruler>=0 && pen>=0)
       {
        this.name=name;
        this.ruler=ruler;
        this.pen=pen;
        sum=this.ruler*29+this.pen*30;
        this.member=member;
        if(member == true) sum=(int)(sum*0.95);
       }

        
    }
    

    //methods(運算只能在constructors跟methods)
    void show()
    {
        System.out.println("名字："+name+
                            "\t尺："+ruler+
                            "\t筆："+pen+
                            "\t金額："+sum+
                            "\t會員："+member);
    }
}