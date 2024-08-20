package org.example.iniciosesion;

public class usuario {
    private String nombres ;
    private String apellidos ;
    private String Usuario ;
    private String Clave ;
    private String Direccion ;
    private Integer movil ;

    public usuario(String nombres, String apellidos, String Usuario, String clave, String direccion, Integer movil) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.Usuario = Usuario;
        Clave = clave;
        Direccion = direccion;
        this.movil = movil;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Integer getMovil() {
        return movil;
    }

    public void setMovil(Integer movil) {
        this.movil = movil;
    }

    public usuario() {
    }


}
