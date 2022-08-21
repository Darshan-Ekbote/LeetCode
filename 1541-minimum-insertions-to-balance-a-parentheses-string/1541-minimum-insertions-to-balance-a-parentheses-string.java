class Solution {
    public int minInsertions(String s) {
	s = s.replace("))", "]");
	int leftCount = 0;
	int required = 0;

	for (char ch : s.toCharArray()) {
		if (ch == '(') {
			leftCount++;
		} else { // ch is either ']' or ')'
			if (leftCount > 0) {
				leftCount--;
				required += ch == ')' ? 1 : 0;
			} else { //if balanced and next char is ) or ] 
				required += ch == ']' ? 1 : 2;
			}
		}
	}

	return required + leftCount * 2;
}
}