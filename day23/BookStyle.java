interface BookStyle//interface = abstract class
//抽象class,不可new
{
    //field
    public static final double pi=3.14;
    double pi2=3.14;
    //抽象class會在宣告變數前面自動加上 public static final

    //constructor

    //BookStyle(){}
    

    //abstract method -->最主要
    public abstract String bookName(String name);
    double bookPrice(double price);

    /**** java8以後 ****/

    public default void show1()//物件類 --> 直接繼承給子類別,需透過物件呼叫,也可以被override
    //在public void中間加上 default
    {
        System.out.println("default show1");
    }

    public static void show2()//類別類 --> 沒有繼承給子類別
    {
        System.out.println("staic show2");
    }
}