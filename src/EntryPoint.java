//Importe sua classe aqui

class EntryPoint {
    public static void main(String[] args) {
        //Instancie sua classe aqui  
        ContaBancaria contaBancaria = new ContaBancaria("35431A56", 2312.75);
        contaBancaria.depositar(25.50);
        contaBancaria.sacar(50.00);
    }
}