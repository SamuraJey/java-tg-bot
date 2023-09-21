package ru.duckteam.javatgbot;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {

    @Override
    public BotRequest getUserInput() {
        Scanner scanner = new Scanner(System.in); // Создаем сканер для чтения из консоли
        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine(); // Читаем строку введенную пользователем
        return new BotRequest(message);
    }
}
