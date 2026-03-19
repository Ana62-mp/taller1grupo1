public class Billetera { 
    double balanceTotal; 
    String titular; 
 
    public Billetera(String titular, double saldoInicial) { 
        this.titular = titular; 
        this.saldo = saldoInicial; 
    } 
 
    public void transferir(double monto) { 
        saldo = saldo - (monto*1.02); 
    } 
 
    public void mostrarSaldo() { 
        System.out.println("Saldo de " + titular + ": $" + saldo); 
    } 
} 
