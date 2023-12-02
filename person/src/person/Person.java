package person; //演習01(インスタンス化編)

public class Person {
	
	//「初期化」
	public String name = null;
	public int age = 0;
	public String phoneNumber = null;
	public String address = null;
	
	//演習⑤
	public void talk() {
		System.out.println(this.name + 	"が話す");
	}
	public void walk() {
		System.out.println(this.name + "が歩く");
	}
	public void run() {
		System.out.println(this.name + "が走る");
	}
	
}
