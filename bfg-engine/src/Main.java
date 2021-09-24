import bfgElements.concepts.CharacterPlayableMaker;
import bfgElements.concepts.CharacterRole;

public class Main {
	
	private static MyPrototype getNewPrototype() {
		return new CPrototype1();
	}
	
	public static void main(String[] args) {
		
//		Playable character = new CharacterRole("Frodo");
//		Playable a = new CharacterPlayableMaker(role)
		MyPrototype p1 = getNewPrototype();
		System.out.println(p1.getS1());
		System.out.println(p1.getV1());
		
		p1.setS1("alpha");
		p1.setV1(7);
		
		MyPrototype p2 = p1.clone()
	}

}
