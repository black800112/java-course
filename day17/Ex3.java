class Ex3
{
    public static void main(String[] args)
    {
        Student[][][] s=new Student[2][][];
        //幾個[]代表幾維陣列=>[二維陣列][一維陣列][值]
        //這裡宣告三維陣列底下有兩個二維陣列
        
        //第一階段先new名稱
        s[0]=new Student[3][];//s[0](二維陣列)底下有三個一維陣列
        s[0][0]=new Student[3];//s[0][0](一維陣列)下面有三個值
        s[0][1]=new Student[2];
        s[0][2]=new Student[3];

        s[1]=new Student[2][];
        s[1][0]=new Student[2];
        s[1][1]=new Student[4];
        
        
        //第二階段給值
        s[0][0][0]=new Student("a1",80,80);
        s[0][0][1]=new Student("a1",80,80);
        s[0][0][2]=new Student("a1",80,80);

        s[0][1][0]=new Student("b1",80,80);
        s[0][1][1]=new Student("b1",80,80);

        s[0][2][0]=new Student("c1",80,80);
        s[0][2][1]=new Student("c1",80,80);
        s[0][2][2]=new Student("c1",80,80);

        s[1][0][0]=new Student("d1",80,80);
        s[1][0][1]=new Student("d1",80,80);

        s[1][1][0]=new Student("e1",80,80);
        s[1][1][1]=new Student("e1",80,80);
        s[1][1][2]=new Student("e1",80,80);
        s[1][1][3]=new Student("e1",80,80);

        System.out.println(s);//先抓主陣列(三維陣列)
            for(int i=0;i<s.length;i++)//找主陣列有幾個二維陣列
            {
                System.out.println("\t"+s[i]);//顯示
                    for(int j=0;j<s[i].length;j++)//找二維陣列裡面分別有幾個一維陣列
                    {
                        System.out.println("\t\t"+s[i][j]);
                            for(int k=0;k<s[i][j].length;k++)//找一維陣列裡面分別有幾個值
                            {
                                System.out.println("\t\t\t"+s[i][j][k]+s[i][j][k].show());
                                //給完數值才能給show
                            }
                    }
            }

        System.out.println("====");

        System.out.println(s);//複製主陣列(三維陣列)
            for(Student[][] o:s)//複製二維陣列
            {
                System.out.println("\t"+o);
                    for(Student[] v:o)//複製一維陣列
                    {
                        System.out.println("\t\t"+v);
                            for(Student u:v)//值
                            {
                                System.out.println("\t\t\t"+u+u.show());
                            }
                    }
            }
    }
}