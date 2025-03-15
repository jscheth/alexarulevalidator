# Alexa Validation Rule (Java OOD)

This project is a sample implementation of an **Alexa Validation Rule System** designed for learning purposes using **Java** and **Object-Oriented Design (OOD)** principles. The project is currently **incomplete** and intended to help developers practice creating flexible and scalable validation systems.

## **Purpose**
The primary goal of this project is to provide hands-on practice in:
- Designing and implementing validation rules for Alexa requests.
- Applying OOD principles such as inheritance, polymorphism, and encapsulation.
- Building maintainable and reusable code structures.

## **Features (Planned and Implemented)**
✅ Basic validation rule structure.  
✅ Core rule types such as **LengthRule**, **RegexRule**, and **KeywordRule**.  
✅ Alexa request validation logic.  
🟡 Enhanced error handling for invalid requests (in progress).  
🟡 Improved logging and reporting mechanisms (in progress).  
❌ Integration with Alexa Skills Kit (planned).  
❌ Advanced rule combinations and conditions (planned).  

## **Project Structure**
```
/src
├── Rule.java
├── LengthRule.java
├── RegexRule.java
├── KeywordRule.java
│
├── AlexaValidator.java
├── AlexaService.java
├── AlexaRequest.java
│
└── Main.java
```

### **Key Classes**
- **Rule**: Base class for all validation rules.
- **LengthRule**: Ensures text input meets specified length requirements.
- **RegexRule**: Validates text input against a regular expression pattern.
- **KeywordRule**: Ensures text input includes or excludes certain keywords.
- **AlexaValidator**: Manages the execution of multiple rules for incoming requests.
- **AlexaService**: Core service logic for handling Alexa request flows.
- **AlexaRequest**: Represents incoming Alexa request data.

## **How to Run**
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/alexa-validation-rule.git
   ```
2. Navigate to the project directory:
   ```sh
   cd alexa-validation-rule
   ```
3. Compile the Java files:
   ```sh
   javac src/**/*.java
   ```
4. Run the main application:
   ```sh
   java src/Main
   ```

## **Future Improvements**
- Add complex rule chaining for advanced validation logic.
- Implement dynamic rule creation for user-defined rules.
- Introduce improved error reporting with descriptive messages.
- Provide better test coverage and sample request data.

## **Contributing**
This project is intended for learning purposes, but contributions are welcome! Feel free to:
- Fork the repository.
- Improve existing features or add new ones.
- Submit a pull request with clear descriptions.

## **License**
This project is licensed under the **MIT License** — feel free to use, modify, or distribute it for educational purposes.

---
For questions or suggestions, please reach out via [GitHub Issues](https://github.com/your-repo/alexa-validation-rule/issues).

Happy coding! 🚀

