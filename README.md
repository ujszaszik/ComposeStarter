# compose-starter

Full base project setup for using Jetpack Compose with Kotlin-Coroutines/Flow, Hilt, Retrofit, Moshi, Room.

The repository contains setup for usage of:
-------------------------------------------

- Gradle 7.2 (Kotlin DSL)
- Kotlin with Coroutines and Flow 1.6
- Hilt 1.0.0 (on top of Dagger 2.39)
- Jetpack Compose 1.1.0
- WorkManager 2.7.0
- Moshi 1.13.0
- Retrofit 4.9.0
- Room 2.4.0
- Timber 5.0.1
- Detekt 1.19.0


Basic implementations:
----------------------

- Dependencies added for all aforementioned libraries/frameworks' usage
- Kotlin DSL configured with Application Config, Library Config, Signing Config, Product Flavors.
- Application default configuration with Logging, Networking, WorkManager and Date Time compatibility setup
- Jetpack Compose navigation setup with Hilt, Application Graph, and added 'Host' types which can host navigation destinations
- Safe coroutine flows that can hold empty initial values, along with prepared Coroutine Scopes
- Network Utility to check network status safely and efficiently
- Notification Utilites
- Some base Color and Font resources for Jetpack Compose
- A default Main Activity with its MainHost and MainViewModel
- Some extra marker interfaces for Detekt setup
- Full initialized Android (instrumented) Base Test, with Hilt and Jetpack Compose
- Full initialized Unit Base Test, with Kotlin Coroutines
