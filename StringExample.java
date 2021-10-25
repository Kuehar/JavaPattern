// Perfect Java P.24
// コマンドライン引数で与えた文字列をメールのFromヘッダの行として<>を除外し、メールアドレスを抽出するコード
// treating giving String argument such as mail header with cmd as mailaddres, and extracting mailaddres by excluding '<','>' from mail header.

class Main{
	public static void main(String... args) {
		if(args.length < 1) {
			System.err.println("引数にメールのFromヘッダを指定してください");
			System.exit(-1); // プログラムを途中で終了する簡易コード
        }
		String input = args[0];
		int begin = input.indexOf('<');
		if(begin>=0) {
			begin++;
			int end = input.indexOf('>');
			if(end > begin) {
				String addr = input.substring(begin,end);
				System.out.println(addr);
			}
		}
	}
}
