class Add1
{
    public static void main(String[] args)
    {
        Order O=new Order(1,1);
        O.show();

        System.out.println();

        Order O1=new Order("mimi",1,1,true);
        O1.show();

        System.out.println("======");

        O.name="jimmy";
        O.lcd=-20;
        O.show();

        System.out.println();

        O1.show();
    }
}