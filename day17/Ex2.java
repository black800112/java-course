class Ex2
//二維陣列
{
    public static void main(String[] args)
    {
        Student[][] s=new Student[2][3];//[二維陣列][三組資料]
        //給名稱

        s[0][0]=new Student("a1",80,60);
        s[0][1]=new Student("a2",70,65);
        s[0][2]=new Student("a3",60,70);

        s[1][0]=new Student("b1",70,80);
        s[1][1]=new Student("b1",50,65);
        s[1][2]=new Student("b1",70,65);
        //給值


        System.out.println(s);
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
                for(int j=0;j<s[i].length;j++)
                {
                    System.out.println("\t"+s[i][j]+"\t"+s[i][j].show());
                }
                //給值確定有資料才可以加show
        }

        System.out.println("====");

        for(Student[] o:s)//複製Student一維陣列裡面的內容
        {
            System.out.println("\t"+o);
                for(Student u:o)//複製一維陣列底下值的內容
                {
                    System.out.println("\t\t"+u);
                }
        }
    }
}