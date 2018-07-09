package rafael.alcocer.caldera.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {

    private String usuario;
    private String clave;

    public String getUsuario() {
	return usuario;
    }

    public void setUsuario(String usuario) {
	this.usuario = usuario;
    }

    public String getClave() {
	return clave;
    }

    public void setClave(String clave) {
	this.clave = clave;
    }
}
