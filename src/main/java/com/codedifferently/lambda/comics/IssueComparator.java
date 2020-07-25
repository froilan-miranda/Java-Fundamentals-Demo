package com.codedifferently.lambda.comics;

import java.util.Comparator;

public class IssueComparator implements Comparator<ComicBook> {
    @Override
    public int compare(ComicBook o1, ComicBook o2) {
        return o1.getIssue() - o2.getIssue();
    }

}
