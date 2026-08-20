class Ex5
{
    public static void main(String[] args)
    {
        int x=10;
        int y=3;
        //2*x+y=x-y;
        x=3*y+1;
        y=2*x+10;
        //左邊是結果,右邊是運算式
        //左邊是變數在等右邊的計算結果
        //=不是等於的意思,是將右邊的運算式結果放在左邊的變數裡面,是指定的意思

        int a=10;
        a=20;

        System.out.println("a="+a);//只會找最近一次的變數

        int a=10;
        a=a+20;
        System.out.println("a="+a);//只會找最近一次的a,找第20行的a
        //20行的左邊a是變數(容器),右邊的a是計算結果,要找前一行第19行的a
        //所以第20行的左邊a=第19行的a+20,所以a=10+20,所以a=30
    }
}