package one.digitallinnovetion;

public class No <T>{

    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;

    }
    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;

    }

    public No(No proximoNo, T conteudo) {
        this.proximoNo = proximoNo;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String toStringEncadeado(){
        String str = "No{" +
                "conteudo=" + conteudo +
                '}';
        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else {
            str += "-> null";

        }
        return str;

    }
}
