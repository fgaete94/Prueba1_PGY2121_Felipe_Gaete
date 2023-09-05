
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe Gaete Troncoso
 * @version 05-09-2023
 */
public class Canal {
    
    //atributos
    private Usuario user;
    private String nombreCanal,descripcion,info;
    private int suscriptores,cantidadVideos,pago=0,plata=0;
    private Date fechaCreacion;
   
    
    //cosntructores

    public Canal() {
    }

    public Canal(Usuario user, String nombreCanal, String descripcion, int suscriptores, int cantidadVideos, Date fechaCreacion) {
        this.user = user;
        this.nombreCanal = nombreCanal;
        this.descripcion = descripcion;
        this.suscriptores = suscriptores;
        this.cantidadVideos = cantidadVideos;
        this.fechaCreacion = fechaCreacion;
    }
    
    //accesadores y mutadores

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    public int getCantidadVideos() {
        return cantidadVideos;
    }

    public void setCantidadVideos(int cantidadVideos) {
        this.cantidadVideos = cantidadVideos;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Canal{" + "user=" + user + ", nombreCanal=" + nombreCanal + ", descripcion=" + descripcion + ", info=" + info + ", suscriptores=" + suscriptores + ", cantidadVideos=" + cantidadVideos + ", pago=" + pago + ", fechaCreacion=" + fechaCreacion + '}';
    }
    

     
    //visualizar informacion de canal
    
    public String infoCanal(){
        this.info=this.info +"Nombre:"+ getNombreCanal()+"Dueño:"+getUser()+"Suscriptores: "+getSuscriptores()+"Videos Subidos: "+getCantidadVideos()+"Descripcion: "+getDescripcion();
        return this.info;
    }
    
    // aumentar suscriptores
    
    public int aumentoSuscriptores(int aumento){
        this.suscriptores=this.suscriptores+aumento;
        return this.suscriptores;
    }
    
    //pago por suscriptores
    public int pagoSuscriptores(){
        int euro= 938;
        int monto= 500;
        plata = euro*monto;
        this.pago=this.pago + plata ;
        return this.pago;
    }
}
    
