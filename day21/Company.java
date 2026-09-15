class Company
{
    private String name;
    private String address;

    Company(String name,String address)
    {
        this.name=name;
        this.address=address;
    }

    String show()
    {
        return "名："+name+"\t地址："+address;
    }

    void setName(String name)
    {
        this.name=name;
    }

    void setLcd(int lcd)//假的override,只給名字,要讓編譯過
    { }
}