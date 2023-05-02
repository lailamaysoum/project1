package com.example.partproject1;

public class DataClass {

    private String dataTitle;
    private String dataDesc;
    private String dataImage;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataDesc() {

        return dataDesc;
    }

    public String getDataImage() {

        return dataImage;
    }

    public DataClass(String dataTitle, String dataDesc, String dataLang) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
    }

    public DataClass(){

    }
}
