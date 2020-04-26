mavenJob('maven') {
    logRotator(-1, 10)
    jdk('Java 8')
    scm {
        github('jitpack/maven-simple.git', 'master')
    }
    triggers {
        githubPush()
    }
    goals('clean package')
}
