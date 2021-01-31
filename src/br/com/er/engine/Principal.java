package br.com.er.engine;

import br.com.er.collection.ColecaoDeLivros;
import br.com.er.interfaces.ILivro;

public class Principal {

    public static void main(String... x) {

        ColecaoDeLivros cl = new ColecaoDeLivros();
        cl.mostrarLivros();
    }
}
