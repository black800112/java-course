class AddFv
{
	public static void main(String[] args)
	 {
		//Fv.pv=5000;//前面有static,代表在new之前要先做
		//f2.r=0.0142;這句不會編譯成功

		Fv.setPv(60000);
		Fv f1=new Fv(0.015,2);
		//前面有絕對位置的pv,所以後面的數值可以不用給
		Fv f2=new Fv(0.014,3);
		Fv f3=new Fv(0.013,4);
		Fv f4=new Fv(0.012,5);

		f1.show();
		f2.show();
		f3.show();
		f4.show();

		System.out.println("===================");

		//System.out.println(f1.companyName());//原先的版本
		System.out.println(Fv.companyName());//把物件名稱改成class名稱

		//f1.pv=5000;
		//如果是共用(絕對位置),直接把f1改成clsaa的名稱,這樣可清楚的知道這一個是共用的
		//不是單獨的物件(object),如以下
		//Fv.pv=5000;
		f2.setR(0.012);
		//f2.r=0.0142;
		Fv.setPv(6000);
		//Fv.java檔案裡面,前面有加static,所以可以把物件名稱(f1)改成class名稱(Fv)

		f1.show();
		f2.show();
		f3.show();
		f4.show();

		System.out.println("===================");

		System.out.println("20*30="+(Fv.cal(20,30)));
		//Fv.java檔案裡面,cal前面有加static,所以可以把物件名稱(f1)改成class名稱(Fv)

		

	}
}