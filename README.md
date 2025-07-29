# 🧮 Players Ranking

This application has two screens one that is the Home Activity that tracks all players details within a card layout that shows the information. 
The second screen has a built-in form where we have the ability to add a new user. After adding a new user the activity will be changed and the data updated and listed in the main activity.
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
│ │ │ └── manifest/
│ │ └── AndroidManifest.xml
│ │ ├── java/
│ │ │ └── pt/pedrorocha/android/android-ranking-players-list/
│ │ │ └── HomeActivity.class 
│ │ │ └── NewPlayerActivity.class
│ │ │ └── Player.class
│ │ │ └── PlayerAdapter.class
│ │ ├── res/
│ │ │ ├── layout/
│ │ │ │ └── activity_main.xml
│ │ │ │ └── activity_new_player.xml
│ │ │ │ └── player_ranking_card.xml
│ │ │ └── values/
│ │ │ │ └── strings.xml

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
<img width="203" height="425" alt="image" src="https://github.com/user-attachments/assets/2d9d8fe3-69cb-452a-ac8b-d1c5346661fa" />
<img width="203" height="425" alt="image" src="https://github.com/user-attachments/assets/214736a7-8826-4581-86f6-f6043b72efab" />


## 🔧 How to Run

1. Clone the repository:
   ```bash
   git clone git@github.com:PedroRocha84/android-ranking-player-list.git

2. Open the project in Android Studio
3. Launch an emulator or connect a device
4. Click Run (Shift + F10)
