import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		int x=0;
		int y=0;
		char c;
		do {
			System.out.println("["+x+","+y+"]");
			str = scan.nextLine();
			c= str.charAt(0); // 1文字目を取得
			if( c == 'a')x = ((x-1)%5+5)%5;
			else if( c == 'd')x = ((x+1)%5+5)%5;
			else if( c == 'w')y = ((y+1)%5+5)%5;
			else if( c == 's')y = ((y-1)%5+5)%5;
			else break;
		}while( true );
		System.out.println("終了します");
	}

}
