package com.londonappbrewery.destini;

public class TextButtons {
    private int mTextID,mTextButtonTop,mTextButtonBottom;

    public int getTextID() {
        return mTextID;
    }

    public void setTextID(int textID) {
        mTextID = textID;
    }

    public int getTextButtonTop() {
        return mTextButtonTop;
    }

    public void setTextButtonTop(int textButtonTop) {
        mTextButtonTop = textButtonTop;
    }

    public int getTextButtonBottom() {
        return mTextButtonBottom;
    }

    public void setTextButtonBottom(int textButtonBottom) {
        mTextButtonBottom = textButtonBottom;
    }

    public TextButtons(int TextResourceID, int TextTopResourceID, int TextBottomResourceID){
        mTextID = TextResourceID;
        mTextButtonTop = TextTopResourceID;
        mTextButtonBottom = TextBottomResourceID;
    }


}
