# Library Management System

## Overview
The **Library Management System** is a Java-based application that allows users to manage a collection of books. It enables users to view available books, borrow books, and return books. The system follows **Object-Oriented Programming (OOP)** principles, including **Encapsulation, Abstraction, and Polymorphism**.

## Features
- 📚 **View Available Books**
- 📖 **Borrow a Book**
- 🔄 **Return a Book**
- 🏛️ **Library Management** (Add books, track availability)

## Technologies Used
- **Java 8**
- **OOP Principles** (Encapsulation, Abstraction, etc.)
- **Collections Framework** (ArrayList)
- **Scanner (User Input)**

## Project Structure
```
LibraryManagementSystem/
│── src/
│   ├── models/
│   │   ├── Book.java
│   │   ├── User.java
│   │   ├── Library.java
│   ├── main/
│   │   ├── LibraryManagementSystem.java
│── README.md
│── pom.xml (if using Maven)
```

## Classes & Responsibilities
### 📌 `Book.java`
- Represents a book with **ID, title, author, and availability**.
- Provides methods to borrow and return books.

### 📌 `User.java`
- Represents a user who can **borrow and return books**.
- Stores a list of borrowed books.

### 📌 `Library.java`
- Manages a collection of books.
- Allows adding books and retrieving available books.

### 📌 `LibraryManagementSystem.java`
- **Main class** that provides a **menu-based console interface** for user interaction.
- Allows users to borrow and return books.

## How to Run 🚀
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/library-management-system.git
   ```
2. Navigate to the project folder:
   ```sh
   cd library-management-system
   ```
3. Compile the Java files:
   ```sh
   javac -d bin src/models/*.java src/main/*.java
   ```
4. Run the application:
   ```sh
   java -cp bin main.LibraryManagementSystem
   ```

## Future Enhancements
✅ Add **Admin functionalities** (Add/Remove books)
✅ Implement **User Authentication**
✅ Support **Digital Books (E-books)**
✅ Integrate **Database (JDBC, MySQL)**
✅ Develop a **GUI version using React**

## Contributions
Feel free to fork this repository and contribute! 🚀

## License
This project is licensed under the **MIT License**.

---