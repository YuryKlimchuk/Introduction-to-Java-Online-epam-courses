package epam_java_online.chapter3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_3_1 {

	public static void main(String[] args) throws IOException {
        System.out.println(" ЧАСТЬ №3, ЗАДАНИЕ №3.1");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать приложение, разбирающиее текст (текст хранится в строке) и позволяющее выполнить с текстом три различных \n"
        		+ "операции: отсортировать абзацы по количеству предложений; в каждой предложении отсортировать слова по длине; отсортировать \n"
        		+ "лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства - по алфавиту.");
        System.out.println(" -----------------------------------------------");
        
        String text = Files.readString(Paths.get("src/epam_java_online/chapter3/text.txt"), StandardCharsets.UTF_8);
        
        System.out.println(text);
        
        // Регулярка для выделения абзаца
        Pattern paragraphPattern = Pattern.compile("(\\n|^).*?(?=\\n|$)", Pattern.MULTILINE);
        // Регулярка для выделения предложения
        Pattern sentencePattern = Pattern.compile("\\s+[^.!?]*[.!?]", Pattern.MULTILINE);
        // Регулярка для выделения слов
        Pattern wordPattern = Pattern.compile("[а-яА-Я]+", Pattern.MULTILINE);
       
        //Список для хранения абзацев, key-абзац-> предложени->слова, value - количество предложений
        Map<List<List<String>>, Integer> paragraphDictionary = new HashMap<>();
        
        Matcher matcherParagraph = paragraphPattern.matcher(text);
        
        while(matcherParagraph.find()) {
        	
        	// Список для хранения преложений
        	List<List<String>> sentences = new ArrayList<>();
        	Matcher matcherSentence = sentencePattern.matcher(matcherParagraph.group());
        	int sentenceCount = 0;
        	
        	while(matcherSentence.find()) {
        		
        		// Список для хранения слов
        		List<String> words = new ArrayList<>();
        		sentenceCount++;
        		Matcher matcherWord = wordPattern.matcher(matcherSentence.group());
        		
        		while(matcherWord.find()) {
        			words.add(matcherWord.group());
        		}
        		
        		sentences.add(words);
        	}
        		
        	paragraphDictionary.put(sentences, sentenceCount);
        }
        
        System.out.println("....................................................");
        
        for (Map.Entry<List<List<String>>, Integer> map: paragraphDictionary.entrySet()) {
        	List<List<String>> paragraph = map.getKey();
        	
        	// сортировка по количеству слов в предложении
        	paragraph.sort(new Comparator<List<String>>() {

				@Override
				public int compare(List<String> o1, List<String> o2) {
					return o1.size() - o2.size();
				}
			});
        	
        	
        	for (List<String> sentence : paragraph) {

        		// Сортируем ликсемы по вхождению symbol = 'o'
        		Collections.sort(sentence, new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						
						// Символ каторый будем искать в словах
						char symbol = 'о';
						
						int count1 = 0;
						for(int i = 0; i < o1.length(); i++) {
							if(o1.charAt(i) == symbol) count1++; 
						}
						
						int count2 = 0;
						for(int i = 0; i < o2.length(); i++) {
							if(o2.charAt(i) == symbol) count2++; 
						}
						
						if(count1 != count2) {
							return count1 - count2;
						} else {
							for (int i = 0; i < ((o1.length() > o2.length()) ? o2.length() : o1.length()); i++) {
								if(o1.charAt(i) != o2.charAt(i)) {
									return o1.charAt(i) - o2.charAt(i);
								}
							}
							return 0;
						}

					}
				});
        		
			}
		}
        
        // Выводим результат (+абзацы по возрастанию)
        paragraphDictionary.entrySet()
        	.stream()
        	.sorted(Map.Entry.comparingByValue())
        	.forEach(e -> System.out.println("------------ \n Количество предложений в абзаце: " + e.getValue() + "\n " + e.getKey()));
        


       
	}
}
