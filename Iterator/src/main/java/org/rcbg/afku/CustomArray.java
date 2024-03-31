package org.rcbg.afku;

import java.util.ArrayList;
import java.util.List;

public class CustomArray implements ICustomIterableArray{

    private List<String> arrayList = new ArrayList<>();

    public String getIndex(int index){
        try {
            return this.arrayList.get(index);
        } catch (IndexOutOfBoundsException e){
            return null;
        }
    }

    public void add(String element){
        arrayList.add(element);
    }

    @Override
    public IIterator getCustomIterator() {
        return new CustomIterator(this);
    }
}
