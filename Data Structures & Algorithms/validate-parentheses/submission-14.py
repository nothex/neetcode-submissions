class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in s:
            if i == '(' or i == '[' or i == '{':
                stack.append(i)
            else:
                if len(stack)==0:
                     return False
                top=stack.pop()
                if top=='(' and i != ')':
                    return False
                if top=='[' and i != ']':
                    return False
                if top=='{' and i != '}':
                    return False
        return True if len(stack)==0 else False
