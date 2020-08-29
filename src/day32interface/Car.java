package day32interface;

public interface Car {
	/*
	 *  Abs class larýn içine concrete methodlar koyabilirdik ama interfacelerin içine
	 *  (bazý özel durumlar hariç) concrete method koyamayýz. Yani; interface ler sadece abs method içerebilir.
	 *  Bu yüzden interface kullanýmý "full abstraction" olarak adlandýrýlýr.
	 *  Interface ler içlerindeki methodlarý default olarak abs kabul ederler.Bu sebeple method oluþtuturken
	 *  Interface in içine concrete method koyarsak cte verir.
	 *  Interface lerdeki methodlarýn access modifier ý  default olarak "public" olurlar.Protected, private ve default olamazlar.
	 *  Interface lerde variable lar default olarak "final" olurlar.
	 *  Interface lerde variable larýn access modifier larý public olur.
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
