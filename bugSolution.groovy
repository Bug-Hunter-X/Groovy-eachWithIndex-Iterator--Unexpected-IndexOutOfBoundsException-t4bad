```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    if (index < list.size()) { //Corrected Condition
      println "Element at index $index: $element"
    } else {
      println "Index out of bounds: $index"
    }
  }
}

List<String> myList = ['a', 'b', 'c']
myMethod(myList)
```