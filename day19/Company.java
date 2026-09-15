class Company
{
    String name;
    String address;

    Company(String name)
    {
        this.name=name;
        System.out.println("請新增一位員工,名："+name);
    }

    String show()
    {
        return "名："+name+"地址："+address;
    }
}