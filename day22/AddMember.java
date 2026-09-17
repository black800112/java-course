class AddMember
{
	public static void main(String[] args) {
		Member m1=new Member("abc","def");
		System.out.println("名:"+m1.name+"\t帳號:"+m1.userName);
		m1.name="yyy";
		m1.userName="uuu";
		//userName有加final 所以不能new後更改
		System.out.println("名:"+m1.name+"\t帳號:"+m1.userName);
	}
}