public class LogisticaSMS extends Logistica {
    @Override
    public Notificacao criarNotificacao() {
        return new SMS();
    }
}
