package lu.lllc;

import java.io.Serializable;

public class Contribuyente implements Serializable{
	static final long serialVersionUID = 12345L;
	private long id;
	private String numRuc;
	private String tipoContribuyente;
	private long tipoDocumento;
	private String domicilioFiscal;
	
	public Contribuyente() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumRuc() {
		return numRuc;
	}

	public void setNumRuc(String numRuc) {
		this.numRuc = numRuc;
	}

	public String getTipoContribuyente() {
		return tipoContribuyente;
	}

	public void setTipoContribuyente(String tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}

	public long getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(long tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDomicilioFiscal() {
		return domicilioFiscal;
	}

	public void setDomicilioFiscal(String domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}

	
	
}
