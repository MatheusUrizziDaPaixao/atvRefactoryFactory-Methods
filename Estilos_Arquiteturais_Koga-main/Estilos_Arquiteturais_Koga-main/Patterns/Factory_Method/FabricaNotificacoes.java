package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {

    // Factory Method: cada fábrica concreta decide qual produto criar.
    protected abstract IntNotificacoes criarNotificacoes();

    // Fluxo comum: fixo na classe base e dependente só de IntNotificacoes.
    public final void notificar() {
        IntNotificacoes notificacoes = criarNotificacoes();
        notificacoes.enviar();
    }
}
