package test.string;

public class MainClass {
	public static void main(String[] args) {
		String name1 = "김구라";
		String name2 = "김구라";
		String name3 = new String("김구라");
		String name4 = new String("김구라");
		
		System.out.println(name1);
		System.out.println(name3);
		//String Type의 참조값 비교
		boolean result1 = name1 == name2; //True
		boolean result2 = name1 == name3; //False
		boolean result3 = name1.equals(name2); //True
		boolean result4 = name1.equals(name3); //True
		boolean result5 = name1.equals(name4); //True
		boolean result6 = "김구라".equals(name1);
		boolean result7 = name1.contentEquals("김구라");
	}
}
