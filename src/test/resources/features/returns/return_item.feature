# language: pl
@manualne

Funkcja: Jako użtkownik paczkomatu mogę w szybki sposób dokonać zwrotu

  Scenariusz: Rozwinięcie listy sklepów internetowych
    Zakładając, że użytkownik znajduje się na stronie zwrotów
    Jeśli użytkownik kliknie w przycisk Wybierz sklep
    Wtedy dropdown z listą sklepów internetowych jest rozwinięty

  Scenariusz: Filtrowanie listy sklepów
    Zakładając, że dropdown z listę sklepów jest rozwinięty
    Jeśli użytkownik wpisze nazwę sklepu "militari.pl"
    Wtedy rozwinie się lista z dwoma sklepami "MILITARIA.PL SP. Z O.O. SP. K." i "Taniemilitaria.pl"

  Scenariusz: Wybór sklepu internetowego
    Zakładając, że dropdown z listę dwóch sklepów "MILITARIA.PL SP. Z O.O. SP. K." i "Taniemilitaria.pl" jest rozwinięty
    Jeśli użytkownik kliknie w opcję "MILITARIA.PL SP. Z O.O. SP. K."
    Oraz użytkownik kliknie przycisk Zwróc teraz
    Wtedy formularz zwrotu jest otwarty

  Scenariusz: Dokonanie zwrotu
    Zakładając, że formularz zwrotu jest otwarty
    Jeśli użytkownik wprowadzi dane do formularza
    | Labelka            | Wartość      |
    | Numer zamówienia   | 1234567890   |
    | Imię i nazwisko    | Test Testowy |
    | Twój numer telefonu| 123456789    |
    | Twój adres e-mail  | test@test.pl |
    | Powód zwrotu       | Powód zwrotu |
    | Opis               | Lorem ipsum  |
    Oraz kliknie przycisk Wyślij
    Wtedy formularz jest wysłany
    I użytkownik otrzymuje kod zwrotu sms lub e-mail