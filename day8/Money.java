class Money
{
    //宣告
    int employeeNo;//員編
    int baseSalary;//底薪
    int sales;//本月業績
    int target;//業績目標
    double bonusRate;//獎金率
    double bonus;//獎金
    double totalSalary;//總薪資

    //計算
    Money(int employeeNo,int baseSalary,int sales,int target)
    {
        
        this.employeeNo=employeeNo;
        this.baseSalary=baseSalary;
        this.sales=sales;
        this.target=target;
        
        if(sales>=target) bonusRate=0.05;
        if(sales<target) bonusRate=0;
        this.bonus=sales*bonusRate;
        
        totalSalary=baseSalary+bonus;
    }

    void show()
    {
        System.out.println("員編："+employeeNo+
                            "\n底薪："+baseSalary+
                            "\n本月業績："+sales+
                            "\n業績目標："+target+
                            "\n獎金率："+bonusRate+
                            "\n獎金："+bonus+
                            "\n本月總薪資"+totalSalary);
    }

}