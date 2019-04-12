public class Utilizador {

    private String nome;
    private String estado;
    private TipoUtilizador tipoUtilizador;

    Utilizador(String nome, String estado, TipoUtilizador tipoUtilizador) {
        this.nome = nome;
        this.estado = estado;
        this.tipoUtilizador = tipoUtilizador;
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

