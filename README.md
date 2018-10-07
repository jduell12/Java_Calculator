# Java_Calculator
Create a Calculator based on JFrame. You can keep the logic for the calculator as simple as possible. You only need to support 2 operands, 1 operator and you need to generate an answer when the "=" button is clicked. So your approach could be:
1. User enters in Operand1
2. When the user clicks on one of the
operators (+,-,*,/), your program captures the number in the TextField and stores it as operand1. Your program also stores the operator clicked. Then your program clears the TextField to allow the user to enter in the second operand.
3. User enters in Operand2
4. When the user clicks on the "=" button,
your program will compute the desired result from operand1, operand2 and the operator. The answer is then stored into the TextField.

Use a BorderLayout for the overall layout. In the NORTH, put a JTextField. In the CENTER, create a gridLayout for the buttons.

"Calculator" should show up on the Titlebar.

Make your JTextField read only (user can't enter numbers in directly). This avoids getting garbage in the field. The JTextField method to use for this is: setEditable(boolean b)

The font to use for all text should be SERIF, BOLD, 32 points. The colors used  are red, cyan, yellow and lightGray.

