package com.projeto.atribuicaoreferencia;

public class MeuObj {

    private Integer num;

    // Construtor
    public MeuObj(Integer num) {
        this.num = num;
    }

    // Setter
    public void setNum(Integer num){
        this.num = num;
    }

    // Getter (opcional)
    public Integer getNum() {
        return this.num;
    }

    // toString
    @Override
    public String toString() {
        return (num != null) ? num.toString() : "null";
    }
}
