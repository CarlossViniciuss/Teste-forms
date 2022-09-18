Feature: envio de formulario

  Scenario: Preencher formulario
    Given que acesse o site "http://sampleapp.tricentis.com/101/app.php"
    When preencho os campos obrigatórios do primeiro formulario
    And preencho o formulario enter Insurant Data
    And preencho o formulario enter Product Data
    Then finalizo e envio o formulario