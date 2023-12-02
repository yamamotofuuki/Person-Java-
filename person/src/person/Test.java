package person;

public class Test {
	public static void main(String[]agrs) {
		Person taro = new Person();
		
		taro.name ="山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-000-000";
		taro.address = "北海道";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		
		//木村次郎(追加分)
		Person jiro = new Person();
		
		jiro.name ="木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "111-111-111";
		jiro.address = "東京都";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		
		//鈴木花子(追加分)
		Person hanako = new Person();
		
		hanako.name ="鈴木花子";
		hanako.age =16;
		hanako.phoneNumber = "222-222-222";
		hanako.address = "大阪府"; 
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		
		//自分(追加分)
		Person fuuki = new Person();
		
		fuuki.name ="山本風樹";
		fuuki.age =24;
		fuuki.phoneNumber = "333-333-333";
		fuuki.address = "兵庫県";
		
		System.out.println(fuuki.name);
		System.out.println(fuuki.age);
		System.out.println(fuuki.phoneNumber);
		System.out.println(fuuki.address);
		
		
		
		//演習課題⑦ (aibo)
		Robot aibo = new Robot();
		
		aibo.name = "aibo";
		
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		
		//演習課題⑦ (asimo)
		Robot asimo = new Robot();
		
		asimo.name = "asimo";
		
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		
		//演習課題⑦ (pepper)
		Robot pepper = new Robot();
		
		pepper.name = "pepper";
		
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
