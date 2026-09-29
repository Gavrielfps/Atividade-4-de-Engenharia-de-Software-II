public abstract class Logistica {

    public abstract Notificacao criarNotificacao();

    public void planejamentoEnvio(){
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
