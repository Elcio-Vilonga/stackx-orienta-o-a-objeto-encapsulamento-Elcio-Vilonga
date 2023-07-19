public class ContaBancaria{
    private String numero;
    private double saldo;

    public ContaBancaria(String numero, double saldoInicial){
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor > saldo){
            throw new illegalArgumentException("Saldo Insuficientr!");
        }
        saldo -=valor;
    }
}