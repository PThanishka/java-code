class Shadowingproblem {
	String color;
	String model;
	double price;
	void drive(){
		System.out.println("drive safely");
	}
	void honk() {
		System.out.println("sound nonk");
	}
	Car (String color,String model,double price)
	{
		this.color=color;
		this.model=model;
		this.price=price;
	}
}