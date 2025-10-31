package main.game.items;

import java.util.List;

public interface IContentHaver {
    List<BaseItem> getContents();
    void tryAddContent(BaseItem item);
    void addContent(BaseItem item);
    void setContents(List<BaseItem> contents);
    boolean hasItem(BaseItem item, boolean nested);
    BaseItem findItem(BaseItem item, boolean nested);
    boolean willAccept(BaseItem item);
    int getMaximumSize();
    // Add more methods for content manipulation
}
