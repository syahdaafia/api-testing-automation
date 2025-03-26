pipeline {
    agent any

    stages {
        stage('Checkout Repository') {
            steps {
                script {
                    // Clone hanya repo utama
                    checkout scm
                }
            }
        }

        stage('Run API Tests (Rest Assured)') {
            steps {
                dir('rest-assured') {  // Pindah ke folder rest-assured
                    script {
                        sh 'mvn clean test'  // Jalankan pengujian dengan Maven
                    }
                }
            }
        }
    }
}
