pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9' // Sesuaikan dengan nama Maven yang dikonfigurasi di Jenkins
    }

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
                        sh 'mvn --version'  // Cek apakah Maven dikenali
                        sh 'mvn clean test'  // Jalankan pengujian dengan Maven
                    }
                }
            }
        }
    }
}
