class Add2
{
    public static void main(String[] args)
    {
        /*
        A a=new A("ni",60,75);
        System.out.println(a.word);
        System.out.println(a.name);
        System.out.println(a.chi);
        System.out.println(a.show());
        */

       A a=new A("ni",66,80);
       System.out.println(a.show());
       a.skill();
       //a.skill會先找new的class替換掉內容“是替換,非修改”
       //當名稱一樣，括號也一樣時，會強制要求遵守override規則
       //將類型也須設定稱一樣,否則會編譯失敗

    }

}