class TrieNode:
    def __init__(self):
        self.children={}
        self.ends=False
class WordDictionary:

    def __init__(self):
        self.root=TrieNode()

    def addWord(self, word: str) -> None:
        node=self.root
        for c in word:
            if c not in node.children:
                node.children[c]=TrieNode()
            node=node.children[c]
        node.ends=True

    def search(self, word: str) -> bool:
        def dfs(j,node,word):
            for i in range(j,len(word)):
                c=word[i]
                if c=='.':
                    for child in node.children.values():
                        if dfs(i+1,child,word):
                            return True
                    return False
                else:
                    if c not in node.children:
                        return False
                node=node.children[c]
            return node.ends
        return dfs(0,self.root,word)
