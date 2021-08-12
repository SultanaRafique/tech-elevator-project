package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary {

    List<Media> mediaItems = new ArrayList<>();

    public void addItem(Media item) {
        mediaItems.add(item);
    }

    public int getItemsInLibrary() {
        return mediaItems.size();
    }

    // Get count of items in library matching a specified format
    //
    // Match is case-sensitive
    public int getItemsInLibraryByFormat(String format) {
        int total = 0;
        if (format != null) {
            for (Media item : mediaItems) {
                if (item.getFormat().equals(format)) {
                    total++;
                }
            }
        }
        return total;
    }

    public List<Catalogable> getCatalogableItemsInLibrary() {
        List<Catalogable> items = new ArrayList<>();
        for (Media item : mediaItems) {
            if (item instanceof Catalogable) {
                items.add((Catalogable)item);
            }
        }
        return items;
    }

}
