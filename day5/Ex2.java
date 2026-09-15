class Ex2
{
    public static void main(String[]args)

    /*
    while

    inti=1  ==> 步驟1
    i<=10  ==> 步驟2
    ture ==> 跑步驟  (false ==> 離開)(離開後走下一步驟)
    i++ ==> 步驟3
    ==>順序1.2.3.2.3.2.3....
    */

    {
        int i=1;
        while(i<=10)
        {
            System.out.println("i="+i+"\thello java");
            i++;
        }

        /*
        int i=1;
        do
        {
            System.out.println("i="+i+"\thello java");
        }
        while(i<=10);
        */

       /*
       int i=11;
       do
        {
            System.out.println("i="+i+"\thello java");
        }
        while(i<=10);

        會跑一次錯誤的(要記錄錯誤情況前的最後一次訊息)
        */

       /*
       int i=11;
       do
       {
        if(i<=10)
        {
            System.out.println("i="+i+"\thello java");
        }
        else
        {
            System.out.println("error message i="+i);
        }
        while(i<=10);
       }
       */
    }
}