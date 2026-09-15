class B extends Company
{
    private int ram;

    B(String name,String address,int ram)
    {
        super(name,address);
        this.ram=ram;
    }

    /*
    String show()//override(置換非修改)(更改B class.show()的內容)
    {
        return "ram:"+ram;
    }
    */

    //整合,在自己的show前面加上服類別的show() => super.show()
    String show()
    {
        return super.show()+"\tram:"+ram;
    }
}