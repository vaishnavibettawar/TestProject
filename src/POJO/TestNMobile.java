package POJO;

public class TestNMobile {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Battery obj = new Battery(101 , "vivo" , 900);
	Mobile mob = new Mobile(11, "Vivo Y21" , 10000 , obj );

		System.out.println(mob);
		System.out.println(mob.getBattery().getId());
		System.out.println(mob.getBattery().getName());
		System.out.println(mob.getBattery().getPrice());
	}

}



