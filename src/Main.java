
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe Gaete Troncoso
 * @version 05-09-2023
 */
public class Main {
    public static void main(String[] args) {
        
        int opcion;
        boolean flag;
        Date fechaDate =null;
        Scanner leer = new Scanner(System.in);
        int aumento;
        
        //Usuario
        
        String usuario,clave,correo;
        
        //Canal
        
        Usuario user;
        String nombreCanal,descripcion,info,fechaCreacion;
        int suscriptores,cantidadVideos,pago;
        
        Usuario usuar =new Usuario();
        Canal canal = new Canal();
        Validador valida = new Validador();
        
        do {            
            System.out.println("+++ Menu +++");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Crear Canal");
            System.out.println("3. Mostar info Cuenta");
            System.out.println("4. Aumentar suscriptores");
            System.out.println("5. Validar Contrasenna");
            System.out.println("6. Salir");
            
            opcion=leer.nextInt();
            
           switch (opcion){
               case 1:
                   System.out.println("Ingrese nombre de Usuario: ");
                   usuario = leer.next();
                   usuar.setUsuario(usuario);
                   
                   do {                       
                       System.out.println("Ingrese su contrasenna: ");
                       clave = leer.next();
                       flag = valida.largoContraseña(clave);
                       if (flag==false){
                           System.out.println("La contrasenna debe ser minimo de 6 caracteres y maximo 10");
                       }
                   } while (flag==false);
                   
                     do {                       
                         System.out.println("Ingrese su correo: ");
                         correo = leer.next();
                         flag = valida.contienCorreo(correo);
                         if(flag==false){
                             System.out.println("Correo en formato erroneo, debe contener un @");
                         }
                   } while (flag==false);
                   
                   usuar.setClave(clave);
                   usuar.setCorreo(correo);
                   System.out.println("+++ Cuenta Creada +++");
                   System.out.println(usuar);
                   System.out.println("****************");
                   break;
                   
               case 2:
                   canal.setUser(usuar);
                   
                   do {                       
                       System.out.println("Ingrese Nombre del Canal: ");
                       nombreCanal = leer.next();
                       flag = valida.largoNombre(nombreCanal);
                       if(flag==false){
                           System.out.println("El nombre del canal debe ser minimo de 3 caracteres");
                       }
                   } while (flag==false);
                   canal.setNombreCanal(nombreCanal);
                   
                   System.out.println("Ingrese una palabra que describa el canal:");
                   descripcion =leer.next();
                   canal.setDescripcion(descripcion);
                   
                   do {                       
                       System.out.println("Ingrese numero de suscriptores iniciales: ");
                       suscriptores = leer.nextInt();
                       flag = valida.nSuscriptores(suscriptores);
                       if (flag==false){
                           System.out.println("El numero de suscriptores no puede ser un numero negativo");
                       }
                   } while (flag==false);
                   canal.setSuscriptores(suscriptores);
                   do {                       
                       System.out.println("Ingrese numero de videos iniciales: ");
                       cantidadVideos = leer.nextInt();
                       flag = valida.nVideos(cantidadVideos);
                       if (flag==false){
                           System.out.println("El numero de videos no puede ser un numero negativo");
                       }
                   } while (flag==false);
                   canal.setCantidadVideos(cantidadVideos);;
                   do {                       
                       System.out.println("Ingrese fecha de Creacion:  (YYYY-MM-DD)");
                       fechaCreacion = leer.next();
                       
                       SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-DD");
                       try {
                           fechaDate = formato.parse(fechaCreacion);
                       } catch (Exception e) {
                           flag=false;
                           System.out.println("Fecha en formato incorrecto");
                       }
                                              
                   } while (flag==false);
                   canal.setFechaCreacion(fechaDate);
                   
                   System.out.println("+++ Canal Creado +++");
                   canal.infoCanal();
                   System.out.println(canal.getInfo());
                   break;
                   
               case 3:
                   System.out.println("Cuenta: "+usuar.getUsuario());
                   System.out.println("Canal: "+canal.getNombreCanal());
                   System.out.println("N° Suscriptores: "+canal.getSuscriptores());
                   System.out.println("N° Videos: "+canal.getCantidadVideos());
                   break;
                   
               case 4:
                   System.out.println("Ingrese el numero de suscriptores que desea aumentar: ");
                   aumento = leer.nextInt();
                   canal.aumentoSuscriptores(aumento);
                   System.out.println("El numero de suscriptores aumento en: "+aumento);
                   System.out.println("El numero de suscriptores ahora es de: "+canal.getSuscriptores());
                   
                   if(canal.getSuscriptores()>10000){
                       canal.pagoSuscriptores();
                       System.out.println("El duenno del canal recibe un pago de: "+canal.getPago());
                   }else{
                       System.out.println("El duenno del canal no recibe un pago por el bajo numero de susriptores");
                   }
                   break;
                   
               case 5:
                   System.out.println("Escriba la contrasenna a Validar: ");
                   clave = leer.next();
                   flag = valida.largoContraseña(clave);
                   if (flag==false){
                       System.out.println("La contrasenna no cumple con los parametros de largo minimo 6 y maximo 10 caracteres");
                   }else{
                       System.out.println("Su contrasenna cumple con lo requerido");
                   }
                   break;
                   
               case 6:
                   System.out.println("Gracias por usar el programa :)!");
                   break;
                   
           }
        } while (opcion!=6);
        
        
    }
    
}
