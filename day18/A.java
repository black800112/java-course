class A extends School
//extends意指箭頭,意思是class A這張表找不到的東西可以去School這張表找
//
{
    
    int excel;

    void show()
    {
        System.out.println("名："+name+
                            "\t國文："+
                            "\texcel："+excel);
    }
}