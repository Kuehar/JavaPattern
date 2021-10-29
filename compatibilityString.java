
public class compatibilityString {
	public static void main(String[] args) {
		// StringオブジェクトからStringBuilderオブジェクトに変換
		String s = "abc";
		StringBuilder sb = new StringBuilder(s);
		
		/* StringBuilderオブジェクトからStringオブジェクトに変換
		 * StringBuilder sb = new StringBuilder("abc");
		 * String s = sb.toString();
		 */
		
	}
}
