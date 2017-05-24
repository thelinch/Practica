package Modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioExternoJuridico
 *
 */

public class UsuarioExternoJuridico extends UsuarioExterno implements Serializable {

	
	private static final long serialVersionUID = 1L;
	 @Column(name="ruc",length=11,nullable=false)
		private int ruc;
	  @Column(name="orgaizacion",nullable=false)
	  private String organizacion;
	public UsuarioExternoJuridico() {
		
	}
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
	public String getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(String organizacion) {
		this.organizacion = organizacion;
	}
	@Override
	public String toString() {
		return "UsuarioExternoJuridico [ruc=" + ruc + ", organizacion=" + organizacion + "]";
	}
	
   
}
