def build() {

    stage('Build') {
        echo 'in the build stuff'
    }
}

def results() {

    stage('Results') {
        echo 'in the results stuff'
    }
}

return this;
