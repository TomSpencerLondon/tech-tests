# Tech-Test Repository

This repository is designed to help you practice identifying and fixing common bugs across a variety of domains. It provides a set of projects, each focused on specific real-world scenarios, with examples of common issues that might arise. The goal is to develop a systematic approach to debugging and become more focused and thorough in tackling tech tests.

---

## Projects and Potential Bugs

### 1. **Miles to Kilometers Conversion**
- **Common Bugs:**
    - Using an incorrect conversion factor.
    - Mishandling negative or zero values.
    - Failing to handle decimal precision correctly.
    - [View the detailed `README.md` for Miles to Kilometers Conversion](miles-to-kilometers/README.md)


### 2. **Currency Conversion**
- **Common Bugs:**
    - Using a hardcoded or outdated exchange rate.
    - Not handling different currency formats correctly.
    - Precision issues with floating-point arithmetic.
  - [View the detailed `README.md` for Currency Conversion](sales-tax-calculation/README.md)

### 3. **Sales Tax Calculation**
- **Common Bugs:**
    - Incorrect tax rate applied.
    - Errors in calculating tax for exempt items.
    - Rounding errors in the final tax amount.

### 4. **Invoice Total Calculation**
- **Common Bugs:**
    - Errors in summing line items.
    - Incorrectly applying discounts.
    - Failing to handle empty or null values.

### 5. **Shipping Cost Calculator**
- **Common Bugs:**
    - Miscalculating costs based on incorrect weight or distance.
    - Failing to account for different shipping methods.
    - Handling edge cases like free shipping incorrectly.

### 6. **Loan Interest Calculation**
- **Common Bugs:**
    - Applying the wrong interest rate.
    - Miscalculating compounding periods.
    - Failing to handle edge cases like zero or negative principal.

### 7. **Inventory Management**
- **Common Bugs:**
    - Errors in updating stock counts.
    - Mishandling out-of-stock scenarios.
    - Incorrectly tracking item locations.

### 8. **Employee Payroll Calculation**
- **Common Bugs:**
    - Incorrect deductions or bonuses.
    - Errors in hourly rate or overtime calculations.
    - Failing to account for different tax brackets.

### 9. **E-commerce Discount Application**
- **Common Bugs:**
    - Applying incorrect discount rates.
    - Mishandling multiple discounts.
    - Errors in applying discounts to ineligible items.

### 10. **Booking System Availability Check**
- **Common Bugs:**
    - Double booking due to race conditions.
    - Incorrectly handling time zone differences.
    - Failing to release canceled bookings properly.

---

## Debugging Checklist

### 1. **Clarify Requirements**
- Ask the Business Analyst (BA) for the expected behavior.
- Confirm any assumptions and edge cases.

### 2. **Initial Code Review**
- Look for obvious errors or misalignments with the requirements.
- Check for common mistakes like typos, logic errors, or missing conditions.

### 3. **Reproduce the Issue**
- Identify and reproduce the bug consistently.
- Document the steps leading to the issue.

### 4. **Examine the Code**
- Inspect the relevant code sections for potential flaws.
- Check for off-by-one errors, incorrect conversions, or missed conditions.

### 5. **Test Fixes**
- Implement a fix and verify it solves the problem.
- Ensure no new issues are introduced.

### 6. **Create Tests**
- Write tests to cover the fixed issue and other edge cases.
- Confirm all tests pass successfully.

---

## How to Use This Repository
1. Clone this repository and pick a project from the list above.
2. Review the provided code and try to identify potential bugs.
3. Use the **Debugging Checklist** to systematically fix the issues.
4. Write unit tests to validate your fixes and handle edge cases.
5. Repeat the process with other projects to improve your debugging skills.

By practicing these scenarios, you'll gain confidence and proficiency in identifying and resolving bugs, preparing you for real-world tech tests.
