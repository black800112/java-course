class Add3
{
    public static void main(String[] args)
    {
        Company[][] employee=new Company[3][];
        employee[0]=new Company[3];
        employee[1]=new Company[2];
        employee[2]=new Company[4];
        //以上 第一階段給位址

        employee[0][0]=new A("a1","台北",15);
        employee[0][1]=new A("a2","台北",20);
        employee[0][2]=new A("a3","台北",10);

        employee[1][0]=new B("b1","台北",10);
        employee[1][1]=new B("b1","台北",30);

        employee[2][0]=new C("c1","台北",70);
        employee[2][1]=new C("c1","台北",10);
        employee[2][2]=new C("c1","台北",10);
        employee[2][3]=new C("c1","台北",40);



        System.out.println(employee);

        for(int i=0;i<employee.length;i++)
        {
            System.out.println("\t"+employee[i]);
                for(int j=0;j<employee[i].length;j++)
                {
                    System.out.println("\t\t"+employee[i][j]+"\t"+employee[i][j].show());
                }
        }

        employee[0][0].setName("Lin");
        //setName在company class的功能 
        /*
        employee[0][1].setLed(50);
        //setLed的功能在A class裡面,因編譯會先從company開始找
        //要強制轉型的概念,會變成下面  */
        ((A)employee[0][1]).setLcd(50);
        //如果不強制轉型,要在父類別底下建立一個假的override讓編譯通過
        //new的部分還是會看new哪一個class


        System.out.println("==分隔線1==");

        System.out.println(employee);
        for(Company[] o:employee)
        {
            System.out.println("\t"+o);
                for(Company u:o)
                {
                    System.out.println("\t\t"+u+"\t"+u.show());
                }
        }

        System.out.println("===分隔線2===");

        System.out.println(employee[2][0]);
		System.out.println(employee[0][0]);
		System.out.println(employee[2][0].equals(employee[0][0]));
		//employee[2][0]=employee[0][0];

		System.out.println(employee[2][0].show());
		System.out.println(employee[0][0].show());
		System.out.println("===================");

		System.out.println(employee[2][0].toString());
        //toString為顯示記憶體位址,系統預設值,沒寫也會自動跳
		System.out.println(employee[0][0]);
		System.out.println(employee[2][0].equals(employee[0][0]));

        System.out.println("==分隔==");
        System.out.println(employee[2][0] instanceof Company);
        //instanceof檢查employee[2][0]跟Company這個class有沒有關係
        System.out.println(employee[2][0] instanceof C);
        System.out.println(employee[2][0] instanceof A);
        //employee[2][0]是new C class,所以跟A class沒有關係
    }

}