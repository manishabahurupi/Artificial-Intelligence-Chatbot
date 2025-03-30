public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I am your chatbot. Type 'bye' to exit.");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();
            
            if (userInput.equals("bye")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            }
            
            System.out.println("ChatBot: " + getResponse(userInput));
        }
        
        scanner.close();
    }
    
    public static String getResponse(String input) {
        if (input.contains("hello")) {
            return "Hi there! How can I help you?";
        } else if (input.contains("how are you")) {
            return "I'm just a bot, but I'm doing great!";
        } else if (input.contains("name")) {
            return "I am a simple chatbot created in Java.";
        } else {
            return "I'm not sure how to respond to that.";
        }
    }
}
