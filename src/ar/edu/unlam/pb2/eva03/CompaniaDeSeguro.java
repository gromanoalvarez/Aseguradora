package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;

public class CompaniaDeSeguro {

	private String nombre;
	private HashSet<Poliza> polizas;

	public CompaniaDeSeguro(String nombre) {
		this.nombre=nombre;
		polizas = new HashSet<Poliza>();
	}

	public void agregarPoliza(Poliza poliza) {
		polizas.add(poliza);
	}
	

	public Object obtenerLaCantidadDePolizasEmitidas() {
		return polizas.size();
	}

	public void denunciarSiniestro(Integer numeroDePoliza) throws PolizaInexistente{
		getPoliza(numeroDePoliza).denunciarSiniestro();
	}

	public Poliza getPoliza(Integer numeroDePoliza) throws PolizaInexistente{
		for(Poliza p: polizas) {
			if(p.nUMERO_DE_POLIZA==numeroDePoliza) return p;
		}
		throw new PolizaInexistente();
	}

}
