package Modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;





public class UsuarioExterno extends Persona implements Serializable {
 private static final long serialVersionUID = 1L;
 @OneToMany(mappedBy="usuario",cascade={CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE,CascadeType.DETACH},orphanRemoval=true)
 private List<Documento> documentos=new ArrayList<>();
	  public UsuarioExterno() {
	
	  }
	  public void  addDocumento(Documento doc){
			if(this.documentos.isEmpty() || !this.documentos.contains(doc)){
				this.documentos.add(doc);
				doc.setUsuario(this);
			}
		}
		
		public List<Documento> getDocumentos() {
			return documentos;
		}
		public void setDocumentos(List<Documento> documentos) {
			this.documentos = documentos;
		}
		

}
