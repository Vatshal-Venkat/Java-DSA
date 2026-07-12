import sys

def get_number(prompt):
    """Prompts the user for a number and validates the input."""
    while True:
        try:
            user_input = input(prompt).strip()
            # Handle empty input
            if not user_input:
                print("Input cannot be empty. Please enter a number.")
                continue
            return float(user_input)
        except ValueError:
            print("Invalid input. Please enter a valid number (e.g., 5 or 3.14).")
        except (KeyboardInterrupt, EOFError):
            print("\nExiting. Goodbye!")
            sys.exit(0)

def get_operation():
    """Prompts the user to choose an arithmetic operation."""
    operations = {
        '1': ('+', 'Addition'),
        '2': ('-', 'Subtraction'),
        '3': ('*', 'Multiplication'),
        '4': ('/', 'Division')
    }
    
    print("\nAvailable Operations:")
    for key, (symbol, name) in operations.items():
        print(f"  [{key}] {name} ({symbol})")
        
    while True:
        try:
            choice = input("Enter choice (1-4) or operation symbol (+, -, *, /): ").strip()
            # Check if choice is a valid key or symbol
            for key, (symbol, name) in operations.items():
                if choice == key or choice == symbol:
                    return symbol, name
            print("Invalid choice. Please enter a number 1-4 or one of the symbols: +, -, *, /")
        except (KeyboardInterrupt, EOFError):
            print("\nExiting. Goodbye!")
            sys.exit(0)

def main():
    print("=" * 45)
    print("      Welcome to the Simple CLI Calculator      ")
    print("=" * 45)
    
    while True:
        # Get first number
        num1 = get_number("Enter the first number: ")
        
        # Get second number
        num2 = get_number("Enter the second number: ")
        
        # Get operation
        symbol, name = get_operation()
        
        # Perform calculation
        result = None
        error_msg = None
        
        if symbol == '+':
            result = num1 + num2
        elif symbol == '-':
            result = num1 - num2
        elif symbol == '*':
            result = num1 * num2
        elif symbol == '/':
            if num2 == 0:
                error_msg = "Error: Division by zero is not allowed."
            else:
                result = num1 / num2
                
        # Display the result
        print("\n" + "-" * 40)
        if error_msg:
            print(error_msg)
        else:
            # Format the output nicely. If float is an integer, print it without decimals.
            formatted_num1 = int(num1) if num1.is_integer() else num1
            formatted_num2 = int(num2) if num2.is_integer() else num2
            formatted_result = int(result) if result.is_integer() else result
            print(f"Result of {name}:")
            print(f"  {formatted_num1} {symbol} {formatted_num2} = {formatted_result}")
        print("-" * 40 + "\n")
        
        # Ask to continue
        while True:
            try:
                again = input("Do you want to perform another calculation? (y/n): ").strip().lower()
                if again in ('y', 'yes'):
                    break
                elif again in ('n', 'no'):
                    print("\nThank you for using Simple Calculator. Goodbye!")
                    return
                else:
                    print("Please answer with 'y' or 'n'.")
            except (KeyboardInterrupt, EOFError):
                print("\nExiting. Goodbye!")
                return

if __name__ == "__main__":
    main()