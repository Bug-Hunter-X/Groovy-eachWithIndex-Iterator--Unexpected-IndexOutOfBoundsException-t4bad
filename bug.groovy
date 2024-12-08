```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    if (index > list.size()) { //Error: IndexOutOfBoundsException
      println "Index out of bounds: $index"
    }
    println "Element at index $index: $element"
  }
}

List<String> myList = ['a', 'b', 'c']
myMethod(myList)
```