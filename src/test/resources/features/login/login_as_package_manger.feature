# language: pl
@manualne

Funkcja: Jako Manager Paczek mogę zalogować się do systemu

  Scenariusz: Wybór roli dla logowania
    Zakładając, że użytkownik znajduje się na stronie domowej Inpost
    Jeśli użytkownik kliknie przycisk Zaloguj się
    Wtedy dropdown z wyborem dwóch ról do logowania jest rozwinięty

  Scenariusz: Wybór roli do logowania jak manager paczek
    Zakładając, że dropdown z wyborem roli do logowania jest rozwinięty
    Jeśli użytkownik kliknie w opcję Manager Paczek
    Wtedy strona logowania do konta klienta jest otwarta

  Scenariusz: Logowanie do konta klienta
    Zakładając, że użtkownik znajduje się na stronie logowania do konta
    Jeśli użytkownik wprowadzi poprawny adres e-mail
    Oraz użytkownik wprowadzi poprawne hasło
    Oraz użytkownik kliknie przycisk Zaloguj
    Wtedy zostanie zalogowany do swojego konta oraz przeniesiony na panel klienta