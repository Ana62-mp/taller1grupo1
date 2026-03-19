public class Main { 
    public static void main(String[] args) { 
        Billetera miBilletera = new Billetera("Juan Perez", 100.0); 
        Billetera miBilletera2 = new Billetera("Lola", 110.0); 
        miBilletera.mostrarSaldo(); 
        miBilletera.transferir(20.0); 
        miBilletera.mostrarSaldo(); 
    } 
} 