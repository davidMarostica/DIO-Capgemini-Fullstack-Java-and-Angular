package one.digitalinnovetion;

public class NoDuplo <T>{

    private T conteudo;
    private NoDuplo<T> noPoximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;


    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoPoximo() {
        return noPoximo;
    }

    public void setNoPoximo(NoDuplo<T> noPoximo) {
        this.noPoximo = noPoximo;
    }

    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return null;
    }

    public void setNoProxim(NoDuplo<T> noPoximo) {
    }
}
