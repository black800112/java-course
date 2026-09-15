package com;

public class Student {
	private String name;
	private int chi;
	private int eng;
	private int sum;
	public Student(String name, int chi, int eng) {
		super();
		if(chi>=0&&chi<=100&&eng>=0&&eng<=100)
		{
			this.name = name;
			this.chi = chi;
			this.eng = eng;
			sum=chi+eng;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChi() {
		return chi;
	}
	public void setChi(int chi) {
		this.chi = chi;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	
	void show()
	{
		System.out.println("名:"+this.name+
				"\t國文:"+chi+
				"\t英文:"+eng+
				"\t總分:"+sum);
	}
	
	

}