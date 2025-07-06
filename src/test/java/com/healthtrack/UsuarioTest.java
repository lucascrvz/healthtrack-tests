import com.healthtrack.model.Usuario;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {

    private Usuario usuario;

    @Before
    public void setUp() {
        usuario = new Usuario("Lucas", 70.0);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Lucas", usuario.getNombre());
    }

    @Test
    public void testGetPesoInicial() {
        assertEquals(70.0, usuario.getPeso(), 0.01);
    }

    @Test
    public void testActualizarPeso_DeberiaAsignarNuevoPeso() {
        usuario.actualizarPeso(72.5);  // Aquí fallará porque hay un bug
        assertEquals(72.5, usuario.getPeso(), 0.01);
    }

    @Test
    public void testActualizarPeso_Negativo() {
        usuario.actualizarPeso(-10.0);
        assertEquals(-10.0, usuario.getPeso(), 0.01);
    }

    @Test
    public void testMostrarInformacion_NoLanzaExcepcion() {
        usuario.mostrarInformacion();
    }
}
