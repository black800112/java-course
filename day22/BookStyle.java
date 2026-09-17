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
}