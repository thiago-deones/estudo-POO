public class mensagensInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
        };
    private void validarConectadoInternet() {
        System.out.println("Testar conexao com internt");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvar mensagem enviada");
    }
}
