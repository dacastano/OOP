package Clase1.company;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    public Cliente(Integer numero, String nombre){
        numeroCliente = numero;
        this.nombre = nombre;
        deuda = 0.0;
    }

    public void incrementarDeuda(Double valor){
        deuda += valor;
    }

    public void pagarDeuda(){
        deuda = 0.0;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }
}
