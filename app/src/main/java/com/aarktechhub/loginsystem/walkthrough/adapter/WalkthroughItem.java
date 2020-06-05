package com.aarktechhub.loginsystem.walkthrough.adapter;

public class WalkthroughItem {
    String Title,Description;
    int img;

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getImg() {
        return img;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public WalkthroughItem(String title, String description, int img) {
        Title = title;
        Description = description;
        this.img = img;
    }

    @Override
    public String toString() {
        return "WalkthroughItem{" +
                "Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", img=" + img +
                '}';
    }
}
