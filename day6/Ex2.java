class Ex2
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("請輸入列數：");
        int n=sc.nextInt();

        System.out.println("請輸入行數：");
        int m=sc.nextInt();

        System.out.println(); //版面空一行

        a: //意思為在這一層的for加一個代碼,只能用在巢狀,中間不可以加其他程式碼
        for(int x=1;x<=n;x++) //列數(直)
        {
            for(int y=1;y<=m;y++) //行數(橫)
            {
                if (y==5) break; //控制行數只到第四行,第五行即停止
                if (x==5) break a; //這裡的break只作用於這一層的for,如果要執行上一層的for,要給上一層的for一個代碼
                //在break後面加上代碼,意思為break要找代碼為a的for執行,此為label
                System.out.println(x+"*"+y+"="+(x*y)+"\t");
            }

            System.out.println(); 
        }
    }
}