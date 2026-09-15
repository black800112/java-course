class Ex3
{
    public static void main(String[] args)
    {
        long x=10;
        float x2=x;
        System.out.println(x2);
        //long x3=x2;

        //int x3=10+10.12f+10.12; //f代表float float位階>整數
        //錯誤訊息：error: incompatible types: possible lossy conversion from double to int


    }
}

//1bc
//2f
//3abd
//a
//5e xxx c  s+=i => 文字加數字的概念"s"+i => 10100
//6b xxx c. 1沒有等於2 前面f &&後面不用做
//7b
//8b ^是xor 只能擇1為true 兩個都true會變成false
//9d xxx b 沒有{} 只影響第一行的輸出 第二行不會影響
//10c xxx b 11 22 33 44 55 => x到五了 跳出去
//11b xxx f 代碼只能在for前面(label寫法)
//12d f  1999+1=2000等於2000->f ^ 2000不等於1999->f
//13? xxx b
/*
x=0 y=0 str=str+0+0
x=0 y=1 str=0+0+0+1
x=1 y=0 str=0+0+0+1+1+0 x==1 break(不顯示這一行)
*/

/*
1.請選擇合法的敘述句。(選擇2個)
  A. String #s1="Hi!";
  B. int $money=1000;
  C. double _tax=0.06;
  D. double ~pi=3.14;

2.程式碼如下:
	
	01 int i=1;
	02 long I=1;
	03 float f=1.0f;
	04 double d=1.0;
	05 sum=i+I+f+d;

請問sum應該定義成什麼資料類型?
A. byte
B. short
C. int
D. long
E. float
F. double


3.下列選向哪些可以編譯成功?(選擇3個)
  A. int i=(int)(1+1.1f+1.1);
  B. double d=(float)(1+1.1f+1.1);
  C. long I=1+1.1f+1.1;
  D. float f=(long)(1+1.1f+1.1);
  E. int i=(int)1.1f+1.1;


4. 7+6-5*4/3%(2+1)的結果為何?

    A. 13
    B. 14
    C. 15
    D. 16
    E. 17


5.程式碼如下，請問最後結果為何?

    01. int i=100;
    02. String s="10";
    03. s+=i;
    04. System.out.println(s);

  A. 110
  B. 10010
  C. 10100
  D. 11000
  E. 編譯失敗

6.程式碼如下，請問最後結果為何?

     01. boolean result;
     02. int i=1;
     03. result=1==2 && ++i>=2;
     04. System.out.println("result="+result+",i="+i);

   A. result=true , i=1
   B. result=true , i=2
   C. result=false , i=1
   D. result=false , i=2
   E. 編譯失敗


7. 程式碼如下，請問最後結果為何?
    
      01. int x=1, y=1;
      02. boolean b=++x>++y;
      03. System.out.println(b);


   A. true
   B. false
   C. 編譯失敗


8.程式碼如下，請問最後結果如何?
     
      01. int x=1 , y=1;
      02. boolean b=!(x>y)^!(x<y);
      03. System.out.println(b);

    A. true
    B. false
    C. 編譯失敗

9.程式碼如下,請問最後結果如何?
	01. class Test{
	02.     public static void main(String args[]){
	03.        int x=2;
	04. 	   int y=1;
	05.        if((x==1)&&(y == 2))
	06.            System.out.print("x=1,");
	07.            System.out.print("y=2, ");
	08.        if((x+y)==3)
	09.            System.out.print("x+y=3");
	10.        }
	11.  }
  
  A. x=1 , y=2 , x+y=3
  B. y=2 , x+y=3
  C. x=1 , y=2
  D. x+y=3
  E. 編譯失敗

10.程式碼如下，請問最後結果為何?
	01. int x=0;
	02. int y=0;
	03. do{
	04. y++;
	05. ++x;
	06. }while(x<5);
	07. System.out.println(x+","+y);

 A. 5,6
 B. 5,5
 C. 6,5
 D. 6,6
 E. 編譯失敗


11.程式碼如下，請問最後結果為何?
	01. class Test{
	02. public static void main(String args[]){
	03. String str;
	04. z:
	05. str="";
	06. for(int x=3;x<8;x++){
	07.    if(x==4) break;
	08.    if(x==6) break z;
	09.    str+=x;
	10.    }
	11.    System.out.println(str);
	12.   }
	13. }

 A. 3
 B. 34
 C. 345
 D. 3456
 E. 34567
 F. 編譯失敗


12.程式碼如下，請問最後果為何?
	01. class Test{
	02. public static void main(String args[]){
	03.     int i=2000;
        04.     int j=1999;
	05.     int k=1000;
       	06.     if((i>j)^((k*2)==i))
	07.        System.out.println(1);
	08.     if((j+1)!=i^((k*2)==j))
	09.        System.out.println(2);
	10.    }
	11. }

 A. 1
 B. 2
 C. 12
 D. 沒有任何輸出
 E. 執行失敗
 F. 編譯失敗


13.程式碼如下，請問最後結果為何?
	01. class Test{
	02. public static void main(String args[]){
	03.     String str="";
	04.     z:
	05.     for(int x=0;x<3;x++){
	06.         for(int y=0;y<2;y++){
	07.             if(x==1) break;
	08.             if(x==2) break z;
	09.             str=str+x+y;
	10.          }
	11.      }
	12.      System.out.println(str);
	13.     }
	14. }

 A. 00
 B. 0001
 C. 000110
 D. 00011011
 E. 編譯失敗

*/