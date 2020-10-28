# language: pl
@manualne

Funkcja: Jako WebTrucker mogę zalogować się do systemu

  Scenariusz: Wybór roli dla logowania
    Zakładając, że użytkownik znajduje się na stronie domowej Inpost
    Jeśli użytkownik kliknie przycisk Zaloguj się
    Wtedy dropdown z wyborem dwóch ról do logowania jest rozwinięty

  Scenariusz: Wybór roli do logowania jak WebTracker
    Zakładając, że dropdown z wyborem roli do logowania jest rozwinięty
    Jeśli użytkownik kliknie w opcję WebTracker
    Wtedy strona logowania do konta klienta jest otwarta

  Scenariusz: Logowanie do konta klienta
    Zakładając, że użtkownik znajduje się na stronie logowania do konta
    Jeśli użytkownik wprowadzi dane logowania
    | admin@dmian.pl | pass123 |
    Oraz użytkownik kliknie przycisk Zaloguj się
    Wtedy zostanie zalogowany do swojego konta oraz przeniesiony na panel klienta