
  Feature:


  # gherkin language
  #        Ruby -Backend language
  # Gherkin Language has keyword
     #Given
     #When
     #Then
     #And

  #   BDD  - Behavioral Development Driven
     # Reusable
     # readablty


  # What is cucumber testing Tool?
    # We can create scenario with plain language
    # The cucumber tool bring collaboration to team
    # We are using Gherkin
    # to start a test a test case we need to declerate "Scenario"
    # it is readable
    # it is reusable

   # Gherkin Language
    # is plain language driven from Ruby
    # langugae that testers use to define test cases in cucumber
    # this language describe use cases or scenarios in a way that can be read and understand by
    # almost everyone in the team


    Scenario: Login to amazon
      Given The user wants to go to website
      When The user wants to enter username
      Then The user wants to enter password
      Then The user wants to click remember me
      And The user wants to click submit
      But The user wantss  sdasdas

    Scenario: Login with incorrect data
      Given The user wants to go to website
      When the user wants to enter incorrect username
      Then the user wants to enter password
      And The user wants to click submit

#    Task 1

     # Create a scenario that you can login Gmail
     # 5 min

    Scenario: Verify that login to gmail with positive credentials
      Given The user wants to go to google
      When The user wants to click gmail
      Then The user wants to enter email
      And The user wants to enter password
      #Then The user wants to click login
     # And The user wants to verify the first email

   #mmm