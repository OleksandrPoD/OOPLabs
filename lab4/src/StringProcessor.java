public class StringProcessor {
    private String inputText;
    private String processedText;
    private int maxLength;

    public StringProcessor(String inputText, int maxLength){
        this.inputText = inputText;
        this.maxLength = maxLength;
        this.processedText = processText();
    }
    private String processText(){
        StringBuilder result = new StringBuilder();
        String[] words = inputText.split("[^a-zA-Zа-яА-ЯіІїЇєЄ']+");

        StringBuilder currentLine = new StringBuilder();

        for (String word : words) {
            if (currentLine.length() + word.length() <= maxLength){
                if (currentLine.length() > 0 ){
                    currentLine.append(" ");
                }
                currentLine.append(word);
            } else {
                result.append(currentLine).append("\n");
                currentLine = new StringBuilder(word);
            }
        }
        result.append(currentLine);
        return result.toString();
    }
    public String getInputText(){
        return inputText;
    }

    public String getProcessedText() {
        return processedText;
    }
}
