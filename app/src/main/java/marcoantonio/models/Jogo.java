package marcoantonio.models;

public class Jogo {
    private int id;
    private String titulo;
    
    private int idGenero;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    public int getIdGenero() {
        return this.idGenero;
    }
}