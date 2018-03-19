pipeline {
    agent any
    environment {
        VALUE_ONE = '1'
        VALUE_TWO = '2'
        VALUE_THREE = '3'
    }
    stages {
        stage("BASIC WHEN - Branch") {
            when {
                expression {
                    branch  == 'master'
                }
            }
            steps {
                echo 'BASIC WHEN - Master Branch!'
            }
        }
        stage('WHEN EXPRESSION with AND') {
            when {
                expression {
                    VALUE_ONE == '1' && VALUE_THREE == '3'
                }
            }
            steps {
                echo "WHEN with AND expression works!"
            }
        }

        stage('WHEN EXPRESSION with OR') {
            when {
                expression {
                    VALUE_ONE == '1' || VALUE_THREE == '2'
                }
            }
            steps {
                echo "WHEN with OR expression works"
            }
        }

        stage("AllOf") {
            when {
                allOf {
                    environment name: 'VALUE_ONE', value: '1'
                    environment name: 'VALUE_TWO', value:  '2'
                }
            }
            steps {
                echo "AllOf Works!!"
            }
        }

        stage("Not AnyOf") {
            when {
                not {
                    anyOf {
                        branch "development"
                        environment name:'VALUE_TWO', value: '4'
                    }
                }
            }
            steps {
                echo "Not AnyOf - Works!"
            }
        }
    }
}