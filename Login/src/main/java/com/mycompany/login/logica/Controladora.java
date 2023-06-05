
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje = "";
        List<Usuario> listaUsuario = controlPersis.traerUsuarios();
        for(Usuario usu : listaUsuario) {
            if(usu.getNombreUsuario().equals(usuario)) {
                if(usu.getContrasenia().equals(contrasenia)) {
                    mensaje = "Usuario y Contraseña Correctos. Bienvenido/a!";
                    return mensaje;
                } else {
                    mensaje = "Contraseña Incorrecta";
                    return mensaje;
                }
            } else {
                mensaje = "Usuario no encontrado";
            }
        }
        return mensaje;
    }
}
