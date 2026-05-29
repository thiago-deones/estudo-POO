package listaCircular;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        } else{
            novoNo.setNoProximo(this.cauda);  // aqui deveria ser: novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo); // cabeça aponta pro último
            this.cabeca = novoNo;             // agora atualiza a cabeça
        }

        this.tamanhoLista++;
    }


    public void remove(int index){
        if (this.tamanhoLista == 1) {
            this.cabeca = null;
            this.cauda = null;
        } else if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else {
            No<T> noAuxiliar = this.cauda;
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
            if (index == this.tamanhoLista - 1) {
                this.cabeca = noAuxiliar;
            }
        }
        this.tamanhoLista--;

    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("Índice inválido");

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }


    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]-->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";

        return strRetorno;
    }
}
