package com.example.textrecognition;

public class message_controller {
    private String mText1;
    private String mText2;
    private String mName;
    private String mStringName;

    public message_controller(String text1, String text2, String name) {
        mText1 = text1;
        mText2 = text2;
        mName = name;
    }
    public void changeText1(String text_1, String text_2) {
        mText1 = text_1;
        mText2 = text_2;
    }

    public String getText1() {
        return mText1;
    }

    public String getText2() {
        return mText2;
    }

    public String getName() {
        return mName;
    }

    public void changeStringName(String names) {
        mStringName=names;
    }
    public String getStringName() {
        return mStringName;
    }
}
