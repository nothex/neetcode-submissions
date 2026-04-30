class PrefixTree:

    def __init__(self):
        self.children=[None]*26
        self.isEnd=False

    def insert(self, word: str) -> None:
        node = self
        for i in word:
            if node.children[ord(i)-ord('a')]==None:
                node.children[ord(i)-ord('a')]=PrefixTree()
            node=node.children[ord(i)-ord('a')]
        node.isEnd=True

    def search(self, word: str) -> bool:
        node = self
        for i in word:
            if node.children[ord(i)-ord('a')]==None:
                return False
            node=node.children[ord(i)-ord('a')]
        return node.isEnd

    def startsWith(self, prefix: str) -> bool:
        node = self
        for i in prefix:
            if node.children[ord(i)-ord('a')]==None:
                return False
            node=node.children[ord(i)-ord('a')]
        return True
        