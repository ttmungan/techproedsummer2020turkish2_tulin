package day32interface;

public interface Car {
	/*
	 *  Abs class lar�n i�ine concrete methodlar koyabilirdik ama interfacelerin i�ine
	 *  (baz� �zel durumlar hari�) concrete method koyamay�z. Yani; interface ler sadece abs method i�erebilir.
	 *  Bu y�zden interface kullan�m� "full abstraction" olarak adland�r�l�r.
	 *  Interface ler i�lerindeki methodlar� default olarak abs kabul ederler.Bu sebeple method olu�tuturken
	 *  Interface in i�ine concrete method koyarsak cte verir.
	 *  Interface lerdeki methodlar�n access modifier �  default olarak "public" olurlar.Protected, private ve default olamazlar.
	 *  Interface lerde variable lar default olarak "final" olurlar.
	 *  Interface lerde variable lar�n access modifier lar� public olur.
	 *  Interface lerde variable lar default olarak static olur. 
	 * 9)interface'lerde variable olusturdugunuzda mutlaka deger atamasi(initialize) yapmalisiniz.
	 10)interface'lerden obje uretilemez.
	 *  
	 */
	int i=12;
	public void motor();
	public abstract void direksiyon();
	public void teker ();
	void fiyat();
}
