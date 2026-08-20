class Ex6
{
    public static void main(String[] args)
    {
        int chinese=10;
        System.out.println("chinese="+chinese);

        //chinese=chinese+20;
        chinese+=20;//+=為縮寫,等於chinese=chinese+20
        //9行的左chinese是變數,+=為縮寫,整題呈現為chinese=chinese+20,右邊的chinese取上一個chinese等於取第五行的chinese
        System.out.println("chinese="+chinese);

        //chinese=chinese-10;
        chinese-=10;
        System.out.println("chinese="+chinese);

        //chinese=chinese*3;
        chinese*=3;
        System.out.println("chinese="+chinese);

        //chinese=chinese/5;
        chinese/=5;
        System.out.println("chinese="+chinese);

        //chinese=chinese%7;
        chinese%=7;
        System.out.println("chinese="+chinese);
    }
}