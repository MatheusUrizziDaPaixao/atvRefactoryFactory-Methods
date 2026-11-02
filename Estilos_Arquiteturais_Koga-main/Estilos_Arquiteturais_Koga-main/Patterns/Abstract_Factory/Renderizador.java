package Patterns.Abstract_Factory;

// Cliente: depende apenas das abstrações (Fabricas, Botao, Input).
// Não conhece nenhuma classe concreta de plataforma.
public class Renderizador {
    private final Fabricas fabrica;

    public Renderizador(Fabricas fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizar() {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}
