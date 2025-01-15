Name: Ali-Sajad Sultani
ID: 100913373
Description of Files:
1. Customer:
   - Represents a customer in the receipt system.
   - Manages a list of receipts associated with the customer.
2. Item:
   - Represents an item on a receipt.
   - Stores details such as name, price, quantity, and type (category).
3. Payment:
   - Abstract class representing payment methods (Cash or Card).
   - Subclasses include CashPayment and CardPayment to utilize polymorphism.
4. Receipt:
   - Represents a receipt with associated customer, store, items, and payment.
   - Handles total calculation and tax application.
5. Store:
   - Represents a store in the system.
   - Manages a list of receipts associated with the store.
6. ReceiptSystem:
   - The main program for interacting with users.
   - Allows adding, viewing, and generating reports for receipts.