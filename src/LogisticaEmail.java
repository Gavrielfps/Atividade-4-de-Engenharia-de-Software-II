public class LogisticaEmail extends Logistica{
    @Override
    public Notificacao criarNotificacao() {
        return new Email();
    }
}
