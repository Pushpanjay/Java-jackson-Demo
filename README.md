# Java-jackson-Demo

# Java + Jackson BookLoan Demo

This project demonstrates how to serialize and deserialize JSON data using the Jackson library in Java. It uses a simple **Book Loan management system** as the use case.

---

## ✨ Features

- Deserialize JSON into a Java object using Jackson
- Serialize Java object to JSON string and file
- Use of `@JsonProperty` annotation for field mapping
- Includes `toString()` method for pretty object printing

---

## 📁 Files Included

- `BookLoan.java` – Java class with annotated fields
- `LibraryMain.java` – Main logic for serialization/deserialization
- `book_loan_output.json` – Output of the serialized Java object
- `README.md` – Project documentation (this file)

---

## 🛠 Requirements

- Java 8+
- Jackson JARs:
  - jackson-core
  - jackson-annotations
  - jackson-databind

Place the JARs in a `lib/` folder in your project.

---

## 🚀 How to Run

### 1. Compile the code
```bash
javac -cp "lib/*" src/*.java
