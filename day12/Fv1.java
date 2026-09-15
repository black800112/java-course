class Fv1
{
    public static void main(String args[])
    {
        Fv f=new Fv(50000,0.015,2);
        Fv f1=new Fv(50000,0.014,3);
        Fv f2=new Fv(50000,0.13,4);
        Fv f3=new Fv(50000,0.12,5);
        f.show();
        f1.show();
        f2.show();
        f3.show();
        
        System.out.println("======");

        f.pv=10000;
        f1.r=0.02;
        f.show();
        f1.show();
        f2.show();
        f3.show();

    }
}