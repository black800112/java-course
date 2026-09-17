class C extends Company
{
    private int mouse;

    C(String name,String address,int mouse)
    {
        super(name,address);
        this.mouse=mouse;
    }

    /*
    String show()//override(置換非修改)(更改C class.show()的內容)
    {
        return "mouse:"+mouse;
    }
    */

    //整合,在自己的show前面加上服類別的show() => super.show()
    String show()
    {
        return super.show()+"\tmouse:"+mouse;
    }

    public String toString()
    {
        return "位址:"+super.toString();
    }
}