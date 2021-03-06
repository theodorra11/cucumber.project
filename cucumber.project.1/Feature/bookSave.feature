
Feature: Запазване на книга в библиотека

  
  Scenario: Запазване на намерената книга с данни за читателя
    Given Читателят селектира желания резултат.
    When Въвежда своето име "Теодора Пачелийска"
    And Въвежда своя имейл "pacheliyska@gmail.com"
    And Въвежда своя телефонен номер "0895491123"
    And Читателят запазва чрез натискане на бутон.
    Then Изписва съобщение "Успешно запазена книга"
    
    Scenario: Запазване на намерената книга с грешно въведено име
    Given Читателят селектира желания резултат.
    When Въвежда своето име ""
    And Въвежда своя имейл "pacheliyska@gmail.com"
    And Въвежда своя телефонен номер "0895491123"
    And Читателят запазва чрез натискане на бутон.
    Then Изписва съобщение "Неспешно запазена книга поради грешно въведено име"
    
    Scenario: Запазване на намерената книга с грешно въведен имейл
    Given Читателят селектира желания резултат.
    When Въвежда своето име "Теодора Пачелийска"
    And Въвежда своя имейл ""
    And Въвежда своя телефонен номер "0895491123"
    And Читателят запазва чрез натискане на бутон.
    Then Изписва съобщение "Неспешно запазена книга поради грешно въведен имейл"
    
    Scenario: Запазване на намерената книга с грешно въведен телефонен номер
    Given Читателят селектира желания резултат.
    When Въвежда своето име "Теодора Пачелийска"
    And Въвежда своя имейл "pacheliyska@gmail.com"
    And Въвежда своя телефонен номер ""
    And Читателят запазва чрез натискане на бутон.
    Then Изписва съобщение "Неспешно запазена книга поради грешно въведен телефонен номер"


  
