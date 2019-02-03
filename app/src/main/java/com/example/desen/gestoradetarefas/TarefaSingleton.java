package com.example.desen.gestoradetarefas;

public class TarefaSingleton {

    private static final TarefaSingleton
            INSTANCE = new TarefaSingleton();

    private Tarefas tarefas;

    private TarefaSingleton() {

    }

    public static TarefaSingleton getInstance() {
        return INSTANCE;
    }

    public Tarefas getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefas tarefas) {
        this.tarefas = tarefas;
    }
}
