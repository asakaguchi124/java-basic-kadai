package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//英単語の辞書として機能する
	static HashMap<String, String> fruitMap = new HashMap<String, String>();
	
	public Dictionary_Chapter21 (){
		
		
		fruitMap.put("apple" ,"りんご");
		fruitMap.put("peach" ,"桃");
		fruitMap.put("banana" ,"バナナ");
		fruitMap.put("lemon" ,"レモン");
		fruitMap.put("pear" ,"梨");
		fruitMap.put("kiwi" ,"キウイ");
		fruitMap.put("strawberry" ,"いちご");
		fruitMap.put("grape" ,"ぶどう");
		fruitMap.put("muscat" ,"マスカット");
		fruitMap.put("cherry" ,"さくらんぼ");
		
	}
	
	public void dictionary (String searchloop) {
		
		if (fruitMap.get(searchloop) != null) {
			System.out.println(searchloop + "の意味は" + fruitMap.get(searchloop)  );
		} else {
			System.out.println(searchloop + "は辞書に存在しません");
		}
		
	}
	

}
