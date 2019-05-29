package ru.geekbrains;

public class Presenter implements Main.Presenter {
    private Main.View view;
    private Main.Model model;

    public Presenter(Main.Model model) {
        this.model = model;
    }

    @Override
    public void onButtonClicked(Main.RecourceManager manager, @Model.MID int id) {
        if (manager != null && model != null) {
            model.increment(id);
            short newValue = model.getData(id);
            if (view != null) {
                view.changeText(id, manager.getLabelString(id, newValue));
                view.changeButtonText(id, manager.getButtonString(id, newValue));
            }
        }
    }

    @Override
    public void onAttachView(Main.RecourceManager manager, Main.View view) {
        this.view = view;

        if (model != null && this.view != null) {
            this.view.changeText(Model.HOUR, manager.getLabelString(Model.HOUR, model.getData(Model.HOUR)));
            this.view.changeButtonText(Model.HOUR, manager.getButtonString(Model.HOUR, model.getData(Model.HOUR)));

            this.view.changeText(Model.MINUTE, manager.getLabelString(Model.MINUTE, model.getData(Model.MINUTE)));
            this.view.changeButtonText(Model.MINUTE, manager.getButtonString(Model.MINUTE, model.getData(Model.MINUTE)));

            this.view.changeText(Model.SECOND, manager.getLabelString(Model.SECOND, model.getData(Model.SECOND)));
            this.view.changeButtonText(Model.SECOND, manager.getButtonString(Model.SECOND, model.getData(Model.SECOND)));
        }
    }

    @Override
    public void onDetachView() {
        this.view = null;
    }

    @Override
    public void onDestroy() {
        model = null;
    }
}
