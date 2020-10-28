# language: pl
@manualne

Funkcja: Jako właściciel sklepu internetowego mogę zostać partnerem usługi szybkie zwroty

  Scenariusz: Wybranie opcji zostań partnerem na stronie
    Zakładając, że użytkownik znajduje się na stronie zwrotów
    Jeśli użytkownik kliknie w przycisk Zostań partnerem
    Wtedy instrukacja przystąpienia do programu jest otwarta
    I przycisk Wypełnij formularz jest widoczny

  Scenariusz: Wysyłka formularza zgłoszeniowego do usługi szybkie zwroty
    Zakładając, że przycisk Wypełnij formularz jest dostępny na stronie
    Jeśli użytkownik kliknie w przycis Wypełnij formularz
    Wtedy formularz zgłoszeniowy jest otwarty
    Jeśli użytkownik wyprowadzi dane do formularza
    | Labelka            | Wartość           |
    | Adres strony www   | https://strona.pl |
    | Imię i nazwisko    | Test Testowy      |
    | Adres firmy        | Adres             |
    | Kod pocztowy       | 30-000            |
    | Telefon kontaktowy | 123456789         |
    | Adres e-mail       | test@test.pl      |
    Oraz kliknie przycisk Wyślij
    Wtedy formularz zwrotu jest wysłany