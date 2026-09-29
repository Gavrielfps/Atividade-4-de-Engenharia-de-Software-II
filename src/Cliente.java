public class Cliente {
    public static void main(String[] args) {
        Logistica logistica;

        logistica = new LogisticaEmail();
        logistica.planejamentoEnvio();

        logistica = new LogisticaSMS();
        logistica.planejamentoEnvio();

        logistica = new LogisticaPush();
        logistica.planejamentoEnvio();
    }
}
