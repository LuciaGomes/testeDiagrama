import java.util.ArrayList;

public class RepositorioMem implements Repositorio {

    private ArrayList<Emprestimo> mEmprestimo;
    private ArrayList<Utilizador> mUtilizador;
    private ArrayList<TipoUtilizador> mTipoUtilizador;
    private ArrayList<Requisicao> mRequisicao;
    private ArrayList<Copia> mCopia;
    private ArrayList<Livro> mLivro;
    private ArrayList<Encomenda> mEncomenda;
    private ArrayList<RequisicaoCompra> mRequisicaoCompra;


    RepositorioMem() {
        mEmprestimo = new ArrayList<>();
        mUtilizador = new ArrayList<>();
        mTipoUtilizador = new ArrayList<>();
        mRequisicao = new ArrayList<>();
        mCopia = new ArrayList<>();
        mLivro = new ArrayList<>();
        mEncomenda = new ArrayList<>();
        mRequisicaoCompra = new ArrayList<>();
    }

    public void adicionaCopia(Copia copia) {
        mCopia.add(copia);
    }

    public void adicionaCoima(Coima coima) { }

    public void adicionaDevolucao(Devolucao devolucao) { }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        mEmprestimo.add(emprestimo);
    }

    public void adicionaEncomenda(Encomenda encomenda) { mEncomenda.add(encomenda); }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) { }

    public void adicionaLivro(Livro livro) {
        mLivro.add(livro);
    }

    public void adicionaNotificacao(Notificacao notificacao) { }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta) { }

    public void adicionaRequisicao(Requisicao requisicao) {
        mRequisicao.add(requisicao);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) { mRequisicaoCompra.add(requisicaoCompra); }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        mTipoUtilizador.add(tipo);
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        mUtilizador.add(utilizador);
    }


    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {

        int tamanho = mEmprestimo.size();
        for (int i = 0; i < tamanho; i++) {
            if (mEmprestimo.get(i).getRequisicao().equals(r)) {
                return mEmprestimo.get(i);
            }
        }

        return null;
    }
}
