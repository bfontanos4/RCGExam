Feature: Check Basic Calculator Page functionality

  Scenario Outline: TC001_Application should be able to add for 2 integer correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          0 |

  Scenario Outline: TC002_Application should be able to subtract 2 integer correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          1 |

  Scenario Outline: TC003_Application should be able to multiply for 2 integer correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          2 |

  Scenario Outline: TC004_Application should be able to divide for 2 integer correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          3 |

  Scenario Outline: TC005_Application should be able to concatenate 2 integer correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          4 |

  Scenario Outline: TC006_Application should be able to add for 2 float correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          5 |

  Scenario Outline: TC007_Application should be able to subtract for 2 float correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          6 |

  Scenario Outline: TC008_Application should be able to multiply for 2 float correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          7 |

  Scenario Outline: TC009_Application should be able to divide for 2 float correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          8 |

  Scenario Outline: TC010_Application should be able to concatenate for 2 float correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |          9 |

  Scenario Outline: TC011_Application should be able to add for negative value correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         10 |

  Scenario Outline: TC012_Application should be able to subtract for negative value correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         11 |

  Scenario Outline: TC013_Application should be able to multiply for negative value correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         12 |

  Scenario Outline: TC014_Application should be able to divide for negative value correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         13 |

  Scenario Outline: TC015_Application should be able to concatenate for negative value correctly
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         14 |

	Scenario Outline: TC016_Application should not be able to add 2 string value
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to see error message display

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         15 |
      
	Scenario Outline: TC017_Application should not be able to subtract 2 String value
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to see error message display

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         16 |
      
	Scenario Outline: TC018_Application should not be able to multiply 2 String value
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to see error message display

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         17 |
      
	Scenario Outline: TC019_Application should not be able to divide 2 String Value
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to see error message display

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         18 |
 
   Scenario Outline: TC020_Application should be able to concatenate 2 String Value
    Given user fetch the details from test data <Sheet Name> and <Row Number>
    And user enters the First Number and Second Number
    And user selects operation
    When user click on Calculate
    Then user able to verify the actual answer and expected answer given in test data

    Examples: 
      | Sheet Name      | Row Number |
      | BasicCalculator |         19 |