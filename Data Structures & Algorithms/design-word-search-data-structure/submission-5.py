class TrieNode():
    def __init__(self):
        self.children={}
        self.ends=False

class WordDictionary:

    def __init__(self):
        self.root=TrieNode()

    def addWord(self, word: str) -> None:
        node = self.root
        for c in word:
            if c not in node.children:
                node.children[c]=TrieNode()
            node=node.children[c]
        node.ends=True

    def search(self, word: str) -> bool:
        node=self.root
        def dfs(node,index):
            for i in range(index,len(word)):
                c=word[i]
                if c=='.':
                    for child in node.children.values():
                        if dfs(child,i+1):
                            return True
                    return False
                else:
                    if c not in node.children:
                        return False
                node=node.children[c]
            return node.ends 
        return dfs(node,0)
