class Ex1
{
    public static void main(String[] args)
    {
        int [] x = new int []{10,20,30};
        System.out.println("x這邊的x指位置(stack)="+x);
        //[3]數值從0開始,0,1,2
        //new後,陣列長度無法再增加
        //new->產生記憶體位置stack,後產生heap區

        //x[2]=100;
        //X[-2]=100; //編譯會過,run不過

        x=new int[10];
        System.out.println("x="+x);
        x[3]=100;
        x[4]=20;

        for(int i=0;i<x.length;i++)
        {
            System.out.println("i="+i+"\tx["+i+"]="+x[i]);
        }

        System.out.println("======");

        for(int o:x)
        //把x的資料拷貝給o
        {
            System.out.println(o);
        }

    }
    

}