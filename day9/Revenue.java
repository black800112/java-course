class Revenue
{
    //fields
    int storeNo;//門市編號
    int targetSales;//三日目標
    int totalSales;//三日總營收
    double averageSales;//平均日營收
    double achievementRate;//達成率
    char performanceLevel;//績效等級
    double bonusRate;//獎金率
    double bonus;//門市獎金


    //consturctors 
    Revenue(int storeNo,int targetSales,int totalSales)
    {
        this.storeNo=storeNo;//輸入門市
        this.targetSales=targetSales;//輸入三日目標
        this.totalSales=totalSales;//輸入三日營收
        this.averageSales=totalSales/3.0;//平均日營收
        this.achievementRate=this.totalSales/this.targetSales;//達成率

        if(achievementRate>=1)
        {
            this.performanceLevel='A';
            this.bonusRate=0.03;
        }
        else if(achievementRate>=0.9 && achievementRate<1)
        {
            this.performanceLevel='B';
            this.bonusRate=0.01;
        }
        else
        {
            this.performanceLevel='C';
            this.bonusRate=0.00;
        }
        this.bonus=this.totalSales*this.bonusRate;
    }
    
    void show()
    {
        System.out.println("====門市三日績效結果===="+
                            "\n門市編號"+storeNo+
                            "\n三日營收目標"+targetSales+
                            "\n三日總營收"+totalSales+
                            "\n平均日營收"+averageSales+
                            "\n達成率"+achievementRate+
                            "\n達成績效"+performanceLevel+
                            "\n獎金率"+bonusRate+
                            "\n門市獎金"+bonus);
    }



    /*mithods

    */
}