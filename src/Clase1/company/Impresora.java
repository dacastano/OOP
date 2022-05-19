package Clase1.company;

import java.util.Date;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private Integer cantidadHojas;

    public Impresora(String modelo, String tipoConexion){
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        fechaFabricacion = new Date();
        cantidadHojas = 0;
    }

    public Impresora(String modelo, String tipoConexion, Date fecha){
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        fechaFabricacion = fecha;
        cantidadHojas = 0;
    }

    public Boolean tienePapel(){
        return cantidadHojas > 0;
    }

    public void imprimir(String texto){
        if(tienePapel()){
            System.out.println(texto);

            cantidadHojas --;
        } else {
            System.out.println("No hay papel! Ingresar papel!");
        }
    }

    public void agregarPapel(Integer cantidadHojas){
        this.cantidadHojas += cantidadHojas;
    }

    public Date getFechaFabricacion(){
        return fechaFabricacion;
    }
}
