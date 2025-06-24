package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
		
		//スキャナークラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		 
		//変数宣言
		boolean correctHand; 
		String input;
		 
		//正しいじゃんけんの手じゃない限りずっと続く
		do {
			
		 //入力内容を取得する
		 input= scanner.next();
	     
	   //正しいじゃんけんの手であるか判定
	     correctHand = (input.equals("r") || input.equals("s") || input.equals("p"));
	     
	     if (correctHand) {
	    	 
	     } else {
	    	 System.out.println("r, s, p のどれかを入力してください");
	     }
	     
		} while ( correctHand != true );
	     
		return input;
	     
	     
	}
	
	
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		//配列にじゃんけんの手セット
		String [] handArray = {"r","s","p"};
		
		//乱数でじゃんけんの手選ぶ
		int random = (int)(Math.floor(Math.random() * 3 ));
		
		return handArray[random];
		
		
	}
	
	//HashMapつくる
	HashMap<String, String> handMap = new HashMap<String, String>();
	
	//コンストラクタ
	public Jyanken_Chapter28 () {
	handMap.put("r","グー");
	handMap.put("s","チョキ");
	handMap.put("p","パー");
	}
				
	//じゃんけんを行う
	public void playGame(String myhand ,String vshand ) {
		
		System.out.println("自分の手は" + handMap.get(myhand) + ",対戦相手の手は" +  handMap.get(vshand));
		
		if (myhand.equals(vshand)) {
			System.out.println("あいこです");
		}else if( myhand.equals("r") && vshand.equals("s") || myhand.equals("s") && vshand.equals("p") || myhand.equals("p") && vshand.equals("r")){
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}

}
