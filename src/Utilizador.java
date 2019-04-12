public class Utilizador {

    private String nome;
    private String estado;
    private TipoUtilizador tipoUtilizador;

    public Utilizador(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public TipoUtilizador getTipoUtilizador() {
        return this.tipoUtilizador;
    }

    @Override
    public String toString() {
        return "Utilizador{" +
                "nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

