class Ex3
{
    public static void main(String[] args)
    {
        //int[] x=new int[3];
        double[] x=new double[3];
        //boolean[] x=new boolean[3];
        //String[] x=new String[3];
        //Double[] x=new Double[3];
        //Boolean[] x=new Boolean[3];

        System.out.println(x);
        
        for(int i=0;i<3 ; i++)//索引名稱 索引碼有即可宣告變數可以不用一樣
        {
            System.out.println("\t"+x[i]);
        }

        System.out.println("======");

        //int[] x2=new int[3];
        //double[] x2=new double[3];
        //boolean[] x2=new boolean[3];
        //String[] x2=new String[3];
        //Double[] x2=new Double[3];
        Boolean[] x2=new Boolean[3];

        
       System.out.println(x2);
       for(Boolean o:x2)//複製陣列
       /*int o:x2 代表x陣列裡的每一個元素都給o,然後再印出o
       int o=x2[0]; int o=x2[1]; int o=x2[2]; 這樣寫也可以,但是要寫三次,所以用for迴圈比較方便
       int 0=x2[0] --> 0 copy x2[] 0 拷貝 x2中括號裡面的值
       for(int o:x2)是複製 所以宣告值要一樣
       */
       {
        System.out.println("\t"+o);
       }
       
    }
}