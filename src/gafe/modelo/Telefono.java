package gafe.modelo;

public class Telefono {

    public Telefono(String codigoPais, String numeroTelefono) {
        this.codigoPais = codigoPais;
        this.numeroTelefono = numeroTelefono;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    private String codigoPais;
    private String numeroTelefono;
   // private int tipo; //Corresponde al tipo de telefono FAX o 
}
