# Tech Test: Miles to Kilometers Conversion

Welcome to the **Miles to Kilometers Conversion** tech test. This exercise is designed to assess your ability to collaborate with a Business Analyst (BA), clarify requirements, and debug or enhance a partially implemented application.

---

## Scenario

You are a **developer** tasked with building an application for converting distances from miles to kilometers. The application has an initial implementation, but there are several issues, and the requirements provided by the BA are intentionally vague or incomplete. Your goal is to identify and resolve these issues while ensuring the application meets the business requirements.

---

## The Personas

### **Business Analyst (BA)**
You can interact with the BA (your instructor or peer) to:
- Ask clarifying questions.
- Confirm assumptions.
- Resolve ambiguities in requirements.

The BA has limited technical knowledge but understands the high-level business goals and user needs.

### **Developer (You)**
Your role as the developer is to:
- Collaborate with the BA to gather the missing details.
- Analyze the existing implementation for issues.
- Make decisions on edge cases, error handling, and user experience.
- Deliver a functional, robust, and well-tested application.

---

## The Application

### Current State
The application is an incomplete system designed to:
- Read distances in miles from a CSV file.
- Convert these distances to kilometers.
- Print the results to the console.

The current implementation contains several **bugs** and **edge case failures**, including:
- Incorrect conversion logic.
- Mishandling of invalid, negative, or missing data.
- Problems with precision and rounding.

### CSV File Format (as provided):
The input file is structured as follows:
```csv
id,miles,note
1,10,Valid Entry
2,abc,Non-numeric miles
3,-5,Negative miles
4,0,Zero miles
5,15.5,Valid Entry
6,,Missing value
7,10000000000,Excessively large number
8,8.123456789123456,Excessive precision
9,5,Valid Entry
```

### Known Issues
1. Fails on non-numeric or missing values.
2. Incorrect or incomplete handling of negative and zero values.
3. Poor precision and rounding in output.
4. Insufficient error messaging.
5. General lack of validation for edge cases.

---

## Your Objectives

### Clarify Requirements
1. What should the application do if a distance is negative, zero, or missing?
2. How should non-numeric values in the CSV file be handled?
3. What level of precision is required for the kilometers conversion?
4. What should happen if a value is excessively large or small?
5. Should invalid rows in the CSV file be skipped or trigger an error?

### Debug and Fix
1. Identify and resolve existing bugs in the code.
2. Implement error handling and validation for edge cases.
3. Ensure the output aligns with clarified requirements.

### Enhance
1. Add functionality or refactor the application as needed based on discussions with the BA.
2. Ensure the application is extensible and maintainable.

---

## Deliverables

1. A working Java application with:
    - Correct conversions from miles to kilometers.
    - Robust handling of edge cases and errors.
    - Clean, readable, and maintainable code.

2. Documentation:
    - Describe how the application works.
    - Outline the decisions made during development, especially around ambiguous requirements.

3. Optional: Write test cases to validate the application's functionality.

---

## Evaluation Criteria

- **Collaboration:** How effectively do you clarify requirements with the BA?
- **Problem Solving:** Can you identify and resolve issues in the existing code?
- **Code Quality:** Is your code clean, readable, and well-structured?
- **Edge Case Handling:** Have you accounted for all possible edge cases?
- **Communication:** Are your decisions well-documented and justified?

---

Good luck, and remember: **Requirements are vague on purpose. Your job is to ask the right questions.**

--- 

## Attempt

### 1. **Clarify Requirements**
- read distances and miles from CSV [done]
- convert distances to kilometers using a consistent conversion factor [done]
- non-numeric values should be logged and then continue to the next row [done]
- negative / zero should be logged and then continue to the next row [done]
- precision for the kilometers conversion?
  - two decimal places [done]
- log and continue if numbers are below 1 log and continue [done]
- 1 million is largest miles result [done]
- invalid rows should be skipped [done]

### 2. **Initial Code Review**
- Look for obvious errors or misalignments with the requirements. [done]
- Check for common mistakes like typos, logic errors, or missing conditions. [done]

### 3. **Reproduce the Issue**
- Identify and reproduce the bug consistently. [done]
- Document the steps leading to the issue. [get better]

### 4. **Examine the Code**
- Inspect the relevant code sections for potential flaws.
- Check for off-by-one errors, incorrect conversions, or missed conditions.

### 5. **Test Fixes**
- Implement a fix and verify it solves the problem. [done]
- Ensure no new issues are introduced.

### 6. **Create Tests**
- Write tests to cover the fixed issue and other edge cases.
- Confirm all tests pass successfully.
