#!/usr/bin/env bash

# Accept licences
${ANDROID_HOME}/tools/bin/sdkmanager --licences

# Install dependencies
./gradlew androidDependencies || true