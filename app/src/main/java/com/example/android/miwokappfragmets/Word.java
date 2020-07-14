package com.example.android.miwokappfragmets;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED=-1;



    public Word(String DefaultTranslation, String MiwokTranslation,int audioResourceId) {

        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public Word(String DefaultTranslation, String MiwokTranslation,int ImageResourceId,int audioResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId=audioResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
