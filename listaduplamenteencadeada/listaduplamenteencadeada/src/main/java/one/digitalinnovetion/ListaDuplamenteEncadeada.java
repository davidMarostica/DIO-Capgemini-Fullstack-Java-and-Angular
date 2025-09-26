package one.digitalinnovetion;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;

    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null);  i++){
            noAuxiliar = noAuxiliar.getNoPoximo();


        }

        return noAuxiliar;
    }

    public int size() {
        return tamanhoLista; // corrigido
    }

}
