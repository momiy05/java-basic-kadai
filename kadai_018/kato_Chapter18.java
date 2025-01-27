package kadai_018;

public abstract class kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String address ="東京都中野区〇×";
	
	public void commonintroduce() {
		System.out.println("私の名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	public abstract void eachintroduce();
	public void execintroduce() {
		this.commonintroduce();
		this.eachintroduce();
	}
}
