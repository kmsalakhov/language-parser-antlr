package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.KLangLexer;
import org.example.KLangParser;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class KLangTranslator {
    public static void main(String[] args) throws Exception {
        // Проверяем аргументы командной строки
        if (args.length != 2) {
            System.err.println("Usage: java KLangTranslator <input_file> <output_file>");
            System.exit(1);
        }

        // Создаем поток ввода для входного файла
        InputStream inputStream = Files.newInputStream(Paths.get(args[0]));

        // Создаем лексер для входного потока
        KLangLexer lexer = new KLangLexer(CharStreams.fromStream(inputStream));

        // Создаем поток токенов на основе лексера
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Создаем парсер на основе потока токенов
        KLangParser parser = new KLangParser(tokens);
//        parser.program();

        // Перенаправляем вывод парсера в файл
        FileOutputStream outputStream = new FileOutputStream(args[1]);
        System.setOut(new PrintStream(outputStream));

        // Запускаем парсер на стартовом правиле программы
        parser.program();

        // Закрываем файл после завершения трансляции
        outputStream.close();

        System.out.println("Translation completed successfully.");
    }
}
