package com.codedifferently.lambda.comics;

import java.util.*;

public class Runner {
    public static void main(String... args){
        List<ComicBook> comics = new ArrayList<>();
        comics.add(new ComicBook("Marvel", "Peter Parker: The Spectacular Spider-Man", 308));
        comics.add(new ComicBook("Marvel", "The Amazing Spider-Man", 15));
        comics.add(new ComicBook("WildStorm","Battle Chasers", 309));
        comics.add(new ComicBook("DC", "Lobo: Unbound", 2));
        comics.add(new ComicBook("Image", "Spawn", 2));
        comics.add(new ComicBook("Marvel", "X-Force", 13));
        comics.add(new ComicBook("Marvel", "X-Force", 14));
        comics.add(new ComicBook("Marvel", "The Amazing Spider-Man", 9));
        comics.add(new ComicBook("WildStorm", "Battle Chasers", 308));
        comics.add(new ComicBook("DC", "Lobo: Unbound", 1));
        comics.add(new ComicBook("Marvel", "Peter Parker: The Spectacular Spider-Man", 309));
        comics.add(new ComicBook("Image", "Spawn", 1));
        comics.add(new ComicBook("Marvel", "The Amazing Spider-Man", 10));

        comics.forEach(c -> System.out.println(c));


        Collections.sort(comics, (ComicBook o1, ComicBook o2) ->  o1.getIssue() - o2.getIssue());

        //System.out.println("-------------------------------------------------");
        comics.forEach(c -> System.out.println(c));


    }
}
