/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu44
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        String mensajes[] = {"Primero", "Segundo", "Tercero"};
        
        try{
            for (int i = 0; i <= 3; i++) 
                System.out.println(mensajes[i]);   
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hello world 2");
        }
        
        
        
        double x;
        try{
            x = 5/0;
            System.out.println(x); 
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("¿Quieres tener al Bebeton en tu celular?");
        }
        
        try{
            x = 0/0;
            System.out.println(x);  
        } catch (ArithmeticException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hola mundo 3");
        }
        
        try{
            x = 0/0;
            System.out.println(x);  
        } catch (ArithmeticException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Hola mundo 3");
        }
        
        double division = metodoDivision(4f, 6.0);
    }

    private static double metodoDivision(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operación no soportada."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
