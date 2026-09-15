class Add4
{
    public static void main(String[] args)
    {
        Order o1=new Order("abc1",1,2,true);
        Order o2=new Order("abc2",1,2,true);
        o1.show();
        o2.show();
        
        System.out.println("======");

        System.out.println("合計："+((o1.change2(2,3))+(o1.change2(4,5))));

        //o1.change1(2,3);
        //o2.change1(4,5);
        o1.show();
        o2.show();

    }
    
}
