## Overview
A simple Java application demonstrating Spring Framework's Aspect-Oriented Programming (AOP) capabilities. It provides a basic structure for managing parent-child relationships and showcases the use of AspectJ annotations for cross-cutting concerns.

## Project Structure
- **`sk.posam.fsa.aspect`**: Contains the AspectJ aspect class responsible for adding child objects to parent objects.
- **`sk.posam.fsa.bean`**: Defines the Java bean classes, including `Child` and `Parent`, along with custom annotations.
- **`sk.posam.fsa.configuration`**: Contains the Spring configuration class `MyConfiguration`, which defines beans and enables AspectJ auto-proxying.
- **`sk.posam.fsa.Main`**: Main class to bootstrap the Spring application context and demonstrate the functionality.

## Usage
1. **Building the Project**:
    - Ensure you have Java and Maven installed on your system.
    - Clone the repository to your local machine.
    - Navigate to the project directory and run `mvn clean install` to build the project.

2. **Running the Application**:
    - After building the project, run the `Main` class (`sk.posam.fsa.Main`) as a Java application.
    - The application will initialize the Spring context, create bean instances, and demonstrate the parent-child relationship functionality.

## Custom Annotations
- **`@ChildAdding`**: An annotation used to mark methods where child objects should be added to parent objects.

## AspectJ Aspect
- **`ChildAddingAspect`**: An AspectJ aspect responsible for intercepting methods annotated with `@ChildAdding` and adding child objects to parent objects.

## Bean Lifecycle Hooks
- **`@PostConstruct`**: Used to annotate a method to be called after the bean has been constructed.
- **`@PreDestroy`**: Used to annotate a method to be called before the bean is destroyed.

## Configuration
- **`MyConfiguration`**: Spring configuration class responsible for defining beans, enabling AspectJ auto-proxying, and configuring bean relationships.

## Dependencies
- **Spring Framework**: Core framework used for dependency injection and AOP.
- **AspectJ Weaver**: Dependency for AspectJ support in Spring AOP.

## Contributing
Contributions are welcome! Feel free to submit issues, feature requests, or pull requests.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
