
---

## How the Calculator Works

The calculator processes tokens from left to right:

1. **If the token is a number**  
 → Push it onto the stack.

2. **If the token is an operator**  
 → Pop two numbers from the stack.  
 → Apply the operator.  
 → Push the result back onto the stack.

3. **Error conditions**
 - If an operator is encountered and fewer than two numbers are on the stack → **Bad expression**
 - If the end of the expression is reached and there is **not exactly one number** on the stack → **Bad expression**

---

## Implementation Requirements (30 points total)

### Core Requirements

- **10 points** – Program runs without crashing and correctly processes input → output  
- **10 points** – Implement `LinkedListBasedStack`  
- **10 points** – Implement `ArrayListStack`  

---

## Constraints

- The calculator **only needs to support**:
- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- The calculator **only needs to work with integers**

---

## Bonus Points

- **+2 points** – Support `double` values (easy win)
- **+2 points** – Implement division (`/`)  
> Deceptively hard — **do this last**

---

## Notes

- Input is assumed to be space-separated tokens
- Stack behavior must be strictly enforced
- Robust error handling is expected for malformed expressions
