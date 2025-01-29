# 📌 Explication de la ProgressBar dans l'application

## 📜 Description  
Ce tp affiche une liste de capteurs avec une image, un nom, une valeur et une barre de progression (`ProgressBar`). La `ProgressBar` montre visuellement la valeur du capteur sous forme de pourcentage.

---

## 🔧 Comment ça fonctionne ?  
### 1. **Affichage des capteurs**  
- Chaque capteur a une image, un texte et une `ProgressBar`.  
- Les données viennent d'une liste (`List<SensorData>`).  

### 2. **Mise à jour de la `ProgressBar`**  
- La valeur du capteur est convertie en pourcentage entre `0` et `100`.  
- On utilise :  
  ```java
  int progressValue = (int) Math.round(Math.max(0, Math.min(100, item.getValue())));
  holder.progressBar.setProgress(progressValue);
  ```  
- Cette ligne s'assure que la valeur ne dépasse pas `100` et n'est pas négative.  

### 3. **Affichage dans la liste**  
- Le fichier `sensor.xml` définit le design de chaque élément (image, texte, progress bar).  
- La classe `SensorAdapter` gère l'affichage et la mise à jour des valeurs.  

---

## 🛠️ Personnalisation  
Si tu veux changer l'apparence de la `ProgressBar`, tu peux :  
1. Modifier sa couleur dans `res/drawable/progress_bar.xml`.  
2. Changer son style dans le fichier `sensor.xml`.  
3. Modifier la logique dans `SensorAdapter.java` pour afficher des valeurs différentes.  

---

## 🚀 Résultat attendu  
- Si un capteur a une valeur de `60.7`, la `ProgressBar` affichera `61%`.  
- Si la valeur est `120`, elle sera ajustée à `100`.  
- Si la valeur est `-10`, elle sera ajustée à `0`.  

---

✅ **La `ProgressBar` permet donc de voir facilement l’état des capteurs avec une visualisation rapide !** 😊
