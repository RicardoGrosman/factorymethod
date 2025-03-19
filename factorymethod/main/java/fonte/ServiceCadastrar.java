package main.java.factorymethod;

public class ServiceCadastrar implements IServico {

    public String executar() {
        return "Cliente adicionado com sucesso";
    }

    public String cancelar() {
        return "Cliente removido";
    }
}