/*
compiler(編譯)
1)->call by reference(文件)-->檢查英文
-->java.lang api文件 (java8 api)
-->同一位置 的class裡面有沒有設計這個功能

2)->call by value-->檢查功能
*/



import java.util.Scanner;
import java.util.Date;
//import java.util.*;//*表示萬用字元 但不建議此用法 容易找不到錯誤
class Add2
{
    public static void main(String[] args)
    {
        java.lang.Thread T1=new java.lang.Thread();//絕對路徑
        Thread T2=new Thread();//相對路徑
        
        Order O1=new Order(1,1);//(在同一位置)
        java.util.Scanner sc=new java.util.Scanner(System.in);

        Scanner sc2=new Scanner(System.in);//會從預設的java.lang api文件先找 沒有才會去找相同位置
        //若要使用相對位置 要在class前面先定義好位置(如12行)

        
        java.util.Date D=new java.util.Date();
        Date D2=new Date();//須先設定import




    }
}