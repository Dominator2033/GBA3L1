package ru.geekbrains;

public class ModelManager {
    private final Model model;
    private final Object lock = new Object();
    private static ModelManager modelManager;
    static {
        modelManager = new ModelManager();
    }

    private ModelManager(){
        model = new Model();
    }

    public static ModelManager getInstance() {
        return modelManager;
    }

    public Model getModel() {
        synchronized (lock) {
            return model;
        }
    }
}
