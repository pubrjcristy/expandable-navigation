package com.techatmosphere.expandablenavigation.model;

/**
 * @author nirwannursabda
 * @date 07/03/18
 */

public class ChildModel {
    String title;
    boolean isSelected;
    int id;
    public ChildModel(int id, String title){
        this.id = id;
        this.title = title;
    }

    public ChildModel(int id, String title, boolean isSelected){
        this.id = id;
        this.title = title;
        this.isSelected = isSelected;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
