import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testEscolherTipoUsuarioCliente() {
        App app = new App();
        String tipoUsuario = "cliente";
        Usuario usuario = app.escolherTipoUsuario(tipoUsuario);
        assertTrue(usuario instanceof Cliente);
    }

    @Test
    public void testEscolherTipoUsuarioGerente() {
        App app = new App();
        String tipoUsuario = "gerente";
        Usuario usuario = app.escolherTipoUsuario(tipoUsuario);
        assertTrue(usuario instanceof Gerente);
    }

    @Test
    public void testEscolherTipoUsuarioInvalido() {
        App app = new App();
        String tipoUsuario = "outro";
        Usuario usuario = app.escolherTipoUsuario(tipoUsuario);
        assertNull(usuario);
    }
}
