package ar.edu.unlam.pb2.eva03;

public interface SegurosDeVida extends Seguro {

	public abstract Integer obtenerCantidadDeBeneficiarios();
	public abstract void agregarBeneficiario(Persona nombre, TipoDeBeneficiario relacion);
}
