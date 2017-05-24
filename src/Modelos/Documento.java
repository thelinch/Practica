package Modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;



public class Documento implements Serializable {
	private static final long serialVersionUID = 1L;

private int id_documento;

private String codigo;

private Date fecha;

private String asunto;
private String contenido_doc;
private String Observaciones;

private boolean Disconforme;

private int num_foleo;

private UsuarioExterno usuario;
//@ManyToMany(targetEntity=Usuario_interno.class)
//private List<Usuario_interno> usuariointerno=new ArrayList<>();
/*@ManyToMany(mappedBy="documentos",cascade={CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE})
private List<Usuario_interno> usuarios;*/

public Documento() {
	
}


public Documento(String codigo, String asunto) {
	this.codigo = codigo;
	this.asunto = asunto;
	

}


public UsuarioExterno getUsuario() {
	return usuario;
}




public void setUsuario(UsuarioExterno usuario) {
	this.usuario = usuario;
}


public int getId_documento() {
	return id_documento;
}
public void setId_documento(int id_documento) {
	this.id_documento = id_documento;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public String getAsunto() {
	return asunto;
}
public void setAsunto(String asunto) {
	this.asunto = asunto;
}
public String getContenido_doc() {
	return contenido_doc;
}
public void setContenido_doc(String contenido_doc) {
	this.contenido_doc = contenido_doc;
}
public String getObservaciones() {
	return Observaciones;
}
public void setObservaciones(String observaciones) {
	Observaciones = observaciones;
}
public int getNum_foleo() {
	return num_foleo;
}
public void setNum_foleo(int num_foleo) {
	this.num_foleo = num_foleo;
}




public boolean isDisconforme() {

	return Disconforme;
}


public void setDisconforme(boolean disconforme) {
	Disconforme = disconforme;
}







@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id_documento;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Documento other = (Documento) obj;
	if (id_documento != other.id_documento)
		return false;
	return true;
}










}
