package com.hampcode.tutoria_apoyo_academico.controladores;


import com.hampcode.tutoria_apoyo_academico.servicios.UsuarioServicio;
import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/usuarioRest")
public class UsuarioRestController {

    @Autowired
    private UsuarioServicio userService;

    @GetMapping("/recuperar")
    public String mostrarFormularioRecuperacion(@RequestParam("token") String token, Model model) {
        System.out.println("MOSTRANDO");
        Usuario usuario = userService.validarTokenRecuperacion(token);
        if (usuario != null) {
            // Agregar la contraseña al modelo (considera las implicaciones de seguridad)
            model.addAttribute("contraseña", usuario.getPassword());
            // Mostrar formulario para restablecer contraseña
            return "ExitoPlantillaCorreoRecuperacion"; // nombre del HTML
        } else {
            // Manejar token inválido o expirado
            return "ErrorPlantillaCorreoRecuperacion"; // nombre del HTML de error
        }
    }
}

