public class Empregado extends Pessoa {

	Empregado(){
	}		
	private	double salario;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void obterlucros(double sl){
		salario += sl;
	}
}