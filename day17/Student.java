class Student
{
        private String name;
        private int chi;
        private int eng;
        private int sum;

        Student(String name,int chi,int eng)
        {
        this.name=name;
        this.chi=chi;
        this.eng=eng;
        this.sum=sum;

        sum=chi+eng;
        }
    

    String show()
    {
        return ("名："+name+
                 "\t國文："+chi+
                "\t英文："+eng+
                "\t總分："+sum);
    }
}