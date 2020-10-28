# language: pl
@automatyczny @funkcjonalny

Funkcja: Jako użytkownik mogę wyszukać wiele paczek za pomocą API

  Szablon scenariusza: Trakowanie paczki za pomocą API
  Zakładając, że shipx-proxy endpoint istnieje
  Jeśli użytkownik wysyła zapytanie o status przesyłki '<tracking_number>'
  Wtedy odpowiedź powinna przyjmować '<status>'

  Przykłady:
  | tracking_number           | status      |
  | 000000000000000000000000  | not-found   |
  | 630075127031589010345249  | delivered   |
  | 630091027031589130630794  | delivered   |