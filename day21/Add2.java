class Add2
{
    public static void main(String[] args)
    {
        Company a1=new A("EE","新竹",100);//is-a company先從company這個文件開始查起
        //異質宣告物件(要有繼承)
        //父類別 物件名稱=new子類別();
        System.out.println(a1.show());
        a1.setName("CC");
        System.out.println(a1.show());

        //System.out.println("lcd:"+a1.getLcd());
        //上一行編譯錯誤,因為異質宣告,只會從company這個文件開始往上找
        //a1.getlcd有這個功能但在A class

        System.out.println("lcd:"+((A)a1).getLcd());
        //a1.getlcd有這個功能但在A class
        //在功能前面加上class的名稱,意指此功能要去A class裡面找


    }
}