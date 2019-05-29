package ru.geekbrains;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

public class Model implements Main.Model {
    @Retention(SOURCE)
    @IntDef({HOUR, MINUTE, SECOND})
    @interface MID {
    }

    static final byte HOUR = 1;
    static final byte MINUTE = 2;
    static final byte SECOND = 3;
    private short hours;
    private short minutes;
    private short seconds;

    @Override
    public void increment(@MID int id) {
        switch (id) {
            case HOUR:
                ++hours;
                break;
            case MINUTE:
                ++minutes;
                break;
            case SECOND:
                ++seconds;
                break;
        }
    }

    @Override
    public short getData(@MID int id) {
        switch (id) {
            case HOUR:
                return hours;
            case MINUTE:
                return minutes;
            case SECOND:
                return seconds;
        }
        return -1;
    }
}
