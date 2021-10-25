class Main{
	public static void main(String[] args) {
		String s = "abc";
		// 以下の例はいずれもStringIndexOutOfBoundsExceptionが発生する
		s.charAt(-1);
		s.charAt(3);
		s.substring(1,3);
		s.substring(2,1);
	}
}
