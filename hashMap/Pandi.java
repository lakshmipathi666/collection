package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Pandi {
	
		public static void main(String[] args) {
			Bike b1=new Bike("yamaha",150000,"green",2456);
			Bike b2=new Bike("tvs",200000,"black",2015);
			Bike b3=new Bike("Honda",100000,"Red",1495);
			Bike b4=new Bike("BMW",145666,"Grey",1642);
			Bike b5=new Bike("BAjaj",164635,"Red",4685);
			Bike b6=new Bike("hero",143525,"green",6495);
			Bike b7=new Bike("audi",552185,"yellow",4541);

			HashMap<Integer,Bike>bikes=new HashMap<>();
			
			bikes.put(b1.getRegisterNo(), b1);
			bikes.put(b2.getRegisterNo(), b2);
			bikes.put(b3.getRegisterNo(), b3);
			bikes.put(b4.getRegisterNo(), b4);
			bikes.put(b5.getRegisterNo(), b5);
			bikes.put(b6.getRegisterNo(), b6);
			bikes.put(b7.getRegisterNo(), b7);
			
			ArrayList<Bike>k=new ArrayList<>();
			for(Integer x:bikes.keySet()) {
				if(bikes.get(x).getColor().equalsIgnoreCase("RED")) {
					k.add(bikes.get(x));
					
				}
				
			}
			System.out.println(k);
			
			
			
		}
}

