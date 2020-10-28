# language: pl
@automatyczny

Funkcja: Jako użtkownik paczkomatu mogę w szybki i łatwy sposób odnaleźć przesyłkę z poziomu strony startowej

  Scenariusz: Wyszukiwanie pojedynczej paczki
    Zakładając, że użytkownik znajduje się na stronie domowej Inpost
    Jeśli użytkownik wprowadzi numer paczki "630075127031589010345249"
    Oraz kliknie przycisk Znajdż
    Wtedy nastąpi przekierowanie na stronę śledzenia paczki "https://inpost.pl/sledzenie-przesylek?number=630075127031589010345249"
    I paczka będzie w statusie "dostarczona"