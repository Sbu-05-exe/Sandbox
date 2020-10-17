public class replaceQ {
hg
	public static void main(String[] args) {
	// how to remove questions marks from a string

		String str = "Is this a question?";

		System.out.println(str.replaceAll("\\?", ""));
		
	}

}