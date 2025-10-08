package one.digitalinnovation;

public class Fila {

    private No refNoEntradaFila = null;  // último elemento inserido
    private No refNoSaidaFila = null;    // primeiro elemento da fila

    // Adiciona elemento no final da fila
    public void enqueue(Object obj) {
        No novoNo = new No(obj);
        if (isEmpty()) {
            refNoEntradaFila = novoNo;
            refNoSaidaFila = novoNo;
        } else {
            refNoEntradaFila.setRefNo(novoNo);
            refNoEntradaFila = novoNo;
        }
    }

    // Remove e retorna o primeiro elemento da fila
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object obj = refNoSaidaFila.getObject();
        refNoSaidaFila = refNoSaidaFila.getRefNo();
        if (refNoSaidaFila == null) {
            refNoEntradaFila = null; // fila ficou vazia
        }
        return obj;
    }

    // Retorna o primeiro elemento sem remover
    public Object first() {
        if (isEmpty()) {
            return null;
        }
        return refNoSaidaFila.getObject();
    }

    public boolean isEmpty() {
        return refNoSaidaFila == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No noAuxiliar = refNoSaidaFila;

        while (noAuxiliar != null) {
            sb.append("[No{dado=").append(noAuxiliar.getObject()).append("}]--->");
            noAuxiliar = noAuxiliar.getRefNo();
        }
        sb.append("null");
        return sb.toString();
    }
}
