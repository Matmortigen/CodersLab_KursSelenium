Feature: registration

  Scenario Outline: tytul
    Given pierwsza instrukcja
    And druga instrukcja
    When trzecia instrukcja <firstName> <lastName> <emailAddress> <username> <addressa> <addressb> <phoneNumber> <city> <state> <zip> <password>
    And czwarta instrukcja
    Then piata instrukcja
    And szosta instrukcja

    Examples:

      | firstName | lastName | emailAddress       | username | addressa       | addressb      | phoneNumber | city     | state    | zip      | password |
      | Jacek     | Placek   | j.placek@gamil.com | placek   | Slowackiego 10 | Mickiewicza 5 | 450234741   | Warszawa | PL       |05720     | iwona231 |