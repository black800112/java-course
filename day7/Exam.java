class Exam
{
    public static void main(String[] args)
    {
        /*
        1.輸入
        車輛數量carAmount
        車種代碼carCode
        停車時數hour
        會員member

        2.計算判斷
        基本停車費sum=車種*時數=>carCode*hour
        會員停車費money
        應付金額sum

        3.輸出
        車種代碼
        停車時數
        是否會員
        基本停車費
        應付金額

        ---------

        有效車輛數
        今日總營收

        */

       java.util.Scanner sc=new java.util.Scanner(System.in);

       int carAmount=0,
            carCode=0,
            hour=0,
            member=0,
            price=0,
            discount=0,
            count=0,
            total=0,
            sum=0;

        System.out.println("請輸入要處理的車輛數量");
        carAmount=sc.nextInt();

        for(int i=1;i<=carAmount;i++)
        {
            System.out.println("第"+i+"台車");
            System.out.println("請輸入車種：1.機車 2.汽車 3.大型車");
            carCode=sc.nextInt();
            boolean car=true;

            System.out.println("停車時數");
            hour=sc.nextInt();

            System.out.println("是否為會員：1.是 2.否");
            member=sc.nextInt();

            switch(carCode)
            {
                case 1:
                        price=20;
                        break;
                case 2:
                        price=50;
                        break;
                case 3:
                        price=80;
                        break;
                default:
            }
        

        sum=hour*price;

        if(member==1)
        {
            if(sum>=300)
            {
                discount=(int)(sum*0.8);
            }
            else
            {
                discount=(int)(sum*0.9);
            }
        }
        else
        {
            discount=sum;
        }

        System.out.println("基本停車費"+sum);
        System.out.println("折扣後金額"+discount);

        if(car) count++;
        total=total+discount;
        }

        System.out.println("\n\n有效車輛數"+count);
        System.out.println("總營收"+total);
    }
        
}