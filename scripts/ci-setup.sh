#!/usr/bin/env bash

# Accept licences
${ANDROID_HOME}/tools/bin/sdkmanager --licenses

# Install dependencies
./gradlew androidDependencies || true