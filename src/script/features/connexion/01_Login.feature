@login
Feature: Je souhaite tester la page de login
  En tant que utilisateur je souhaite tester la page de connexion

  @login_valid_credential
  Scenario: Login avec des données valides
    Given Je me connecte sur l application Orange
    When Je saisie un username "Admin"
    And Je saisie un password "admin123"
    And Je clique sur le bouton Login
    Then Redirection vers la page Dashboard "Dashboard"
