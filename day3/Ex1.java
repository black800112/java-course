class Ex1
{
    public static void main(String[] args)
    {
        int chi=65;

        System.out.println("chi>60-->"+(chi>60));
        System.out.println("chi<60-->"+(chi<60));
        System.out.println("chi>=60-->"+(chi>=60));
        System.out.println("chi<=60-->"+(chi<=60));
        System.out.println("chi==60-->"+(chi==60));
        System.out.println("chi!=60"+(chi!=60));//!=為不等於,65沒有等於60,所以是"對"


        System.out.println("============");

        int chin=65;
        int eng=85;

        System.out.println("chin>=60 && eng>=80-->"+(chin>=60 && eng>=80));
        System.out.println("chin>=60 || eng>=80-->"+(chin>=60 || eng>=80));
        System.out.println("chin>=60 ^ eng>=80-->"+(chin>=60 ^ eng>=80));
        //or(||)是擇一即ture,xor(^)是只能一個符合才ture,兩個都符合就不要
        
        System.out.println("chin>=60 && eng>=80-->"+!(chin>=60 && eng>=80));
        //!驚嘆號是把結果改相反,true改成false,false改成ture,須先將結果算出,所以驚嘆號加在小括號外面
        System.out.println("chin>=60 ^ eng>=80-->"+(!(chin>=60) ^ eng>=80));
        //^是只能有一個,兩個答案都一樣就都不要,27行原本是兩個都一樣,所以是false
        //但因為!是把結果改相反,把chin>=60原本是false改成ture,
        //這樣變成一個t一個f,擇一,所以變成ture
    }
}