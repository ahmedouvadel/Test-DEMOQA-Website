Feature: Formulaire d'inscription sur DemoQA

  Scenario: Soumission du formulaire avec des informations valides
    Given l'utilisateur est sur la page du formulaire d'inscription
    When il saisit les informations personnelles "John" "Doe" "john.doe@example.com" "1234567890"
    And sélectionne le genre "Male" et la date de naissance "10/12/1995"
    And remplit les matières "Maths" et sélectionne les hobbies "Sports"
    And télécharge une photo "C:/images/profile.jpg"
    And saisit l'adresse actuelle "123 Main Street"
    And soumet le formulaire
    Then un message de confirmation s'affiche avec les informations saisies
