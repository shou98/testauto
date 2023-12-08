Feature: Home page
  @test
  Scenario: Check title
    Given A user navigates to HomePage "com"
    Then page title is "Google"
    Then I take ScreenShot