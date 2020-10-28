# language: pl
@automatyczny

Funkcja: Jako użytkownik mogę dokonać na allegro zakupu w ratach zero

  Scenariusz: Zakupy z ratami zero
    Zakładając, że użytkownik znajduje się na stronie domowej Allegro
    Jeśli użytkownik wyszuka towar o nazwie "bramka"
    I wybierze opcję raty zero
    Wtedy towary z ratami zero są wyświetlone na liście produktów
    Jeśli użytkownik wybierze pierwszy produkt z listy
    Oraz użytkownik kliknie w przycisk Dodaj do koszyka
    Oraz użytkownik kliknie w przycisk Przejdź do koszyka
    Wtedy towar jest dodany do koszyka
    I przycisk Kup na raty zero jest widoczny
    I towar jest dodany do koszyka
    I przycisk Kup na raty zero jest widoczny
    Jeśli użytkownik kliknie w przycisk Kup na raty zero
    Wtedy strona logowania jest otwarta
    I przycisk Zaloguj przez Facebook jest widoczny
    Jeśli użytkownik kliknie w przycisk Zaloguj przez Facebook
    Wtedy strona logowania Fecebooka jest otwarta