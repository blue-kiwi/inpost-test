# language: pl
@manualne

Funkcja: Jako właściciel sklepu internetowego mogę zostać partnerem usługi szybkie zwroty

  Scenariusz: Wybranie opcji zostań partnerem na stronie
    Zakładając, że użytkownik znajduje się na stronie zwrotów
    Jeśli użytkownik kliknie w przycisk zostań partnerem
    Wtedy instrukacja przystąpienia do programu jest otwarta
    I przycisk Wypełnij formularz jest widoczny

  Scenariusz: Otwarcie formularza zgłoszeniowego do usługi szybkie zwroty
    Zakładając, że przycisk Wypełnij formularz jest dostępny na stronie
    Jeśli użytkownik kliknie w przycis Wypełnij formularz
    Wtedy formularz zgłoszeniowy jest otwarty

  Scenariusz: Wysyłka formularza zgłoszeniowego do usługi szybkie zwroty
    Zakładając, że formularz zgłoszeniowy jest otwarty
    Jeśli użytkownik wpisze adres strony "www"
    Oraz użytkownik wpisze "imię i nazwisko"
    Oraz użytkownik wpisze "adres firmy"
    Oraz użytkownik wpisze "kod pocztowy"
    Oraz użytkownik wpisze "telefon kontaktowy"
    Oraz użytkownik wpisze "adres email"
    Oraz kliknie przycisk Wyślij
    Wtedy formularz zwrotu jest otwarty