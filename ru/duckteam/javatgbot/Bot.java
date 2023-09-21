package ru.duckteam.javatgbot;

public class Bot {
    public static void main(String[] args) {
        ConsoleInputReader reader = new ConsoleInputReader();
        ConsoleAnswerWriter writer = new ConsoleAnswerWriter();
        EchoMessageHandler handler = new EchoMessageHandler();

        //todo implement
        while(true){
            BotRequest request = reader.getUserInput();
            handler.handle(request,writer);
        }
    }
}
