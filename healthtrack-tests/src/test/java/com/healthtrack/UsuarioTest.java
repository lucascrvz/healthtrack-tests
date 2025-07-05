package com.healthtrack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UsuarioTest {
    @Test
    public void testActualizarPeso_ErrorActual() {
        Usuario u = new Usuario("Lucas", 70.0);
        u.actualizarPeso(72.0); // Se espera que pese 72, pero el bug lo deja en 69
        assertEquals(72.0, u.getPeso(), 0.01);
    }

    @Test
    public void testActualizarPeso_Correcta() {
        Usuario u = new Usuario("Lucas", 70.0);
        // Solución temporal para demostrar test correcto
        u.actualizarPeso(72.0); 
        assertEquals(72.0, u.getPeso(), 0.01);
    }
}
