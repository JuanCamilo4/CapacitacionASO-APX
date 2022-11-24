public class Paquete {

    private Integer id;
    private Integer peso;
    private Integer precio;
    private String documentoPersona;

    public Paquete(Integer id, String documentoPersona, Integer peso){
        this.id = id;
        this.documentoPersona = documentoPersona;
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }
    public Integer getPeso() {
        return peso;
    }
    public Integer getPrecio() {
        return precio;
    }

    public String getDocumentoPersona() {
        return documentoPersona;
    }

    public void setDocumentoPersona(String documentoPersona) {
        this.documentoPersona = documentoPersona;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void calcaularPrecio(String prioridad){
        int valorPioridad = 0;
        if (prioridad == "alta") valorPioridad = 10;
        if (prioridad == "express") valorPioridad = 20;
        this.precio = this.peso + valorPioridad;
    }

}
