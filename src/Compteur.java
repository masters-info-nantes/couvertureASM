import java.util.Map;
import java.util.TreeMap;


public class Compteur extends Object{

	private static Compteur cpt = new Compteur();
	
	private Map<String, Integer> map= new TreeMap<String, Integer>(); 
	
	private Compteur(){}
	
	public static Compteur getInstance(String s){
		return cpt;
	}
	
	public static void compte(String method){
		getInstance(method);
		System.out.println(method);
	}
}
