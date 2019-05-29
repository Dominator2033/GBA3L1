package ru.geekbrains;

import android.annotation.SuppressLint;
import android.support.v7.widget.AppCompatButton;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("ViewConstructor")
public class CustomView extends LinearLayout {
    private @Model.MID
    int id;
    private TextView textView;
    private AppCompatButton button;

    public CustomView(android.view.View parent, @Model.MID int id) {
        super(parent.getContext());
        textView = parent.findViewById(R.id.text);
        button = parent.findViewById(R.id.button);
        this.id = id;
    }

    public static CustomView newInstance(android.view.View container, @Model.MID int id) {
        return new CustomView(container, id);
    }

    public void setButtonClickListener(OnClickListener listener) {
        button.setOnClickListener(listener);
    }

    public void setButtonText(String text) {
        this.button.setText(text);
    }

    public void setText(String text) {
        this.textView.setText(text);
    }
}
