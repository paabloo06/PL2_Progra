package controller;

import model.ClienteBase;

public class SessionManager {
    private static SessionManager instance;

    private ClienteBase clienteActual;

    private SessionManager() {
        // Evita que se instancie desde fuera de la clase
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void setClienteActual(ClienteBase cliente) {
        this.clienteActual = cliente;
    }

    public ClienteBase getClienteActual() {
        return clienteActual;
    }
}
