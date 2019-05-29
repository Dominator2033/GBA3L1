package ru.geekbrains;

public interface Main {
    interface Model {
        void increment(@ru.geekbrains.Model.MID int id);
        short getData(@ru.geekbrains.Model.MID int id);
    }

    interface View {
        void changeText(@ru.geekbrains.Model.MID int id, String text);
        void changeButtonText(@ru.geekbrains.Model.MID int id, String text);
    }

    interface Presenter{
        void onButtonClicked(Main.RecourceManager manager, @ru.geekbrains.Model.MID int id);
        void onAttachView(RecourceManager manager, Main.View view);
        void onDetachView();
        void onDestroy();
    }

    interface RecourceManager{
        String getLabelString(@ru.geekbrains.Model.MID int id, short value);
        String getButtonString(@ru.geekbrains.Model.MID int id, short value);
    }
}
