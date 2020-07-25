package com.codedifferently.lambda.comics;

import java.util.Comparator;

public class TitleComparator implements Comparator<ComicBook> {
    @Override
    public int compare(ComicBook o1, ComicBook o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
