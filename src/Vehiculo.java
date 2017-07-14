
public class Vehiculo implements Lavable{

	private String color, modelo, matricula;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void lavar() {
		System.out.println("Sabemos lavar vehículos");
	}
	
	
	
}
