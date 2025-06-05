	public static void main(String[] args) {
		int hp =500;
		int mp = 50;
		String name = "tukusi";
		
		information(name , hp , mp);
		System.out.println();
		attack(name , hp);


}
	public static void information(String name , int hp , int mp) {
		System.out.println("名前：" + name);
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
	}
	
	public static void attack( String name , int mp) {
		System.out.println( name + "勇者はは棍棒を振った");
		System.out.println("ダメージ30あたえた！");
		mp -= 3;
	}
