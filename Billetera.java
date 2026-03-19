public class Billetera { 
    double balanceTotal; 
    String titular; 
 
    public Billetera(String titular, double saldoInicial) { 
        this.titular = titular; 
        this.saldo = saldoInicial; 
    } 
 
    public void transferir(double monto) { 
        if(monto > saldo) { 
            System.out.println("Saldo insuficiente"); 
            return; 
        }
        saldo = saldo - monto; 
        saldo = saldo - (monto*1.05); 
        saldo = saldo - (monto*1.02); 
    } 
 
    public void mostrarSaldo() { 
        System.out.println("Saldo de " + titular + ": $" + saldo); 
        System.out.println("Cuanto quiere tranferir? " ); 

        System.out.println("Saldo de " + titular + ": $" + saldo); 
        System.out.println("Saldo de " + titular + ": $" + saldo); 
    } 
} 
