class Ex5
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int totalValdCars=0;
        double totalRevenue=0;

        //車輛數量
        System.out.println("請輸入今天要處理的車輛數量n:");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++)
        {
            System.out.println("處理第"+i+"台車");
        }

        System.out.println("請輸入車種代碼（1.機車,2.汽車,3.大型車）");
        int typeCode=sc.nextInt();

        int hourlyRate=0;
        String typeName="";
        boolean isTypeValid=true;


        //車種代碼決定每小時費率
        switch(typeCode)
        {
            case 1:
                typeName="機車";
                hourlyRate=20;
                break;
            case 2:
                typeName="汽車";
                hourlyRate=50;
                break;
            case 3:
                typeName="大型車";
                hourlyRate=80;
                break;
            default:
                System.out.println("無效的車種代表");
                isTypeValid=false;
                break;
        }
        if (!isTypeValid)
        {
            continue;
        }

        //停車時數
        System.out.println("請輸入停車時數：");
        int hours=sc.nextInt();

        if(hours<=0)
        {
            System.out.println("停車時數錯誤");
            continue;
        }

        //基本停車費
        double baseFee=hourlyRate*hours;

        //是否為會員
        
    
        //會員優惠


        //輸出 車種 基本停車費 折扣後金額


        //輸出 有效車輛數 總營收


    }
}