public class fruit {
	String name;
	String col;
	int quan;
//	public fruit(String n, String c, int q) {
//		name="����"; col="���"; quan=0;
//	}
	public fruit(String n, String c, int q) {
		name=n; col=c; quan=q;
	}
	public static void main(String[] args) {
		fruit apple=new fruit("���","������", 1);
		fruit banana=new fruit("�ٳ���", "�����", 5);
		fruit grape=new fruit("����", "�����", 12);
		System.out.println(apple.col+" "+apple.name+" "+apple.quan+"��");
		System.out.println(banana.col+" "+banana.name+" "+banana.quan+"��");
		System.out.println(grape.col+" "+grape.name+" "+grape.quan+"��");
	 }
}