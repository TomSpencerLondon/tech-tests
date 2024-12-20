### Tech Test: Currency Conversion

**Welcome to the Currency Conversion tech test.** This exercise is designed to evaluate your ability to debug, enhance, and maintain a Java application while accounting for common pitfalls in currency conversion systems.

---

#### **Scenario**
You are a developer tasked with building an application to convert between currencies using exchange rates. The application has an initial implementation but contains numerous bugs and incomplete features. Your goal is to fix these issues and ensure the application meets the requirements provided by the Business Analyst (BA).

---

#### **The Personas**

1. **Business Analyst (BA)**
    - Role: Provide high-level requirements.
    - Interactions:
        - You can ask the BA for clarifications, confirm assumptions, and resolve ambiguities.
        - The BA has limited technical knowledge but understands the business goals and user expectations.

2. **Developer (You)**
    - Role: Build, debug, and extend the application.
    - Responsibilities:
        - Collaborate with the BA to gather complete requirements.
        - Identify and resolve issues in the current implementation.
        - Design solutions for edge cases and ensure robust error handling.
        - Deliver a functional application while documenting the decisions made.

---

#### **Current State of the Application**

The application can:
1. Read currency amounts and source/target currencies from a CSV file.
2. Perform conversions based on exchange rates.
3. Output results to the console.

---

#### **CSV File Format (Example)**

```
id,amount,source_currency,target_currency,note
1,100,USD,EUR,Valid Entry
2,abc,USD,EUR,Non-numeric amount
3,-50,GBP,USD,Negative amount
4,0,JPY,USD,Zero amount
5,150.75,USD,INR,Valid Entry
6,,USD,EUR,Missing amount
7,10000000000,USD,EUR,Excessively large amount
8,10.123456789,EUR,USD,Excessive precision
9,75,GBP,USD,Valid Entry
```

---

#### **Known Bugs**

1. Hardcoded exchange rates cause outdated conversions.
2. Non-numeric values (e.g., "abc") crash the application.
3. Negative and zero amounts are not handled properly.
4. Floating-point precision issues result in incorrect rounding.
5. Missing or incomplete data in the CSV file is not validated.
6. Very large or very small numbers cause overflows or unexpected results.
7. The output format is inconsistent and difficult to read.

---

#### **Objectives**

1. **Clarify Requirements with the BA:**
    - What should happen with negative, zero, or missing amounts?
    - What level of rounding/precision is acceptable for conversions?
    - Should the application handle different currency formats (e.g., symbols vs codes)?
    - How to treat rows with invalid or incomplete data? Skip, error, or fallback?

2. **Debug and Fix the Application:**
    - Resolve existing bugs, especially for edge cases.
    - Implement robust error handling and input validation.
    - Ensure the output aligns with the clarified requirements.

3. **Enhance the Application:**
    - Refactor for clean, maintainable, and extensible code.
    - Optionally, prepare the application to integrate with live exchange rate APIs.
    - Ensure accurate floating-point arithmetic for financial calculations.

4. **Document the Application:**
    - Describe how it works and the decisions made.
    - Include clear instructions for running the application.

---

#### **Deliverables**

- **Java Application:**  
  A functional program with:
    - Correct conversions between currencies.
    - Robust handling of edge cases.
    - Clean and maintainable code.

- **Documentation:**
    - High-level description of the application and its functionality.
    - Clarifications made during development.
    - List of edge cases and how they were addressed.

- **Optional Enhancements:**
    - Test cases to validate functionality.
    - Integration with live exchange rate APIs.

---

#### **Evaluation Criteria**

- **Requirement Gathering:** Did you effectively clarify ambiguous requirements?
- **Bug Fixing:** Were all known bugs resolved?
- **Edge Case Handling:** How well were edge cases addressed?
- **Code Quality:** Is the code readable and maintainable?
- **Communication:** Are decisions clearly documented?

---

Good luck, and remember: **Requirements are vague on purpose. Your job is to ask the right questions.**

--- 

