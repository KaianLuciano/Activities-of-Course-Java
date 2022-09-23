
public class Notas {

	public String name;
	public float nota1;
	public float nota2;
	public float nota3;
	public float media;
	public String resultado;
	public float missing;

	public void mediaFinal() {
		this.media = nota1 + nota2 + nota3;
	}

	public String toString() {
		if (media >= 60) {
			this.resultado = "Pass";
			return "Final Grade = " + media + "\n" + resultado;
		} else {
			this.missing = 60.00f - media;
			this.resultado = "Failed";
			return "Final Grade = " + media + "\n" + resultado + "\nMissing " + missing + " POINTS";
		}
	}
}
