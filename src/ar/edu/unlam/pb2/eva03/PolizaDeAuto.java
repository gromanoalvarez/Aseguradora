package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {
	
	private Auto bienAsegurado;

	public PolizaDeAuto(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(nUMERO_DE_POLIZA,asegurado,sUMA_ASEGURADA,pRIMA);
		bienAsegurado=null;
	}

	@Override
	public Persona getAsegurado() {
		return super.asegurado;
	}

	@Override
	public Double getPremio() { //prima mas impuesto
		return (super.pRIMA + 1000.0);
	}

	@Override
	public void agregarBienAsegurado(Object auto) {
		if(auto instanceof Auto)bienAsegurado=(Auto)auto;
	}
	
	@Override
	public Integer getNumeroDePoliza() {
		return nUMERO_DE_POLIZA;
	}

	@Override
	public Auto getAuto() {
		return bienAsegurado;
	}

}
