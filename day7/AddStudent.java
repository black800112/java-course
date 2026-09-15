class AddStudent
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        //Student類型;
        System.out.println(s1);
        System.out.println(s1.chi);
        //s1.chi -> s1是位置 .是呼叫的意思 chi是掛在後面的項目
        
        /*
        Student=s1
        int≠ student
        左邊右邊類型要一樣
         =new 是一個class新物件
        */





        /*
        int x;  //沒有初始值,只有(宣告)保留名稱 (沒有值),不讓別人使用
        System.out.println(x);
        */
        //初始化要宣告，不然不存在  只有宣告初始值後才存在
        //物件導向：管理這張表、類型要一致
        /*
        String mane1="abc";
        int chi1=65;
        double eng1=74.12;

        String mane2="bcd";
        int chi2=95;
        double eng2=74.12;

        System.out.println("名字："+mane1+"\n國文："+chi1+"\n英文："+eng1);
        System.out.println("名字："+mane2+"\n國文："+chi2+"\n英文："+eng2);
        */

    }
}