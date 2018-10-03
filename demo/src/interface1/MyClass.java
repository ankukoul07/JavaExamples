package interface1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank abc=new Bank_Axis();
	Bank def=new Bank_Sbi();
	Bank ijk=new Bank_ICICI();
	
	System.out.println(abc.getIntrestRate());
	System.out.println(def.getIntrestRate());
	System.out.println(ijk.getIntrestRate());
	}

}
