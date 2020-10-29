# language: pl
@automatyczny @funkcjonalny

Funkcja: Jako użytkownik mogę wyszukać wiele paczkomatów za pomocą API

  Scenariusz: : Znajdowanie paczkomatów w Krakowie za pomocą API
    Zakładając, że api do wyszukiwania paczkomatów istnieje
    Jeśli użytkownik wyśle zapytanie o adresy 30 paczkomatów w "Kraków"
    Wtedy odpowiedź powinna zawierać listę ograniczoną do 30 adresów
    I każdy adres powinien mieć adres w formacie [Kraków-ulica-numer]

#  Scenario: Znajdowanie paczkomatów w Krakow
#  Given Locker api exists
#  When I request for address of 30 parcel lockers in 'Kraków'
#  Then The response should contain list of 30 address
#  And Each address should have address matching [Kraków-ulica-numer]

