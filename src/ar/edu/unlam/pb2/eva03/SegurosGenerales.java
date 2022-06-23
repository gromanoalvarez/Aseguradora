package ar.edu.unlam.pb2.eva03;

public interface SegurosGenerales extends Seguro {

	public abstract void agregarBienAsegurado(Object autoOCasa);

	public abstract Integer getNumeroDePoliza();

	public abstract Auto getAuto();
}
