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
    
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoPoximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;

        }
        if (ultimoNo != null){
            ultimoNo.setNoPoximo(novoNo);

        }
        ultimoNo = novoNo;
        tamanhoLista ++;
        
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoPoximo(noAuxiliar);

        if(novoNo.getNoPoximo() !=null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoPoximo().setNoPrevio(novoNo);

        }else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;

        }
        if(index == 0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoPrevio().setNoPoximo(novoNo);

        }

        tamanhoLista ++;


    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null);  i++){
            noAuxiliar = noAuxiliar.getNoPoximo();


        }

        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista; // corrigido
    }

}
