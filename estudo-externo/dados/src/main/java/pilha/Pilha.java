package pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No noNovo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = noNovo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
//        if (reNoEntradaPilha == null){
//            return true;
//        }
//
//        return false;

        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "---------------\n";
        stringRetorno += " Pilha\n";
        stringRetorno += "_______________\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }

        stringRetorno += "============\n";

        return stringRetorno;
    }
}
