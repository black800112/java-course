class Add3
{
    public static void main(String[] args)
    {
        double a1=10.12;
        double a2=10.12;
        System.out.println(a1==a2);

        System.out.println("java5.0以後版本");

        //Double A1=new Double(10.12);//java4.0-->Boxing
        //Double A2=new Double(10.12);

        Double b1=10.12;//左邊java.lang.Double 具有物件導向特性<--->右邊double為一般變數
        Double b2=10.12;//AutoBoxing

        System.out.println(b1==b2);//5.0以後版本的Boolean是拿位置來比較
        System.out.println(b1.equals(b2));//加上equals代表是拿一般數值來比較
    }
    

}