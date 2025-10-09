[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

# Assignment 2: Architectural MVC Patterns and Frameworks
| Group Member Name | Student ID | Responsibility | Email ID |
|-------------------|------------|----------------|----------|
| Khushi Patel         | 100940709     | ReadME formatting, Q2, Code | khushi.patel9@ontariotechu.net |
| Prabhnoor Saini         | 100946515    | ReadME formatting, Q1, Code | prabhnoor.saini@ontariotechu.net |
| Hadia Ali         | 100876605   | Class Diagram, Sequence Diagram | hadia.ali@ontariotechu.net |

## 📌 Question 1: Swing Framework

**Q: What is the purpose of the Swing framework?** 

The Swing framework is a Java Graphical User Interface (GUI) toolkit which provides a wide range of user interface components for building graphical desktop applications. It is part of Java Foundation Classes (JFC) and is built on top of the Abstract Window Toolkit (AWT). It provides more flexible, lightweight and platform independent components than AWT. Swing also supports a pluggable look and feel feature, that allows the appearance of an interface to be changed at runtime without code modification.

Swing provides commonly used components such as JButton, JLabel, and JTextField for building interactive and user-friendly interfaces.

By implementing the Model-View-Controller (MVC) pattern across its components, Swing ensures a clear separation between data, user interface and control logic, resulting in interfaces that are easier to maintain, extend and customize.

**Class Diagram of Swing Components:**

<p align="center">
  <img src="Images/Class Diagram.png" alt="Class Diagram" width="600"/>
</p>

## 📌 Question 2: MVC Example from GitHub Repository

**Q: How does the provided GitHub example implement the MVC pattern, and how does it differ from the conventional MVC pattern?**  

The example provided in the src files follows the **MVC pattern** by separating responsibilities into three main parts:  

### **Model (Model.java)**  
- Represents the **data part** of the pattern.  
- Stores two attributes: `firstname` and `lastname`.  
- Provides **getters and setters** to read or update these attributes.  
- Acts as a **data container**, without any complex business logic.  
### **View (View.java)**  
 - Defines the **graphical user interface (GUI)** using the **Swing framework**.  
 - Creates a `JFrame` and arranges components like `JLabel`, `JTextField`, and `JButton`.  
 - Provides **getter methods** for these components so the controller can attach listeners or retrieve inputs.  
 - Doesn't handle any data logic as it only presents input fields and buttons. 
### **Controller (Controller.java)**  
- Acts as the **link** between the model and the view.  
- Listens for **user interactions** (pressing "Save firstname", "Save lastname", or "Hello").  
- Updates the model (`model.setFirstname(...)`) or retrieves data to display messages.  
- Also uses `JOptionPane` to give feedback to the user.    

This demonstrates the **core MVC idea**: the model holds data, the view displays it, and the controller handles interactions.  

However, it is a little different from the **conventional MVC pattern that was taught in lectures**:  
- **Event Handling:** The controller directly attaches Swing listeners to the view, whereas in pure MVC the controller manages all input separately.  
- **Model:** It is just a simple data container without business logic.  
- **Controller Coupling:** Uses `JOptionPane` (GUI code), which would normally belong in the view.  
- **Observer Pattern:** Not used. In lectures, the model notifies views automatically, but here the controller updates the view directly.  
- **Coupling:** This design is more tightly coupled, making it less flexible than the observer-based MVC taught in class.   

The code follows MVC principles but adapts them for **practical Swing applications** by allowing the controller to handle events directly and the view to show dialogs. This makes the implementation simpler but less strictly separated than a textbook MVC example that we were taught in our lectures.   


## Sequence Diagram 📝
