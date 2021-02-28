import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		int c = 88;
		
		HashMap<String, Integer> happy = new HashMap<String, Integer> ();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);
		
		System.out.println(happy.get("c"));

		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("Christian", "Rowe");
		fun.put("Caroline", "Vale");
		fun.put("Ryan", "Pabon");
		
		fun.remove("Ryan");
		
		System.out.println(fun);
		System.out.println(fun.containsValue("Caroline"));
		System.out.println(fun.containsKey("Caroline"));
		System.out.println(fun.replace("Christian", "Taylor"));
		System.out.println(fun.keySet());
		System.out.println(fun.values());
		System.out.println(fun);
	}

}
