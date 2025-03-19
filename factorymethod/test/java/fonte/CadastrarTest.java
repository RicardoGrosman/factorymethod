package test.java.factorymethod;

import main.java.factorymethod.IServico;
import main.java.factorymethod.ServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarTest {

    @Test
    void deveCadastrarLocal() {
        IServico servico = ServiceFactory.obterService("Cadastrar");
        assertEquals("Cliente adicionado com sucesso", servico.executar());
    }

    @Test
    void deveCancelarLocal() {
        IServico servico = ServiceFactory.obterService("Cadastrar");
        assertEquals("Cliente removido", servico.cancelar());
    }

}