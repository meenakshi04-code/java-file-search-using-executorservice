# 🔍 Multithreaded File Search in Java

A fast and efficient **file searching application** built using Java. This project demonstrates how to use **multithreading with ExecutorService** to search for files across directories.

---

## 📌 Features

* Search for a file by name
* Recursive directory traversal
* Case-insensitive file search
* Uses multithreading for better performance
* Simple and lightweight console application

---

## 🛠️ Technologies Used

* Java
* Multithreading (`ExecutorService`)
* File Handling (`java.io.File`)

---

## 📂 Project Structure

```id="structure"
FileSearchApp.java
```

---

## ▶️ How to Run

1. Open terminal / command prompt

2. Navigate to project folder

3. Compile the program:

```id="compile"
javac FileSearchApp.java
```

4. Run the program:

```id="run"
java FileSearchApp
```

---

## ⚙️ Configuration

Modify these values in the code:

```id="config"
String folderPath = "D:\\Meena"; // Change to your directory
String searchFile = "test.txt";  // File name to search
```

---

## 🧠 How It Works

* The program starts from a given directory
* It recursively scans all subdirectories
* A thread pool is created using available processors
* Each search task runs using `ExecutorService`
* When the file is found, its full path is printed

---

## 🖥️ Sample Output

```id="output"
Searching using 8 threads...

Found: D:\Meena\projects\test.txt
```

---

## ⚠️ Notes

* Ensure the directory path exists
* The search is **case-insensitive**
* Large directories may take time depending on system performance

---

## 🚀 Future Improvements

* True parallel recursion (submit subdirectories as separate tasks)
* Add GUI (JavaFX / Swing)
* Search using partial names or patterns
* Add file filters (size, type, date)
* Export search results to a file

---

## 👩‍💻 Author

**Meenakshi Srinivasan**
Aspiring Java Developer 💻

---

## 📄 License

This project is open-source and free to use.
