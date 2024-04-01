public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "123.456.789-00", "Rua A, 123", 30, 'M');
        Conta conta1 = new Conta();
        conta1.dono = cliente1;
        conta1.agencia = "222-2";
        conta1.numero = 1234;
        conta1.saldo = 2000;
        conta1.limite = 1000;

        // Exemplo de uso do método imprimir()
        conta1.imprimir();
    }
}

