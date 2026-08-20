class Ex2
{
    public static void main(String[] args)
    {
        int chi=65;
        int eng=85;
        System.out.println(chi>=60 && eng>=80);//boolean && boolean
        System.out.println(chi>=60 & eng>=80);
        //類型 & 類型-->2進位 & 2進位-->ture & ture-->1 & 1-->1-->ture
        System.out.println(chi>=60 || eng>=80);//boolean || boolean
        System.out.println(chi>=60 | eng>=80);
        //類型 & 類型-->2進位 | 2進位-->ture | ture-->1 & 1-->1-->ture


        //System.out.println(5 && 2);//會出現錯誤

        System.out.println("5 & 2-->"+(5&2));
        //5的2進位=0101,2的2進位=0010,取&-->0000-->0
        System.out.println("5 & 7-->"+(5&7));
        //5的2進位=0101,7的2進位=0111,取&(and)-->0101-->5(2進位算法)

        //System.out.println(5 || 2);

        System.out.println("5 | 2-->"+(5 | 2));
        //5的2進位=0101,2的2進位=0010,取|(or)-->0111-->7(2進位算法)
        System.out.println("5 | 7-->"+(5 | 7));
        //5的2進位=0101,7的2進位=0111,取|(or)-->0111-->7(2進位算法)

        System.out.println("5 ^ 2-->"+(5 ^ 2));
        //5的2進位=0101,2的2進位=0010,取^(xor)-->0111-->7(2進位算法)
        System.out.println("5 ^ 7-->"+(5 ^ 7));
        //5的2進位=0101,7的2進位=0111,取^(xor)-->0010-->2(2進位算法)

        System.out.println("7-->"+7);
        System.out.println("~7-->"+(~7));
        System.out.println("~(-5)-->"+(~(-5)));

        System.out.println("5>>2-->"+(5>>2));
        //先把5變成2進位,然後把右邊兩個數字砍掉,從左邊補上兩個0,得到一組新的2進位
        //5的2進位=00000101-->00000001-->答案等於1
        System.out.println("5<<2-->"+(5<<2));
        //先把5變成2進位,然後把左邊兩個數字砍掉,從右邊補上兩個0,得到一組新的2進位
        //5的2進位=00000101-->00010100-->答案等於20

    }
}