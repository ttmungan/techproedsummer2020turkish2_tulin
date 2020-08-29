package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		  
		E01 obj= new E01(); {
		System.out.println(obj.getYear());
			
//		obj.setYear(2020);
//		System.out.println(obj.setYear());
		
		obj.setCh('Z');
		System.out.println(obj.getCh());
		
		System.out.println(obj.getName());
		
		obj.setName("yigido");
		System.out.println(obj.getName());
			
		
		E03 ob= new E03();
		System.out.println(ob.getName());
		System.out.println(ob.getAge());
		
		ob.setDepth(2300.24f);
		
		ob.setAge((byte) 25);
		System.out.println(ob.getAge());
		
			
		}

		}
			
		}




