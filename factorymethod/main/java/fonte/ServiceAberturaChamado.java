package main.java.factorymethod;

public class ServiceAberturaChamado implements IServico {

    public String executar() {
        return "Ordem de serviço aberta";
    }

    public String cancelar() {
        return "Ordem de seriço cancelado";
    }
}