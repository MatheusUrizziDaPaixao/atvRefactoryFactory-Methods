package Patterns.Abstract_Factory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Único ponto que conhece as fábricas concretas (raiz de composição).
        List<Fabricas> plataformas = List.of(new FabricaAndroid(), new FabricaIOS());

        for (Fabricas fabrica : plataformas) {
            new Renderizador(fabrica).renderizar();
        }
    }
}
