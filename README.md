 SwapZone  
An application for sharing & donating unused items
Connecting communities – Saving resources – Spreading kindness
1. Introduction
  1.1 Project Description
SwapZone is an Android application that allows users to donate or share unused items with individuals or organizations in need. The project aims to reduce waste, protect the environment, and support communities through charitable actions.
  1.2 Key Features
- Post donation requests and calls for needed items  
- Register to **donate** in response to existing posts  
- Chat directly with charity organizations or recipients  
- Track the status of donation orders  
- Receive real-time notifications via Firebase Messaging  
2. Installation Guide
  2.1 System Requirements
- Android Studio (Arctic Fox or later)  
- Android SDK (API level 21+)  
- Firebase account (Firestore, Authentication, Cloud Messaging, Storage)  
- Android Emulator or real device  
  2.2 Installation
Clone project from GitHub
git clone https://github.com/phtharo/SwapZone.git
- Open Android Studio → choose Open an existing project
- Navigate to the SwapZone project folder
- Connect Firebase via Tools > Firebase, or add your google-services.json to /app
- Sync Gradle and build the project
2.3 Running the Project
Connect a real device via USB (enable USB Debugging), or run using an Emulator
Click Run ▶ in Android Studio
3. Usage & Examples
  3.1 Posting a Donation Request:
- Users can create posts with a title, description, item images, and contact info.
- Posts will appear publicly on the home feed for the community to view and respond.
  3.2 Register to Donate:
- Users can browse existing requests from individuals or organizations and select "Register to donate".
- They can add notes, select available items, or chat before confirming the donation.
- Once confirmed, a donation order is created and its status is tracked.
  3.3 Chat:
- Users and organizations can communicate directly via the integrated chat system (using Firestore or Realtime Database).
- Supports item verification, logistics discussion, and status updates.
  3.4 Track Donation Status:
- Each donation goes through several stages: Pending Confirmation → In Transit → Completed.
- Both donors and recipients can track the process within the app.
4. Dependencies
4.1 Frontend (Android App)
gradle
// Firebase
implementation 'com.google.firebase:firebase-auth'
implementation 'com.google.firebase:firebase-firestore'
implementation 'com.google.firebase:firebase-storage'
implementation 'com.google.firebase:firebase-messaging'
// UI & Utils
implementation 'androidx.recyclerview:recyclerview:1.3.1'
implementation 'com.github.bumptech.glide:glide:4.14.2'
implementation 'androidx.cardview:cardview:1.0.0'
4.2 Backend (Firebase Services)
Firebase Authentication (Email/Password)
Firebase Firestore (for storing posts, user info, and order statuses)
Firebase Cloud Messaging (for push notifications)
Firebase Realtime Database (optional, for real-time chat)
5. Support
- Email: support@swapzone.org
- GitHub: https://github.com/phtharo/SwapZone
6. References
- Firebase for Android
- Glide Image Loader
- Android Jetpack Guide
7. Changelog
v1.0.0 (Initial Release)
Interface for posting and registering donation offers
Chat functionality between users and charity organizations
Donation order status tracking
Integrated with Firebase Auth, Firestore, Storage, and Messaging
8. Known Issues
- Chat messages may occasionally not sync in real time
- No advanced user verification yet (e.g., OTP or Email verification)
- Performance may lag on older or low-end Android devices
9. Badges
