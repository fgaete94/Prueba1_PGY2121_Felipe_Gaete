/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *@author Felipe Gaete Troncoso
 * @version 05-09-2023
 */
public class Validador {

    public Validador() {
    }
    
    public boolean nSuscriptores (int suscriptor){
        if(suscriptor>=0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean largoNombre (String nombre){
        if(nombre.length()>3){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean largoContraseña (String contraseña){
        if(contraseña.length()>=6 && contraseña.length()<=10){
            return true;
        }else{
            return false;
        }
    }
    public boolean nVideos (int videos){
        if(videos>=0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean contienCorreo (String correo){
        if(correo.contains("@")){
            return true;
        }else{
            return false;
        }
    }
    
}
