[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

# Assignment 2: Architectural MVC Patterns and Frameworks
| Group Member Name | Student ID | Responsibility | Email ID |
|-------------------|------------|----------------|----------|
| Khushi Patel         | 100940709     | ReadME formatting, Q2, Code | khushi.patel9@ontariotechu.net |
| Prabhnoor Saini         | 100946515    | Q1, Code | prabhnoor.saini@ontariotechu.net |
| Hadia Ali         |    | Sequence Diagram | hadia.ali@ontariotechu.net |

## 📌 Question 1: Swing Framework

**Q: What is the purpose of the Swing framework?** 
 

**Class Diagram of Swing Components (Draft):**

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
1. In a pure MVC example, the controller usually manages events, while in here the controller directly attaches Swing listeners to view components.  
2. The model is very simple and only stores data, without any additional business logic.  
3. The controller uses `JOptionPane` (which is a GUI element) to show messages, which normally would belong to the view component.  

The code follows MVC principles but adapts them for **practical Swing applications** by allowing the controller to handle events directly and the view to show dialogs. This makes the implementation simpler but less strictly separated than a textbook MVC example that we were taught in our lectures.   


