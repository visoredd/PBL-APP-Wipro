abstract class Instrument{
	public abstract String play();
}

class Piano extends Instrument{
	public String play(){
		return "Piano is playing tan tan tan tan";
	}
}
class Flute extends Instrument{
	public String play(){
		return "Flute is playing toot toot toot toot";
	}
}
class Guitar extends Instrument{
	public String play(){
		return "Guitar is playing tin tin tin tin";
	}
}

public class E3 {
	public static void main(String args[]) {
		Instrument[] instrument = new Instrument[10];
		instrument[0] = new Piano();
		instrument[1] = new Flute();
		instrument[2] = new Guitar();
		
		System.out.println("Checking Ploymorphic behaviour");
		System.out.println("Instrument 1: "+instrument[0].play());

		System.out.println("Instrument 2: "+instrument[1].play());

		System.out.println("Instrument 3: "+instrument[2].play());
		System.out.println();
		System.out.println("Use of InstanceOf Operator");
		for(int i =0;i<3;i++) {
			if(instrument[i] instanceof Piano) {
				System.out.println("Piano is store at index: "+i);
			}
			if(instrument[i] instanceof Flute) {
				System.out.println("Flute is store at index: "+i);
			}
			if(instrument[i] instanceof Guitar) {
				System.out.println("Guitar is store at index: "+i);
			}
		}
	}
}
