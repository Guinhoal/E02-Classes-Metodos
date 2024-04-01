public class Conta {
    Cliente dono;
    double saldo;
    int numero;
    String agencia;
    double limite;

    boolean depositar(double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    boolean sacar(double valor) {
        if (valor > 0.0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    boolean transferir(Conta contaDestino, double valor) {
        boolean saqueRealizado = this.sacar(valor);
        if (saqueRealizado) {
            boolean depositoRealizado = contaDestino.depositar(valor);
            return depositoRealizado;
        } else {
            return false;
        }
    }

    void imprimir() {
        System.out.println("Nome do dono: " + this.dono.nome);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
}
