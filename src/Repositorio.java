public interface Repositorio {


    void adicionaCopia(Copia copia);

    void adicionaCoima(Coima coima);

    void adicionaDevolucao(Devolucao devolucao);

    void adicionaEmprestimo(Emprestimo emprestimo);

    void adicionaEncomenda(Encomenda encomenda);

    void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);

    void adicionaLivro(Livro livro);

    void adicionaNotificacao(Notificacao notificacao);

    void adicionaPropostaRequisicao(PropostaAquisicao proposta);

    void adicionaRequisicao(Requisicao requisicao);

    void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

    void adicionaTipoUtilizador(TipoUtilizador tipo);

    void adicionaUtilizador(Utilizador utilizador);

    Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
}
