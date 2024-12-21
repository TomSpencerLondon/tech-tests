### README ###

#### Role: Business Analyst (BA)

The company requires a system to calculate sales tax for purchased items based on their categories. 
Tax-exempt items include food, books, and medical products. 
A CSV file will serve as input for the system, containing item names, categories, prices, and tax rates.

#### Business Requirements
1. **Calculate Tax:** The system should calculate sales tax for each item based on its category.
2. **Tax Exemptions:** Apply tax exemptions for specified categories (e.g., food, books, medical).
3. **Rounding:** Ensure the final sales tax amounts are rounded to the nearest 0.01.
4. **Output:** Generate a receipt with the item name, price, sales tax, and total cost.

---

### Example Input (CSV File: `input.csv`)
```
item_name,category,price,tax_rate
Chocolate Bar,Food,1.00,0.0
Music CD,Other,14.99,0.1
Book,Books,12.49,0.0
```

### Example Output
```
Chocolate Bar: $1.00 (Tax: $0.00)
Music CD: $16.49 (Tax: $1.50)
Book: $12.49 (Tax: $0.00)
Total Tax: $1.50
Total Price: $29.98
```

---


## Debugging Checklist

### 1. **Clarify Requirements**
- Ask the Business Analyst (BA) for the expected behavior.
- Confirm any assumptions and edge cases.
  - no price / tax = log error and continue
- Use inputs to add the tax
- BigDecimal rounding
  - Currency always dollars
- receipt format: each item is individual

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
