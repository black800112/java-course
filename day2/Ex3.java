class Ex3
{
    public static void main(String[] args)
    {
        char x='a';//要表達單一個字可以用單引號,但要表達多個字要用雙引號
        System.out.println(x);

        System.out.println("==========");

        char x2=65;//ASCII表,A對照65(做鍵盤,虛擬按鈕,密碼)
        System.out.println(x2);

        boolean x3=true;//true or false
        //boolean為條件判斷,只有true或false

        System.out.println("==========");

        int Abc=10;
        int abc=10;//大小寫不同,可同時宣告兩個變數,但不建議
        //int public=10;//public為關鍵字,不可使用

        int A1=10;
        //int 1A=10;//數字不可作為開頭使用

        int $A=10;
        int _A=10;
        // int %A=10;//%為運算字體,不可使用

        int chinese=10;
        //int lessone one=20;//空格不可使用

        int lessoneOne=10;//小駝峰
        int LessoneOne=10;//大駝峰
        int ThisIsABook=10;
        int this_is_a_book=10;//蛇形(底線可使用)

        int 這是中文=10;

        System.out.println("happy\thappy\thappy\nhappy");
        //\t為tab鍵,\n為換行鍵
    }
}