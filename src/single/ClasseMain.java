package single;

public class ClasseMain {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		
		NaoSingleton nS = new NaoSingleton();
		NaoSingleton nS2 = new NaoSingleton();
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println();
		System.out.println(nS);
		System.out.println(nS2);
		

	}

}
