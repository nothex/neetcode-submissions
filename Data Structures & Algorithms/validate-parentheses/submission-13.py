class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in s:
            if i is '(' or i is '[' or i is '{':
                stack.append(i)
            else:
                if len(stack)==0:
                     return False
                top=stack.pop()
                if top=='(' and i is not ')':
                    return False
                if top=='[' and i is not ']':
                    return False
                if top=='{' and i is not '}':
                    return False
        return True if len(stack)==0 else False
