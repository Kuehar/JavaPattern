// Perfect Java P28~29
public class StringBuilderTest {
	/*
	 *引数のsbの文字列中の小文字を大文字に置換
	 *注意：StringクラスのtoUpperCaseメソッドを使うコードの方が良いコードです 
	 */
	static void stringBuilderToUpperCase(StringBuilder sb) {
		for(int i=0;i<sb.length();i++) {
			char c = sb.charAt(i);
			char uc = Character.toUpperCase(c);
			sb.setCharAt(i,uc);
		}
	}
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.err.println("引数に文字列を指定してください");
			System.exit(-1);
		}
		StringBuilder input = new StringBuilder(args[0]);
		stringBuilderToUpperCase(input); // もし第一引数の文字列が"abc"であれば
		System.out.println(input); // この行が"ABC"を出力する
	}
}
