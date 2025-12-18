#!/usr/bin/env sh

##############################################################################
## Gradle wrapper script for Unix
##############################################################################

APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

APP_HOME=$(cd "$(dirname "$0")" && pwd)

CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar

JAVA_CMD="java"

exec "$JAVA_CMD" $DEFAULT_JVM_OPTS -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
