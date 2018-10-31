
public class Test {
	public static void main(String[] args) {
		
		Person siro = new Person();
		siro.name = "siro";
		siro.age = 18;
		System.out.println(siro.name);
		System.out.println(siro.age);
		
		Person goro = new Person("goro",20);
		System.out.println(goro.name);
		System.out.println(goro.age);
		
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		Person nanashi = new Person(25);
		System.out.println(nanashi.name);
		System.out.println(nanashi.age);
		
		Person maruko = new Person(17,"maruko");
		System.out.println(maruko.name);
		System.out.println(maruko.age);
				
		
		
		
		
		
		Person taro = new Person();
	
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-8787-7878";
		taro.address = "埼玉県さいたま市";
		
		taro.talk();
		taro.walk();
		taro.run();
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "070-3434-4343";
		jiro.address = "福岡県福岡市";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "090-5454-4545";
		hanako.address = "大阪府守口市" ;
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		
		Person nanami = new Person();
		nanami.name = "宇津原ななみ";
		nanami.age = 25;
		nanami.phoneNumber = "080-0808-8080";
		nanami.address = "鳥取県鳥取市";
		System.out.println(nanami.name);
		System.out.println(nanami.age);
		System.out.println(nanami.phoneNumber);
		System.out.println(nanami.address);
		
		Robot aibo = new Robot();
		aibo.name = "アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name = "アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		pepper.name = "ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();
		
		Robot doraemon = new Robot();
		doraemon.name = "ドラえもん";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
		
		
	}

}
