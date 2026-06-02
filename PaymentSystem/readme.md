Abstract Class Kyu Nahi?

Good Question.

Abstract Class:

abstract class Payment

Interface:

interface Payment
Interface

Pure contract.

void pay();

Bas rule.

Abstract Class

Rule + common code.

Example:

abstract class Payment {

    protected String merchantName;

    public void printReceipt() {

        System.out.println("Receipt");
    }

    public abstract void pay();
}

Yaha:

printReceipt()

common hai.

Sab payment methods use karenge.

Toh Interface Ya Abstract?

Use this rule:

Interface

Jab sirf contract chahiye.

Example:

Payment
Notification
Authentication
Abstract Class

Jab common data aur common methods bhi hain.

Example:

Employee
Vehicle
Animal
Interview Answer
When will you choose Interface?

When multiple classes share the same behavior but different implementations.

When will you choose Abstract Class?

When classes share common state and common behavior along with some abstract methods.

Important Rules of Interface
Can have variables?
int x = 10;

Allowed.

Automatically:

public static final

ban jata hai.

Constant.

Constructor?

❌ No

Object Create?

❌

Payment p =
        new Payment();

not allowed.

Multiple Inheritance?
class A implements X,Y,Z

✅ Allowed

Ye interface ka sabse bada benefit hai.

Interview Trap Question
Why interface instead of inheritance?

Inheritance:

IS-A relationship

Example:

Developer IS-A Employee

Interface:

CAN-DO relationship

Example:

UPI CAN pay
Card CAN pay
Most Important Takeaway

Jab bhi interviewer bole:

Design a system

Pehle socho:

Common behavior kya hai?

Payment?

pay()

Notification?

send()

Vehicle?

move()

Fir interface banao.

Ye industry-level OOP thinking hai.