class Ex1
{
    public static void main(String[] args)
    {
        /*
        Loop迴圈

        1)條件→重複且連續 具規律性的步驟

        2)for(1;2;3)
        { 步驟 }
        1.宣告計算次數用的變數
        2.判斷boolean值→ture繼續做 , false停止
        3.如何停止的計算式與2.有關

        3)
        a)while(boolean)
        { 步驟 }

        b)do
        { 步驟 }while(boolean);

        4)巢狀loop⇒99乘法

        5)break
        contimue
        label

        ctrl+c => 強制停止
        */

        for(int i=1;i<=10;i++)
        //for(int i=1;i<=10;++i)
        //for(int i=1;i<=10;i+=2)

        //i=1=>宣告計算次數用的變數
        //i<=10=>判斷boolean值
        //i++=>如何停止的計算式(與2有關)
        {
            System.out.println("i="+i+"\thello java");
        }

        //執行步驟:先找變數->判斷需要輪迴幾次->執行println->執行第三點->回去看有沒有在輪迴次數裡
        
        /*
        for(int x=1,y=1;x<=60000 || y<=70000;)
        System.out.println("x="+x+"\ty="+y);
        x=2*y+2;
        y=3*x+10;
        */

    }
}