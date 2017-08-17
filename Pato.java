
public class Pato extends Ave implements Ivolador, Inadador {
	private String nombre;

	public Pato() {
		this.nombre = "anonimo";
		this.energia = 10;
	}

	public Pato(String nombre) {
		this.nombre = nombre;
		this.energia = 10;
	}

	public void canta() {
		System.out.println("yo soy el pato " + this.nombre);
		super.canta();
	}

	private boolean puedovolar() {
		return this.energia >= 6;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void vola() {

		if (puedovolar()) {

			this.energia = energia - 6;
			System.out.println("vole " + Math.random() * 10 + "metros");

		} else {
			System.out.println("no puedo volar por que no tengo energia");
		}
		// TODO Auto-generated method stub

	}

	private boolean puedonadar() {
		return this.energia >= 1;
	}

	public void nadar() {

		if (puedonadar()) {
			
			this.energia = energia - 1;
			System.out.println("nade "+Math.random()*10+"metros");
			
		} else {
			System.out.println("no puedo nadar por que no tengo energia");
		}
}
}