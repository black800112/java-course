class A extends Company
{
    int lcd;

    A (String name,int lcd)
    {   
        super(name);//<-這個才是關鍵,要放在最上面
        //意指在執行下面步驟之前 要先去看 extends 後面的父類別
        //先執行父類別的建構式

        this.lcd=lcd;
        //這邊的this意指本身的class的lcd
        
        //()裡面只要類型一樣即可
        System.out.println("A部門員工,lcd="+lcd);
    }
}