Feature: Probar Login pagina web

  @tag1
  Scenario: Validar Login exitoso
    Given Que ingreso a la pagina web www.saucedemo.com
    When Se diligencia las credenciales usuario "standard_user" y password "secret_sauce"
    Then Se logeo correctamente a la pagina web

  @tag2
  Scenario: Validar Login no exitoso
    Given Que ingreso a la pagina web www.saucedemo.com
    When Se diligencia las credenciales usuario "prueba" y password "secret_sauce"
    Then Se logeo no exitoso a la pagina web