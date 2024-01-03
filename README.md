# Simple Bank System
This is a simple Java console-based banking system.
# Functionality
- **Create Account**\
  Users should be able to create a bank account by giving an account name, a 4 digits number
  passcode and its initial balance. There will be two categories of account: Standard Account
  and VIP account. The interest rate of Standard Account and VIP Account are 0.005 and 0.01
  for each month, respectively.
```
*** Menu ***
1. Create Account
2. Display
3. Withdraw
4. Deposit
5. Display All
6. Remove Account
7. Calculate Interest
8. Exit
Enter your choice: 1
**Create New Account**
1. Create Standard Account
2. Create VIP Account
Enter your choice: 1
Enter name: Mike
Enter passcode: 1234
Starting balance: 100
Account Created!!
```
- **Display**\
  Users should be able to see the information of a particular account by giving its name.
  You don't need passcode to display.
```
*** Menu ***
1. Create Account
2. Display
3. Withdraw
4. Deposit
5. Display All
6. Remove Account
7. Calculate Interest
8. Exit
Enter your choice: 2
Enter your name: Mike
**Account Details**
Name: Mike
Account Type: Standard
Balance: 100.0
```
- **Withdraw**\
  Users should be able to withdraw money from a particular account by giving its name, the
  passcode and the amount of money to withdraw.
  Passcode is required to withdraw the money.
```
*** Menu ***
1. Create Account
2. Display
3. Withdraw
4. Deposit
5. Display All
6. Remove Account
7. Calculate Interest
8. Exit
Enter your choice: 3
**Transaction - Withdraw**
Enter your name: Mike
Enter passcode: 1234
Enter amount to withdraw: 50
Name: Mike
Balance: 50.0
```
- **Deposit**\
  Users should be able to deposit money to a particular account by giving its name and the
  amount of money.
  You don't need passcode to deposit.
```
*** Menu ***
1. Create Account
2. Display
3. Withdraw
4. Deposit
5. Display All
6. Remove Account
7. Calculate Interest
8. Exit
Enter your choice: 4
**Transaction - Deposit**
Enter your name: Mike
Enter amount to deposit: 100
Name: Mike
Balance: 150.0
```
- **Display All**\
  Display all the previously created accounts.
  You don't need passcode to display.
```
*** Menu ***
1. Create Account
2. Display
3. Withdraw
4. Deposit
5. Display All
6. Remove Account
7. Calculate Interest
8. Exit
Enter your choice: 5
Standard Account Details
**Account Details**
Name: Mike
Account Type: Standard
Balance: 150.0
VIP Account Details
**Account Details**
Name: Andy
Account Type: VIP
Balance: 1000.0
```
- **Remove Account**\
  Remove an account by the given name and the passcode.
  Passcode is required to remove the account.
```
*** Menu ***
1. Create Account
2. Display
3. Withdraw
4. Deposit
5. Display All
6. Remove Account
7. Calculate Interest
8. Exit
Enter your choice: 6
**Transaction - Remove Account**
Enter your name: Andy
Enter passcode: 9999
Account has been removed!!
```
- **Calculate Interest**\
  Calcualte the expected interest (Not the total balance) of a particular account by giving its
  name and the number of months.
  The interest type is different depending on the account type
  Standard Account: simple interest, calculated by balance * rate * number of
  months
  VIP Account: compound interest, calculated by balance * ((1 + rate) **
  number of months - 1)
  After calculating the expected interest, round off the resulting value to the nearest whole
  number.
```
*** Menu ***
1. Create Account
2. Display
3. Withdraw
4. Deposit
5. Display All
6. Remove Account
7. Calculate Interest
8. Exit
Enter your choice: 7
**Transaction - Calculate Interest**
Enter your name: Mike
Enter the number of months: 10
The expected interest is: 8
```
- **Exit**\
  Exit the loop and terminate your program with a proper appreciation message.
```
*** Menu ***
1. Create Account
2. Display
3. Withdraw
4. Deposit
5. Display All
6. Remove Account
7. Calculate Interest
8. Exit
Enter your choice: 8
Thanks for banking with us!!
```
