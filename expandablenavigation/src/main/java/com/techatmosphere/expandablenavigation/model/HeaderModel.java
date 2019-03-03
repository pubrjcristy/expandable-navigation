package com.techatmosphere.expandablenavigation.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nirwannursabda
 * @date 06/03/18
 */

public class HeaderModel {
    String title;
    int resource = -1;
    boolean isNew = false;
    boolean hasChild = false;
    boolean isSelected = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id = -1;

    List<ChildModel> childModelList = new ArrayList<>();

    public HeaderModel(int id, String title){
        this.id = id;
        this.title = title;
    }

    public HeaderModel(int id, String title, int resource){
        this.id = id;
        this.title = title;
        this.resource = resource;
    }

    public HeaderModel(int id, String title, int resource, boolean hasChild){
        this.id = id;
        this.title = title;
        this.resource = resource;
        this.hasChild = hasChild;
    }

    public HeaderModel(int id, String title, int resource, boolean hasChild, boolean isNew
        , boolean isSelected
    ){
        this.id = id;
        this.title = title;
        this.resource = resource;
        this.isNew = isNew;
        this.hasChild = hasChild;
        this.isSelected = isSelected;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public HeaderModel addChildModel(ChildModel childModel){
        this.childModelList.add(childModel);

        return this;
    }

    public List<ChildModel> getChildModelList() {
        return childModelList;
    }

    public void setChildModelList(List<ChildModel> childModelList) {
        this.childModelList = childModelList;
    }
}
