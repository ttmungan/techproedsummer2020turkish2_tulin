package day15Constructors;

public class Araba {
	int yil=2019;
	String marka= "Toyota";
	String model= "Rav4";
	int fiyat= 20000;
	
	Araba(String model, int fiyat){
		this.model= model;
		this.fiyat=fiyat;
	}
	
	Araba(String model, int fiyat, String marka, int yil ){
		this.fiyat=fiyat;
		this.marka=marka;
		this.model=model;
		this.yil=yil;
	}
	
	Araba () {
		
	}

		public static void main(String[] args) {
		Araba a1= new Araba();
		System.out.println("Fiyat:"+ a1.fiyat);
		System.out.println("Marka:" +a1.marka);
		System.out.println("Model:" +a1.model);
		System.out.println("Yýl:" +  a1.yil);
		a1.hizlanma();
		a1.tuketim();
		System.out.println("---------------");
		
		Araba a2 = new Araba ("Corolla",12000);
		System.out.println("Fiyat:"+ a2.fiyat);
		System.out.println("Marka:" +a2.marka);
		System.out.println("Model:" +a2.model);
		System.out.println("Yýl:" +  a2.yil);
		a2.hizlanma();
		a2.tuketim();
	
		
		
		Araba a3 = new Araba ("A180",120000,"Mercedes",2020);
		System.out.println("Fiyat:"+ a3.fiyat);
		System.out.println("Marka:" +a3.marka);
		System.out.println("Model:" +a3.model);
		System.out.println("Yýl:" +  a3.yil);
		a3.hizlanma();
		a3.tuketim();
	}
	
	public void hizlanma() {
		System.out.println("7 sn'de 100 km/sa e ulasýr");
	}

	public void tuketim () {
		System.out.println("km'de 0.1 dolar ykar");
		
		
		
		
		
		
		
		
	}
}
