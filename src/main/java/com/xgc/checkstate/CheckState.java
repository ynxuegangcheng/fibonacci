package com.xgc.checkstate;

public enum CheckState {
    NOT_CALCULATE(false),
    TRUE(true),
    FALSE(false);

    public boolean flag;

    CheckState(boolean flag) {
        this.flag = flag;
    }
}
