// Perfect Java P.24

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
