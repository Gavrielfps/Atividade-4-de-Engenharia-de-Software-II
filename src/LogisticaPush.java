public class LogisticaPush extends Logistica{
    @Override
    public Notificacao criarNotificacao() {
        return new Push();
    }
}
