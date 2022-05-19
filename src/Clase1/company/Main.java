package Clase1.company;

import java.util.Date;

public class Main {

    /*
        Clase del martes

        Cliente unCliente = new Cliente(2358, "Jose");
        Cliente otroCliente = new Cliente(782, "Juan");

        System.out.println("Hola, mi nombre es " + unCliente.getNombre());
        System.out.println("Hola, mi nombre es " + otroCliente.getNombre());

        System.out.println("Mi deuda es: " + unCliente.getDeuda());
        System.out.println("Mi deuda es: " + otroCliente.getDeuda());

        otroCliente.incrementarDeuda(50.0);

        System.out.println("Mi deuda es: " + unCliente.getDeuda());
        System.out.println("Mi deuda es: " + otroCliente.getDeuda());

        otroCliente.pagarDeuda();

        System.out.println("Mi deuda es: " + unCliente.getDeuda());
        System.out.println("Mi deuda es: " + otroCliente.getDeuda());

        System.out.println("Hola, mi nombre antes de cambiar es " + unCliente.getNombre());

        unCliente.setNombre("Martin");

        System.out.println("Hola, mi nombre correcto es " + unCliente.getNombre());
     */

    public static void main(String[] args) {
        Impresora primerImpresora = new Impresora("MEG 283", "USB");

        Impresora segundaImpresora = new Impresora("DHM 201", "Inalambrica", new Date(121, 11, 28));

        System.out.println("La fecha de fabricacion de mi primer impresora es: " + primerImpresora.getFechaFabricacion());
        System.out.println("La fecha de fabricacion de mi segunda impresora es: " + segundaImpresora.getFechaFabricacion());

        primerImpresora.imprimir("No creo poder imprimir, porque no tengo papel!");

        segundaImpresora.agregarPapel(10);
        segundaImpresora.imprimir("Yo si puedo imprimir!");
    }
}
