# language: pl
@automatyczny @funkcjonalny

Funkcja: Jako użytkownik mogę wyszukać wiele paczkomatów za pomocą API

  Scenariusz: : Trakowanie paczkomatu za pomocą API
    Zakładając, że  endpoint istnieje
    Jeśli użytkownik wysyła zapytanie o liczbę paczkomatów w Krakowie
    Wtedy odpowiedź powinna zawierać listę ograniczoną do 30 paczkomatów z kodem i adresem paczkomatu

