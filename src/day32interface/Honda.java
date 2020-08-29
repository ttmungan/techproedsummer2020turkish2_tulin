package day32interface;

public class Honda implements Car,Klima {

	public static void main(String[] args) {
		/* Bir class � bir interface in child � yapmak i�in implements demek gerekir.
		 * Abstract class kullanarak abstraction yaparsak bir class'a 1'den fazla parent koyamay�z.
		 * Bu y�zden interface kullan�r�z ve bir class i�in 1'den fazla parent olu�turarak �al��abiliriz.
		 * Birden fazla interface i bir class i�in parent yapt���m�zda parent olan interface lerde ayn� isimli 
		 * methodlar kullanabilirsinz ama ayn� isimli methodlar�n return type lar� ayn� olmak zorundad�r. Ayn� olmazsa
		 * CTE al�rs�n�z. 
		 * 1)Bir class'i bir interface'in child'i yapmak icin "implements" keyword kullaniriz.
	 		2)Abstract class kullanarak abstraction yaparsak bir class'a 1'den fazla parent
			  koyamayiz cunku Java multiple inheritance'a musaade etmez. Bu yuzden interface
			  kullaniriz ve bir class icin 1'den fazla parent olusturarak calisabiliriz.
			 3)1'den fazla interface'i bir class icin parent yaptiginizda, parent olan 
			  interface'lerde ayni isimli method'lar kullanabilirsiniz ama ayni isimli 
			  methodlarin return type'lari ayni olmak zorundadir. Ayni olmazsa Compile
			  Time Error alirsiniz. 
			 4)1'den fazla interface'i bir class icin parent yaptiginizda, parent olan 
			  interface'lerde ayni isimli variable'lar kullanabilirsiniz. Ancak, 
			  hangi variable'i kullanacaginiza interface ismini kullanarak siz
			  karar vermelisiniz. Aksi takdirde Java hangisini kullanacagina karar 
			  veremez bu yuzden Compile Time Error alirsiniz.
		 */
		
		Honda honda= new Honda ();
		honda.antiBakteri();
		honda.teker();
		honda.motor();
		honda.direksiyon();
		honda.isitma();
		System.out.println(Car.i);

	}

	@Override
	public void motor() {
		System.out.println("1.6 VTEC Diesel");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Suni deri");
		
	}

	@Override
	public void teker() {
		System.out.println("16 inch ala��m");
		
	}

	@Override
	public void isitma() {
		System.out.println("Is�tma var");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("%99 bakteri koruma");
		
	}

	@Override
	public  void  fiyat() {
		
		
	}

}
