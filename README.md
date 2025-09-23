# Student Management System (Java CLI)

A simple **Command-Line Interface (CLI)** program in Java to manage student records.  
This program allows you to **Add, View, Update, and Delete** student information using an interactive menu.

## Features
- Add a new student (ID, Name, Marks)
- View all students
- Update existing student records
- Delete student records
- Menu-driven interface for easy operation
- CLI-based for simple and fast usage

## How to Run

1. Clone this repository:

```bash
git clone https://github.com/SudhanshuD13/Student-Management-Java.git
```

2. Navigate to the project directory:
```bash
cd Student-Management-Java
```

3. Compile the Java file:
```bash
javac StudentManagement.java
```

4. Run the program:
```bash
java StudentManagement
```

Sample Output
--- Student Management System ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
```
Enter your choice: 1
Enter ID: 101
Enter name: Sudhanshu
Enter marks: 89.5
Student added successfully!

--- Student Records ---
ID: 101 | Name: Sudhanshu | Marks: 89.5
```

## Author
**Sudhanshu Dubey**

## Notes

*Ensure you have Java installed (JDK 8 or higher).
Unique student IDs are required.
Invalid operations (like updating/deleting a non-existent student) are handled gracefully.*