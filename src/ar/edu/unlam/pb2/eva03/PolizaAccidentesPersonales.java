package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {
	
	private HashSet<Persona> beneficiarios;

	public PolizaAccidentesPersonales(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(nUMERO_DE_POLIZA,asegurado,sUMA_ASEGURADA,pRIMA);
		beneficiarios= new HashSet<Persona>();
	}

	@Override
	public Persona getAsegurado() {
		return asegurado;
	}

	@Override
	public Double getPremio() { 
		return pRIMA+1000.0; //deberia ser prima mas impuestos
	}


	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}

	@Override //reveer
	public void agregarBeneficiario(Persona nombre, TipoDeBeneficiario relacion) {
		beneficiarios.add(nombre);	
	}

}
