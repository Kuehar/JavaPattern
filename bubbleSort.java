
public class bubbleSort {
	public void sort(int[] a) {
		// 最後の要素を除いて全ての要素を並び替える
		for(int i=0;i<a.length-1;i++) {
			// 下から順番に比較する
			for(int j=a.length-1;j>i;j--) {
			//　上の方が大きい時にはお互いに入れ替える
			if(a[i]<a[j-1]) {
				int t = a[j];
				a[j] = a[j-1];
				a[j-1] = t;
				}
			}
		}
	}
}
