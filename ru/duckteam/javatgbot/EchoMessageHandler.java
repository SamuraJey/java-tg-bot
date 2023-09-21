package ru.duckteam.javatgbot;

public class EchoMessageHandler implements MessageHandler {

    @Override
    public void handle(BotRequest request, AnswerWriter writer) {
        String message = request.getMessage(); // Получаем от объекта request, класса BotReqest запрос
        BotResponse response = new BotResponse(message); // Создаем объект класса BotResponse и отдаем ему сообщение
                                                         // полученое в запросе
        writer.writeAnswer(response); // Вызываем у объекта writer класса AnswerWriter метод ответсвенный за
                                      // вывод в консоль ответа
    }

}
