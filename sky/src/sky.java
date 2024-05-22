public class sky {
	int rad;
	String name;
	
	public sky() {
		rad=1; name="";
	}
	public sky(int r, String n) {
		rad=r;name=n;
	}
	public double getArea() {
		return 3.14*rad*rad;
	}
	
	public static void main(String[] args) {
		sky sun=new sky(700000, "해님");
		double area=sun.getArea();
		System.out.println(area+sun.name);
	
		sky moon=new sky();
		moon.name="달님";
		area=moon.getArea();
		System.out.println(area+moon.name);
	}
}//원래 부피를 구하려해신디 세제곱을 어떻게하는지 몰름