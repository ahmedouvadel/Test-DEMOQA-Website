Feature: Authentification utilisateur

  Scenario: Connexion réussie avec des identifiants valides
    Given l'utilisateur est sur la page de connexion
    When il saisit l'identifiant "admin" et le mot de passe "admin"
    And clique sur le bouton de connexion
    Then il est redirigé vers la page d'accueil

  Scenario: Échec de connexion avec des identifiants invalides
    Given l'utilisateur est sur la page de connexion
    When il saisit l'identifiant "user" et le mot de passe "wrongpass"
    And clique sur le bouton de connexion
    Then un message d'erreur s'affiche
