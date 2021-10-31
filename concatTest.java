
public class concat {
  // ループごとにStringBuilderオブジェクトを生成し、2回のappend処理を行う
	static String concatTest1(String[] array) {
		String result = "";
		for(String s:array) {
			result += s; // +=演算で文字列結合
		}
		return result;
	}
  static String concatTest2(String[] array) {
		StringBuilder result = new StringBuilder();
		for(String s:array) {
			result.append(s); // +=演算で文字列結合
		}
		return result.toString();
	}
}
