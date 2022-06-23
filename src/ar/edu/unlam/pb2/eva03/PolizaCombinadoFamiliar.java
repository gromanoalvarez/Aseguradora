package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashSet;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida, SegurosGenerales {

	private HashSet<Persona> beneficiarios;
	private ArrayList<Object> bienAsegurado;

	public PolizaCombinadoFamiliar(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(nUMERO_DE_POLIZA,asegurado,sUMA_ASEGURADA,pRIMA);
		bienAsegurado= new ArrayList<Object>();
		beneficiarios= new HashSet<Persona>();
	}

	@Override
	public Persona getAsegurado() {
		return asegurado;
	}

	@Override
	public Double getPremio() {
		return pRIMA*1.20; // deberia ir prima mas impuestos
	}

	@Override
	public Integer getNumeroDePoliza() {
		return nUMERO_DE_POLIZA;
	}

	@Override
	public Auto getAuto() {
		for(Object o: bienAsegurado) {
			if(o instanceof Auto) {
				return (Auto)o;
			}
		}
		return null;
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}

	@Override //revisar tipo de relacion
	public void agregarBeneficiario(Persona nombre, TipoDeBeneficiario relacion) {
		beneficiarios.add(nombre);
	}

	@Override
	public void agregarBienAsegurado(Object autoOCasa) {
		bienAsegurado.add(autoOCasa);		
	}

}
