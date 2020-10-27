# language: pl
@manualne

Funkcja: Jako użytkownik mogę dokonać na allegro zakupu w ratach zero

  Scenariusz: Wyszukanie produktu z ratami zero
    Zakładając, że użytkownik znajduje się na stronie domowej Allegro
    Jeśli użytkownik wyszuka towar o nazwie bramka
    I wybierze opcję raty zero
    Wtedy towary z ratami zero są wyświetlone na liście produktów

  Scenariusz: Dodanie do koszyka produktu z ratami zero
    Zakładając, że towary z ratami zero są wyświetlone na liście produktów
    Jeśli użytkownik wybierze pierwszy produkt z listy
    Oraz użytkownik kliknie w przycisk Dodaj do koszyka
    Wtedy strona z posumowanie koszyka jest otwarta
    I towar jest dodany do koszyka
    I przycisk Kup na raty zero jest widoczny

  Scenariusz: Zakup na raty zero
    Zakładając, że użtkownik znajduje się na stronie z koszykiem
    I towar jest dodany do koszyka
    I przycisk Kup na raty zero jest widoczny
    Jeśli użytkownik kliknie w przycisk Kup na raty zero
    Wtedy strona logowania jest otwarta
    I przycisk Zaloguj przez Facebook jest widoczny

  Scenariusz: Logowanie do Allegro przez konto Facebooka
    Zakładając, że strona logowania jest otwarta
    I przycisk Zaloguj przez Facebook jest widoczny
    Jeśli użytkownik kliknie w przycisk Zaloguj przez Facebook
    Wtedy strona logowania Fecebooka jest otwarta