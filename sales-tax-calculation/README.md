### README ###

#### Role: Business Analyst (BA)

The company requires a system to calculate sales tax for purchased items based on their categories. Tax-exempt items include food, books, and medical products. A CSV file will serve as input for the system, containing item names, categories, prices, and tax rates.

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