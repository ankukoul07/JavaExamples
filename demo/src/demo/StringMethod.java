package demo;

public class StringMethod {
	String age,name,city;
	StringMethod(String age,String name,String city)
	{
		this.age=age;
		this.name=name;
		this.city=city;
		
	}
	
	@Override
	public String toString() {
		return "StringMethod [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringMethod sm=new StringMethod("12","ankush","pune");
		
		System.out.println(sm);
	

	}

}
