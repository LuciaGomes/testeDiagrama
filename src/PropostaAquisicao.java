import java.time.LocalDate;

public class PropostaAquisicao {
    private LocalDate data;
    private Utilizador utilizador;
    private String infoLivro;


    public PropostaAquisicao(LocalDate data, Utilizador utilizador, String infoLivro) {
        this.data = data;
        this.utilizador = utilizador;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public String getInfoLivro() {
        return infoLivro;
    }
}
