package main.java.factorymethod;

public class ServiceFactory {

    public static IServico obterService(String service) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("main.java.factorymethod.Service" + service);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServico) objeto;
    }
}