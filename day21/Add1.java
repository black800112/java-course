class Add1
{
    public static void main(String[] agrs)
    {
        A a1=new A("abc","台北",100);//is-a A,is-a Company
        //new哪一個就看哪一個裡面的功能
        System.out.println(a1.show());

        System.out.println("==分隔線==");

        a1.setName("teacher");//set更改名字
        System.out.println(a1.show());
        System.out.println("lcd:"+a1.getLcd());

        System.out.println("==分隔線==");

        a1.setLcd(50);//更改lcd為50
        System.out.println("lcd:"+a1.getLcd());
    }
}