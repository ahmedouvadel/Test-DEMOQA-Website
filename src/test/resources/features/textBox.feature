Feature: Formulaire Text Box sur DemoQA

  Scenario: Remplir et soumettre le formulaire Text Box
    Given l'utilisateur est sur la page Text Box
    When il saisit le nom "John Doe", l'email "john.doe@example.com",l'adresse actuelle "123 Rue Principale" et l'adresse permanente "456 Rue Secondaire"
    And clique sur le bouton Submit
    Then les informations saisies sont affichées correctement
