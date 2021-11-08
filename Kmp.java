
public class Kmp {
	static int kmpMatch(String target,String pattern) {
		int pt = 1; // targetをなぞるカーソル
		int pp = 0; // patternをなぞるカーソル
		int[] skip = new int[pattern.length()+1]; // patternのスキップする数を保存
		
		// スキップテーブルの作成
		skip[pt] = 0;
		while(pt != pattern.length()) {
			System.out.println(pt + "," + pp);
			if(pattern.charAt(pt) == pattern.charAt(pp)){
				skip[++pt] = ++pp;
			}else if(pp == 0) {
				skip[++pt] = pp;
			}else {
				pp = skip[pp];
			}
			for(int a:skip) {
				System.out.println(a + ",");
			}
		}
		return -1;
	}
}
