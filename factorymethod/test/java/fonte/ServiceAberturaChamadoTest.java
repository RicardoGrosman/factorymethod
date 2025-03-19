package test.java.factorymethod;

import main.java.factorymethod.IServico;
import main.java.factorymethod.ServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceAberturaChamadoTest {

    @Test
    void deveExecutarAberturaChamado() {
        IServico servico = ServiceFactory.obterService("AberturaChamado");
        assertEquals("Ordem de serviço aberto", servico.executar());
    }

    @Test
    void deveCancelarAberturaChamado() {
        IServico servico = ServiceFactory.obterService("AberturaChamado");
        assertEquals("Ordem de seriço cancelado", servico.cancelar());
    }

}