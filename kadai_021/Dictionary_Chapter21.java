package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String,String> mapl = new HashMap<String,String>();
	public Dictionary_Chapter21() {
		mapl.put("apple","リンゴ");
		mapl.put("peach","桃");
		mapl.put("banana","バナナ");
		mapl.put("lemon","レモン");
		mapl.put("pear","梨");
		mapl.put("kiwi","キウィ");
		mapl.put("strawberry","いちご");
		mapl.put("grape","ぶどう");
		mapl.put("muscat","マスカット");
		mapl.put("cherry","さくらんぼ");
	}
	public void searchMaps(String word[]) {
		for(int i = 0; i < word.length;i++) {
			String rt = this.mapl.get(word[i]);
			if(rt == null) {
				System.out.println("該当なし");
			}else {
				System.out.println(word[i] + "の意味は" + rt);
			}
		}
	}
}
