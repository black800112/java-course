class Ex7
{
    public static void main(String[] args)
    {
        int x=10;
        //x=x+1;
        //x+=1;
        //x++;
        ++x;
        System.out.println("x="+x);

        //x=x-1;
        //x-=1;
        //x--;
        --x;
        System.out.println("x="+x);

        System.out.println("==========");

        int a=10;
        int b;

        //a++;
        //++a;

        //b=a++;//b=a;a=a+1;
        b=++a;//a=a+1;b=a;
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println("==========");

        int c=20;
        int d;

        //c--;
        //--c;

        //d=c--;//d=c;c=c-1;
        d=--c;//c=c-1;d=c;
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}