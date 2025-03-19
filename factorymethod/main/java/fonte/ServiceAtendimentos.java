package main.java.factorymethod;

public class ServiceAtendimentos implements IServico {

    public String executar() {
        return "Serviço técnico definidos";
    }

    public String cancelar() {
        return "Serviço técnico não definidos";
    }
}