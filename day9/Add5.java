
import java.util.Scanner;
class Add5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入姓名：");
        String name=sc.nextLine();

        System.out.println("lcd數量：");
        int lcd=sc.nextInt();

        System.out.println("ram數量：");
        int ram=sc.nextInt();

        System.out.println("是否為會員：true/false");
        boolean member=sc.nextBoolean();

        Order o=new Order(name,lcd,ram,member);

        o.show();

    }
}