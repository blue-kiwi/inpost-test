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
    Wtedy rozwinie się lista z dwoma sklepami

  Scenariusz: Wybór sklepu internetowego
    Zakładając, że dropdown z listę dwóch sklepów jest rozwinięty
    Jeśli użytkownik kliknie w opcję "MILITARIA.PL SP. Z O.O. SP. K."
    Oraz użytkownik kliknie przycisk Zwróc teraz
    Wtedy formularz zwrotu jest otwarty

  Scenariusz: Dokonanie zwrotu
    Zakładając, że formularz zwrotu jest otwarty
    Oraz dysponując następującymi danymi paczki
      | Numer zamówienia | Nazwisko | Telefon   | Email        | Powód zwrotu       | Opis        |
      | 123456           | Testowy  | 123456789 | test@test.pl | Pomyłka w wsysyłce | Lorem ipsum |
    Jeśli użytkownik wpisze <Numer zamówenie> w pole numer zamówienia
    Oraz wpisze <Nazwisko> w pole imię i nazwisko
    Oraz wpisze <Telefon> w pole twój numer telefonu
    Oraz wpisze <Email> w pole twój adres email
    Oraz wpisze <Powód zwrotu> w pole powód zwrotu
    Oraz poda <Opis> w pole opis
    Oraz kliknie przycisk Wyślij
    Wtedy formularz jest wysłany
    I użytkownik otrzymuje kod zwrotu sms lub e-mail