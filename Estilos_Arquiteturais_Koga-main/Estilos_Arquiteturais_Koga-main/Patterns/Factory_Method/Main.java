package Patterns.Factory_Method;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Único ponto que conhece as fábricas concretas (raiz de composição).
        List<FabricaNotificacoes> fabricas = List.of(new FabricaEmail(), new FabricaSMS());

        for (FabricaNotificacoes fabrica : fabricas) {
            fabrica.notificar();
        }
    }
}
