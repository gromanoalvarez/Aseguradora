package ar.edu.unlam.pb2.eva03;

public class Poliza {
	
	protected Integer nUMERO_DE_POLIZA;
	protected Persona asegurado;
	protected Double sUMA_ASEGURADA;
	protected Double pRIMA;
	protected Boolean fueRobado;
	protected Boolean tuvoAlgunAccidente;
	
	public Poliza(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		this.nUMERO_DE_POLIZA=nUMERO_DE_POLIZA;
		this.asegurado=asegurado;
		this.sUMA_ASEGURADA=sUMA_ASEGURADA;
		this.pRIMA=pRIMA;
		fueRobado=false;
		tuvoAlgunAccidente=false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nUMERO_DE_POLIZA == null) ? 0 : nUMERO_DE_POLIZA.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false; */
		Poliza other = (Poliza) obj;
		if (nUMERO_DE_POLIZA == null) {
			if (other.nUMERO_DE_POLIZA != null)
				return false;
		} else if (!nUMERO_DE_POLIZA.equals(other.nUMERO_DE_POLIZA))
			return false;
		return true;
	}

	public boolean fueRobado() {
		return fueRobado;
	}

	public void denunciarSiniestro() {
		fueRobado=true;
		tuvoAlgunAccidente=true;
	}

	public boolean tuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}	

}
