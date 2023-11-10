/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu44
 */
public class CuentaBancaria {
    
    private double saldo = 0;
    
    public CuentaBancaria(){
        saldo = 0;
    }

    public void depositar(double monto){
        System.out.println("Depositando " + monto);
        saldo += monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando " + monto);
        if (saldo < monto)
            throw new SaldoInsuficiente
    }
}
