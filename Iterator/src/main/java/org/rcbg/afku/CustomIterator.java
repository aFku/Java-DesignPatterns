package org.rcbg.afku;

public class CustomIterator implements IIterator{

    private int iterationIndex = -1;
    private CustomArray array;

    public CustomIterator(CustomArray array){
        this.array = array;
    }

    @Override
    public String getNext() {
        iterationIndex ++;
        return array.getIndex(iterationIndex);
    }

    @Override
    public boolean hasMore() {
        return array.getIndex(iterationIndex + 1) != null;
    }
}
