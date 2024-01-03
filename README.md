# Simple Bank System
This is a simple Java console-based banking system.
# Functionality
. Create Account
Users should be able to create a bank account by giving an account name, a 4 digits number
passcode and its initial balance. There will be two categories of account: Standard Account
and VIP account. The interest rate of Standard Account and VIP Account are 0.005 and 0.01
for each month, respectively.

. Display
Users should be able to see the information of a particular account by giving its name.
You don't need passcode to display.

. Withdraw
Users should be able to withdraw money from a particular account by giving its name, the
passcode and the amount of money to withdraw.
Passcode is required to withdraw the money.

. Deposit
Users should be able to deposit money to a particular account by giving its name and the
amount of money.
You don't need passcode to deposit.

. Display All
Display all the previously created accounts.
You don't need passcode to display.

. Remove Account
Remove an account by the given name and the passcode.
Passcode is required to remove the account.

. Calculate Interest
Calcualte the expected interest (Not the total balance) of a particular account by giving its
name and the number of months.
The interest type is different depending on the account type
Standard Account: simple interest, calculated by balance * rate * number of
months
VIP Account: compound interest, calculated by balance * ((1 + rate) **
number of months - 1)
After calculating the expected interest, round off the resulting value to the nearest whole
number.

. Exit
Exit the loop and terminate your program with a proper appreciation message.
