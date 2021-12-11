
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
	/*
	* ソートしていい場合にはソートしてそれぞれを比較すればOK
	*/
	public boolean permutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	public boolean permutation2(String s,String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		
		int[] letters = new int[256];
		
		char[] s_array = s.toCharArray();
		for(char c: s_array) {
			letters[c]++;
		}

		for(int i=0;i<t.length();i++) {
			int c = (int) t.charAt(i);
			if(--letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * 文字列内に存在する空白文字を"%20"で置き換えるメソッド
	 */
	
	public void replaceSpaces(char[] str,int length) {
		int spaceCount = 0,newLength = 0;
		for(int i=0;i<length;i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}
		newLength = length + spaceCount * 2;
		str[newLength] = '0';
		for(int i=length-1;i>=0;i--) {
			if(str[i] == ' ') {
			str[newLength-1] = '0';
			str[newLength-2] = '2';
			str[newLength-3] = '%';
			newLength = newLength-3;
		}else {
			str[newLength-1] = str[i];
			newLength = newLength-1;
		}
	}	
	}

	/*
	 * 文字列圧縮アルゴリズム(微妙なやつ)
	 */
	public String compressBad(String str) {
		String myStr = "";
		char last = str.charAt(0);
		int count = 1;
		for(int i=1;i < str.length();i++) {
			if(str.charAt(i) == last) {
				count++;
			}else{
				myStr += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}
		}
		return myStr + last + count;
	}
	
	/*
	 * 文字列圧縮アルゴリズム(そこそこ良さげ)
	 */
	String compressBetter(String str) {
		// 圧縮後の文字列が長くなるかをチェック
		int size = countCompression(str);
		if(size >= str.length()) {
			return str;
		}
		
		StringBuffer myStr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == last) {
				count++;
			}else {
				myStr.append(last);
				myStr.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		myStr.append(last);
		myStr.append(count);
		return myStr.toString(); 
	}
	int countCompression(String str) {
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == last){
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count += 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}

}
