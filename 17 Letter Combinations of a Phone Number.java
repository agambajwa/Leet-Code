class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList();
        
        if(digits == null || digits.length() == 0)
            return answer;
        
        char[][] map = new char[8][];
        map[0] = "abc".toCharArray();
        map[1] = "def".toCharArray();
        map[2] = "ghi".toCharArray();
        map[3] = "jkl".toCharArray();
        map[4] = "mno".toCharArray();
        map[5] = "pqrs".toCharArray();
        map[6] = "tuv".toCharArray();
        map[7] = "wxyz".toCharArray();
        
        char[] input = digits.toCharArray();
        answer.add("");
        for(char element : input) 
            answer = process(answer, map[element - '2']);
        
        return answer;
    }
    
    private List<String> process(List<String> list, char[] array) {
        List<String> newList = new ArrayList<String>();
        
        for(String element : list)
            for(char character : array)
                newList.add(element + character);
        return newList;
    }
}