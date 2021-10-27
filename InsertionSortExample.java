
public class InsertionSortExample {
	/* トランプの手札を正しい位置に入れていくイメージ
	 * 最悪の場合の計算量はiのループの各処理がi回行われるのでO(N^2)となる。
	 * Introduction to Algorithms P.15
	 */ 
	public static void insertionSort(int array[]) {
		for(int j=1;j<array.length;j++) {
			int key = array[j];
			int i = j-1;
			// array[j]をソート済みの配列array[1..j-1]に挿入する
			while((i>-1) && (array[i]>key)) {
				array[i+1] = array[i];
				i--;
			}
			array[i+1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {9,13,3,2,43,11,58,22};
		System.out.println("Before Insertion Sort");
		for(int i:arr1) {
			System.out.println(i+" ");
		}
		System.out.println();

		insertionSort(arr1);

		System.out.println("After Insertion Sort");
		for(int i:arr1) {
			System.out.println(i+" ");
		}
	}
}
