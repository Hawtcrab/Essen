package main.game.items;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/// Added to characters to give them the ability to hold items. Adds additional functionality
/// for complex item interaction.
public class Inventory implements IContentHaver{
    public LinkedList<BaseItem> contents;

    @Override
    public List<BaseItem> getContents() {
        return Collections.unmodifiableList(this.contents);
    }

    @Override
    public void tryAddContent(BaseItem item) {

    }

    @Override
    public void addContent(BaseItem item) {

    }

    @Override
    public void setContents(List<BaseItem> contents) {

    }

    @Override
    public boolean hasItem(BaseItem item, boolean nested) {
        return false;
    }

    @Override
    public BaseItem findItem(BaseItem item, boolean nested) {
        return null;
    }

    @Override
    public boolean willAccept(BaseItem item) {
        return false;
    }

    @Override
    public int getMaximumSize() {
        return 0;
    }
}
