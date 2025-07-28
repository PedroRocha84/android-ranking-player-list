# 🧮 Players Ranking

This application has two screens one that is the Home Activity that tracks all players details within a card layout that shows the information. The second screen is a form where we can add each user into the app, once the user is added we return to the first screen.
An simple and funny way to consolidate the knowledge about managing activities and several views.   

## 🚀 Features

- Java-based structure
- Two simple activities with state persistence
- Designed a new layout for user detail card
- Data input and data transfer between activities
- Open a browser via an ImageView that links to my LinkedIn profile
- Handle intents in the AndroidManifest to support URL navigation
- Log app events using LogCat for debugging

## 🛠️ Built With

- **Android Studio**
- **Java**
- **XML Layouts**
- **State Persistence**

## 📁 Project Structure
```
app/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── pt/pedrorocha/android/android-ranking-players-list/
│ │ │ └── ... 
│ │ │ └── ...
│ │ ├── res/
│ │ │ ├── layout/
│ │ │ │ └── activity_main.xml
│ │ │ └── values/
│ │ │ └── strings.xml
│ │ └── AndroidManifest.xml
```

## 🧠 Learning Goals

- Navigation between two Activities
- Work with buttons, `TextView`, `EditText`, `ImageViews` and `onClickListeners`
- Using resources and string values manipulations
- Learn how to update UI elements programmatically
- State Preservation and the usage of onSaveInstanceState() to save important data before the activity is destroyed
- Use onCreate() or onRestoreInstanceState() for restoring saved UI state
- Toast feedback message to debug purposes and activity lifecycle tracking and learning.

## 📱 Screenshots


## 🔧 How to Run

1. Clone the repository:
   ```bash
   git clone git@github.com:PedroRocha84/android-java-profile.git

2. Open the project in Android Studio
3. Launch an emulator or connect a device
4. Click Run (Shift + F10)
