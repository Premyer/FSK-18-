# Premyer 18+ Studio

Native Android starter project using Kotlin and Jetpack Compose.

## Included in this starter
- Luxury Black & Neon Green theme
- Bottom navigation: Home, AI Studio, Beachwear, Gallery, Profile
- Prompt-entry UI for AI and beachwear workflows
- Gallery and privacy placeholder screens
- Android application ID: `com.premyer.studio`
- Minimum Android version: Android 10 (API 29)

## Build
Open this folder in Android Studio (JDK 17 recommended), allow Gradle sync, then run:

```bash
./gradlew assembleDebug
```

APK output:
`app/build/outputs/apk/debug/app-debug.apk`

## Not yet connected
This is a UI and app-architecture starter, not a production-ready service. Before release, configure:
1. Firebase project and Android app registration (`google-services.json`).
2. Firebase Authentication and Firestore security rules.
3. Private Cloud Storage rules and retention/deletion flows.
4. A server-side API for image generation. Never place provider API keys in the APK.
5. A reputable age-assurance provider and documented consent/content-rights controls.
6. A real image editor implementation and tests.

## Safety and privacy requirements
- Only adults may use the age-restricted areas.
- Do not generate non-consensual intimate imagery or sexualized depictions of minors.
- Require rights/consent for uploaded reference images and likeness use.
- Private media must be access-controlled; do not expose public download URLs by default.
- Provide account deletion, media deletion, export, and retention controls.
