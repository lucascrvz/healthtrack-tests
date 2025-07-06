package com.healthtrack.controller;

import com.healthtrack.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private Usuario usuario = new Usuario("Lucas", 70.0);

    @PostMapping("/peso")
    public Usuario actualizarPeso(@RequestBody Usuario nuevoPeso) {
        usuario.setPeso(nuevoPeso.getPeso());
        return usuario;
    }

    @GetMapping
    public Usuario getUsuario() {
        return usuario;
    }
}
