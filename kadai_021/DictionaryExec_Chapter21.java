package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成する
		Dictionary_Chapter21 search = new Dictionary_Chapter21();
		
		//調べる英単語配列にセット
		String [] searchWord = {"apple", "banana", "grape", "orange"};
		
		//辞書を調べるメソッドを引数指定で呼び出す
		for (String searchloop : searchWord) {
			search.dictionary(searchloop);
			
		}
		

	}
	
	
	

}
