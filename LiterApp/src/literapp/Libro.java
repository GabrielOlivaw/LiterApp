package literapp;

/**
 *
 * @author gabag
 */
public class Libro {
    
    private int id;
    private String titulo;
    private String autor;
    private int fechaPublicacion;
    private Genero genero;
    private boolean leido;
    private String descripcion;
    private String comentario;
    private byte[] portada;

    public Libro(int id, String titulo, String autor, int fechaPublicacion, 
            Genero genero, boolean leido, String descripcion, String comentario, byte[] portada) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
        this.leido = leido;
        this.descripcion = descripcion;
        this.comentario = comentario;
        this.portada = portada;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the leido
     */
    public boolean isLeido() {
        return leido;
    }

    /**
     * @param leido the leido to set
     */
    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @return the fechaPublicacion
     */
    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion the fechaPublicacion to set
     */
    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    @Override
    public String toString() {
        return id + " " + titulo + " " + autor + " " + genero + " " + leido;
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

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the portada
     */
    public byte[] getPortada() {
        return portada;
    }

    /**
     * @param portada the portada to set
     */
    public void setPortada(byte[] portada) {
        this.portada = portada;
    }
    
}
