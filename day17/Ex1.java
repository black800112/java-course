class Ex1
//一維陣列
{
    public static void main(String[] args)
    {
        /*
        Student[] s=new Student[3];//S[0],S[1],S[2],Student[一組人] s=new Student[三個人]
        //第一階段先new名字

        //第二階段才new內容

        s[0]=new Student("a1",47,85);
		s[1]=new Student("a2",67,85);
		s[2]=new Student("a3",47,75);
        */

        Student[] s=new Student[]
        {
            new Student("a1",47,85),
            new Student("a2",67,85),
            new Student("a3",47,75)
        };
        //大括號裡面給值,裡面用逗號,執行完步驟給; 代表結束

        System.out.println(s);
        System.out.println(s[0]+"\t"+s[0].show());
        System.out.println(s[1]+"\t"+s[1].show());
        System.out.println(s[2]+"\t"+s[2].show());

        System.out.println("====");

        System.out.println(s);
        for(int i=0;i<s.length;i++)
        {
            System.out.println("\t"+s[i]+s[i].show());
        }

        System.out.println("======");

        System.out.println(s);
        for(Student o:s)//複製Student裡面的東西
        {
            System.out.println("\t"+o+o.show());
        }
        
        //Student s=new Student("a1",70,80);
        //System.out.println(s.show());
    
    }
}