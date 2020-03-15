package com.iffy.jetpack.adapter;

/**
 * author : iffy
 * time   : 2020/03/14
 */
public class ItemBean {
    int imageResource;
    String content;

    public ItemBean(int imageResource, String content) {
        this.imageResource = imageResource;
        this.content = content;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
