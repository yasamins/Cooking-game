import java.util.HashMap;
import java.util.Scanner;


public class Dictionary {
	HashMap <String , String> dictionary= new HashMap<String, String>();
	public String word;
	
	public void Scanner() {
		Scanner s1=new Scanner(System.in);
		word=s1.next();
	      

	}
	public void dictionary() {
		if (dictionary.containsKey(word)){
			System.out.println(word);
		} else {
			System.out.println("I dont understand what are you trying to say ");
			dictionary();
		}
	
	}



		public void addDict() {
			dictionary.put("pan", "pannu");
			dictionary.put("rice", "riisi");
			dictionary.put("chicken", "kana");
			dictionary.put("barberry", "happomarjapensas");
			dictionary.put("onion", "sipuli");
			dictionary.put("tomato sauce", "tomaattikastiketta");
			dictionary.put("saffron powder", "sahrami jauhe");
			dictionary.put("oil", "šljy");
			dictionary.put("spices", "mausteet");
			//dictionary.put("onion", 2);
			//dictionary.put("sipuli", 2)
				
		
		
		}
		public void printKeys(){
			for ( String word : dictionary.keySet()){
				System.out.println(word);
			}
		
		}
}