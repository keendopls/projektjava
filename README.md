# KALKULATOR POLA POWIERZCHNI

## Opis

Program do obliczania pola powierzchni użytkowej budynku.

## Spis treści

1. Powierzchnia - interfejs zawierający metodę liczącą polę powierzchni.
1. Budynek - klasa implementująca interfejs Powierzchnia, zawierająca pola z powierzchnią działki, ilością pięter i garażem.
1. Piętro - klasa implementująca interfejs Powierzchnia, zawierająca pola z ilością pomieszczeń, numerem piętra, oraz talbicą ElementPietra.
1. ElementPietra - klasa abstrakcyjna implementująca interfejs Powierzchnia, zawierająca pole z numerem piętra.
1. Mieszkanie - klasa dziedzicząca po klasie ElementPietra, zawierająca pola z wizytówka z imieniem i nazwiskiem mieszkańca oraz tablicą pomieszczeń.
1. Pomieszczenia- klasa dziedzicząca po klasie ElementPietra, zawierająca pola z szerokością i długością pomieszczenia oraz z jego nazwą.
1. Garaz- klasa dziedzicząca po klasie ElementPietra, zawierająca pola z szerokością i długością bramy.

## Sposób instalacji

Po uruchomieniu środowiska programistycznego sklonować repozytorium podając URL: https://github.com/keendopls/projektjava.git po czym podać dane logowania.

## Sposób użycia

Należy w klasie Main wprowadzić wybrane wartości dla pól i klas reprezentujących dane obszary.
 
## Preferencje co do współpracy

non-profit

## Autorzy

keendopls - Michał Szczupak - lab 5
Parkur1000 - Przemysław Węgrzyn - lab 6
Maziel99 - Maciej Zieliński - lab 6

# Informacje o licencji

Apache License 2.0