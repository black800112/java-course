/*

*/
class Ex2
{
	public static void main(String[] args)
	{
		byte x=10;//右邊預設為int的10,但左邊宣告為byte,所以要強制轉型,int auto cast to byte
		System.out.println("x="+x);//上一行已宣告x為10,但雙引號內強制為文字,文字數字不可一起出現,故用加號隔開
	
		System.out.println("==========");

		byte x2=(byte)130;//右邊int(130)-->左邊byte(沒有130)-->手動casting(手動在右邊輸入byte)

		System.out.println(x2);
		//byte數值為-128~127,所以130會變成-126,因為byte的範圍是256個數字

		short x3=130;
		//須重新宣告一個範圍

		System.out.println(x3);
		System.out.println("==========");

		float x4=(float)10.12;//casting
		float x5=10.12f;//f表示float,不加f會被當成double,所以要加f(直接使用float表)
		float x6=10.12F;//java.lang.Float

		int x7=10;//整數預設先抓int表
		double x8=10.12;小數點預設先抓double表
	}
}