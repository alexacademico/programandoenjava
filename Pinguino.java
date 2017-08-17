
public class Pinguino extends Ave implements Inadador {
	

	private boolean puedonadar() {
		return this.energia >= 8;
	}
	@Override
	public void nadar() {

		if (puedonadar()) {
			
			this.energia = energia - 8;
			System.out.println("nade "+Math.random()*10+"metros");
			
		} else {
			System.out.println("no puedo nadar por que no tengo energia");
		}
}
}
