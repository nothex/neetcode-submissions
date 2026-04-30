class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in s:
            if i=="(" or i=="{" or i=="[":
                stack.append(i)
            else:
                if len(stack)==0:
                    return False
                cur=stack.pop()
                if cur=="(" and i!=")" or cur=="[" and i!="]" or cur=="{" and i!="}":
                    return False
        return True if len(stack)==0 else False


        