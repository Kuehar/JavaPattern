
public class competitiveProgramming {
	
	
	/*
	 * 文字列がASCIIかUnicodeなのかも重要な要素
	 * ASCIIの最適化として長さが256以上だとユニークでは無いことが決まるので初期チェックとして有効
	 * nを文字列のサイズとして、O(n),消費メモリはO(1)
	 */
	public boolean isUniqueChars2(String str) {
		if(str.length() > 256) {
			return false;
		}
		boolean[] char_set = new boolean[256];
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	/*
	 * ビットベクトルを使ったパターン
	 */
	public boolean isUniqueChars(String str) {
		if(str.length() > 256) return false;
		
		int checker = 0;
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}	
	
	
	/*
	* アナグラムかどうかを判別する時に使うソートメソッド
	*/
	public String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);	
	}	

}
