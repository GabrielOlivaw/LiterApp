package literapp;

/**
 *
 * @author gabag
 */
public class Genero {
    
    private int id;
    private String genero;
    private String descripcion;

    public Genero(int id, String genero) {
        this.id = id;
        this.genero = genero;
        this.descripcion = "";
    }
    
    public Genero(int id, String genero, String descripcion) {
        this.id = id;
        this.genero = genero;
        this.descripcion = descripcion;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
