package code;

public class Programador extends Empleado {
	private String lenguaje;

	

	
	public Programador(String id, String nombre, String direccion, char sexo, int edad, float salario,
			String lenguaje) {
		super(id, nombre, direccion, sexo, edad, salario);
		this.lenguaje = lenguaje;
	}



	public String getLenguaje() {
		return lenguaje;
	}



	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	

}
