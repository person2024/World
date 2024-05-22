public class fruit {
	String name;
	String col;
	int quan;
//	public fruit(String n, String c, int q) {
//		name="과일"; col="녹색"; quan=0;
//	}
	public fruit(String n, String c, int q) {
		name=n; col=c; quan=q;
	}
	public static void main(String[] args) {
		fruit apple=new fruit("사과","빨간색", 1);
		fruit banana=new fruit("바나나", "노란색", 5);
		fruit grape=new fruit("포도", "보라색", 12);
		System.out.println(apple.col+" "+apple.name+" "+apple.quan+"개");
		System.out.println(banana.col+" "+banana.name+" "+banana.quan+"개");
		System.out.println(grape.col+" "+grape.name+" "+grape.quan+"알");
	 }
}