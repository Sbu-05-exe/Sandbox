public class Class {

	public static int x;
	public int y;

	public Class() {

	}

	public static void main(String[] args) {
		
		Class a = new Class();
		Class b = new Class();

		System.out.println(a.x);
		System.out.println(b.x);
	}

}