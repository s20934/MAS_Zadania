package com.company;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static java.nio.file.FileVisitResult.CONTINUE;
import static java.time.temporal.ChronoUnit.DAYS;


public class Main {

    public static void main(String[] args) {



//        1. Jak przechowasz wiele liczb typu int gdy wiadomo ile ich jest? Jak to zrobisz gdy w trakcie
//        działania programu będą dodawane i/lub usuwane? Jak je wyświetlisz na konsoli?
        System.out.println("===========");
        System.out.println("Zadanie 1");
        Integer [] listaInt = new Integer[5];
        listaInt[0] = 5;
        listaInt[1] = 2;
        System.out.println(listaInt[0]);


        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.remove(3);
        System.out.println(arrlist);

//        2. Stwórz generator losowych string’ów dla podanej długości tekstu.
        System.out.println("===========");
        System.out.println("Zadanie 2");

        int leftLimit = 97; // zakres dolny dla znaków od a
        int rightLimit = 122; // zakres gorny dla znakow do z
        int targetStringLength = 10; //długość


        String generatedString = new Random().ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);



//        3. Stwórz generator tekstów typu Lorem Ipsum.
        System.out.println("===========");
        System.out.println("Zadanie 3");

        int wordAmount = 10;
        int wordLenght = 0;
        for (int i = 0; i < wordAmount ; i++) {
            wordLenght = (int) ((Math.random() * (10 - 1)) + 1);

           String generatedString2  = new Random().ints(leftLimit, rightLimit + 1)
                    .limit(wordLenght)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            System.out.print(generatedString2+" ");

        }
        System.out.println();


//        4. Napisz program zapamiętujący zmienną liczbę string’ów, a następnie usuwający losowe z nich.
//                Wyświetl na konsolę dane przed i po operacji.
        System.out.println("===========");
        System.out.println("Zadanie 4");

        ArrayList<String> changeCapacityStringList = new ArrayList<String>();
        changeCapacityStringList.add("Test1");
        changeCapacityStringList.add("Test2");
        changeCapacityStringList.add("Test3");
        changeCapacityStringList.add("Test4");
        changeCapacityStringList.add("Test5");
        changeCapacityStringList.add("Test6");
        System.out.println(changeCapacityStringList.stream().count());
        int listCapacity = changeCapacityStringList.size();
        System.out.println(changeCapacityStringList);

        int wordToDelete = (int) ((Math.random() * (listCapacity - 0)) + 0);
        System.out.println(wordToDelete);

        changeCapacityStringList.remove(wordToDelete);
        System.out.println(changeCapacityStringList);



//        5. Wygeneruj zestaw losowych liczb z podanego zakresu. Następnie znajdź największą oraz
//        najmniejszą spośród nich.
        System.out.println("===========");
        System.out.println("Zadanie 5");

        int amountOfInt = 5;
        int[] randomInt = new int[5];

        for (int i = 0; i < amountOfInt; i++)
        {
           randomInt[i] = (int) ((Math.random() * (50 - 0)) + 0);
            System.out.println(randomInt[i]);
        }
       Arrays.sort(randomInt);
        System.out.println("Min: "+ randomInt[0]+", Max: "+ randomInt[randomInt.length-1]);



//        6. Zapamiętaj dane charakteryzujące graniastosłup prawidłowy. Opracuj rozwiązanie
//        przechowujące dane o znanej oraz zmiennej liczbie graniastosłupów. Wyświetl na konsoli
//        informacje ich dotyczące.




//        7. Zapamiętaj dane charakteryzujące dowolny graniastosłup. Opracuj rozwiązanie
//        przechowujące dane o znanej oraz zmiennej liczbie graniastosłupów. Wyświetl na konsoli
//        informacje ich dotyczące.


//        8. Przygotuj rozwiązanie modyfikujące wartość podanych liczb (np. zwiększające o 1).


//        9. Stwórz program obliczający liczbę dni od rozpoczęcia semestru oraz do jego zakończenia.
//        Skorzystaj z klas (np. LocalDateTime) znajdujących się w pakiecie pakiet java.time
//        dodanych do Java 8.
        LocalDateTime startSemestr = LocalDateTime.of(2022,01,1,12,30);
        LocalDateTime endSemestr = LocalDateTime.of(2022,06,24,12,30);

        //        System.out.println(DAYS.between(startSemestr,endSemestr));
        long dayDiffrence = DAYS.between(startSemestr,endSemestr);
        System.out.println(dayDiffrence);

//        10. Przećwicz kilka refaktoringów/refaktoryzacji (refactoring) dostępnych w nowoczesnych IDE,
//        np. w IntelliJ IDEA, np. Safe Delete, Extract Method, Extract Constant, Extract Field, Extract
//        Parameter, Introduce Variable, Rename.


//        11. Podaj przykłady zastosowania konstrukcji break oraz continue.
        //NP switch Case


//        12. Stwórz krótki program korzystający z konstrukcji switch. Pamiętaj o właściwym
//        wykorzystaniu break oraz default.

        System.out.println("===========");
        System.out.println("Zadanie 12");

        int podanaLiczba = 3;

        switch (podanaLiczba){
            case 1:
                System.out.println("jestem jeden");
                break;
            case 2:
                System.out.println("jestem dwa");
                break;
            case 3:
                System.out.println("Jestem trzy i nie mam break");
            case 4:
                System.out.println("Jestem cztery");
            default:
                System.out.println("Wartosc domyslna");
        }



//        13. Stwórz krótki program korzystający z pętli while oraz do/while. Czym one się różnią?
        //while jeśli warunek nie jest spełniony, nie zostanie wykonana
       int a = 5;
        while(a<5){
            System.out.println("Wszedlem do while");
        }

        int b = 10;

        do{
            System.out.println("Jestem w do while");
        }while (b<10);

        //do while jeśli warunek nie jest spełniony, zostanie wykonana przynajmniej raz

//        14. Chcemy przechować informacje o różnych rodzajach urządzeń, każde z nich ma różny zestaw
//        cech. Jak to zrobić? Jak umieścić je we wspólnej kolekcji i wyświetlić na konsolę?



//                15. Mamy kompletnie różne byty, ale każdy z nich ma wspólną umiejętność, np. poruszania się.
//        Jak to zapamiętać w programie, iterować po nich i uruchamiać tę umiejętność? Nie wolno
//        stosować wspólnej nadklasy.


//        16. Podaj przykład wykorzystania własnej klasy obsługi błędu i wykorzystania jej razem z
//        konstrukcją throw.


//        17. Załóżmy, że potrzebujemy przechować informacje, np. o silnikach. Mają jakieś wspólne cechy,
//        a jedną z nich jest rodzaj silnika. Jak to zrobić? Jak będzie wyglądała metoda, która w zależności
//        od rodzaju silnika, będzie robiła różne rzeczy. Podaj dwa sposoby rozwiązania tego problemu i
//        ich zalety/wady.


//        18. Podaj przykłady wymagań biznesowych, które można zrealizować za pomocą różnych rodzajów
//        pojemników. Stwórz takie implementacje.
//                a. natywna tablica,
//        b. lista,
//                c. zbiór (Set),
//                d. mapa (Map).
//                        W każdym z przypadków, dodaj kilka obiektów, usuń kilka spełniających określone wymagania,
//        wyszukaj oraz wyświetl zawartość pojemników.


//        19. Po co w języku Java stosuje się generics? Stwórz przykładowe programy, wykorzystujące tę
//        koncepcję przy implementacji klas oraz metod.


//        20. Podaj przykład zastosowania pętli for-each.


//        21. Zapisz do pliku losowe string’i. Następnie je odczytaj i wyświetl na konsoli.


//        22. Zapisz/odczytaj do/z pliku przykładowe dane opisujące osobę. Postaraj się aby zajmowały jak
//        najmniej miejsca. Rozważ wykorzystanie klasy ZipOutputStream z biblioteki Java.
//        23. Wyświetl listę plików w podanym katalogu. Sprawdź czy znajduje się tam plik, którego nazwa
//        zawiera podany tekst.
//        24. Podaj przykład wykorzystania konstrukcji try-with-resources języka Java.
//        25. Podaj przykład wykorzystania notacji diamentowej <> języka Java. Jakie są jej zalety/wady?
//                26. Stwórz przykład wykorzystujący umieszczenie kodu metody w interfejsie (wymaga Java 8 lub
//        nowsza).
//        27. Stwórz przykład używający wyrażeń lambda w Java.



    }
}
