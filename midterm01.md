

## Study Guide Solutions

- [one](https://cdn-uploads.piazza.com/paste/jkykqjht9g62hy/c13ef8bdbff55be8f02b51bc3f9afbc78c3517f8de25af69f4f32cfb9ce6d849/Section1-Solutions.pdf)
- [two](https://cdn-uploads.piazza.com/paste/jkykqjht9g62hy/163f86a7b861ce30b32fd8e06013d85ac93aed7c2450059d9d921a1177096841/Section2-Solutions.pdf)
- [three](https://cdn-uploads.piazza.com/paste/jkykqjht9g62hy/76243c686378dd5cb71b764ab6a38380cda40652491a29e4e6200ce9d0df0b58/Section3-Solutions.pdf)

## Syntax


```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

- Every line of code that runs in Java must be inside a class
- The name of the java file must match the class name
- The `main()` method is required
  - Any code inside the main() method will be executed.

## Read

### From Stdin

```java
import java.io.*;

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
         System.out.println("Enter a first number:");
         firstNum = Integer.parseInt(br.readLine());
         System.out.println("Enter a second number:");
         secondNum = Integer.parseInt(br.readLine());
         result = firstNum * secondNum;
         System.out.println("The Result is: " + result);
      } catch (IOException ioe) {
         System.out.println(ioe);
      }
```


```java
import java.util.*;

      int firstNum;
      Scanner scanner = new Scanner(System.in);
      System.out.println("prompt:");
      firstNum = Integer.parseInt(scanner.nextLine());
      System.out.println("Entersult is: " + result);
```



## From File


`Files.readAllLines -> List<String>`


```java
      // Reduce column to string and append to rotated puzzle (it's now a row).
      ret.add(
        columnChars.stream().map(String::valueOf).collect(Collectors.joining())
      );
    }
    return ret.toArray(new String[0]);
  }
```


```java
  public static String[] parseFile(String path, Integer minLength)
    throws java.io.IOException {
    return Files
      .readAllLines(Paths.get(path))
      .stream()
      .filter(word -> word.length() >= minLength)
      .map(word -> word.replace(" ", "").toLowerCase())
      .collect(Collectors.toList())
      .toArray(new String[0]);
  }
```


```java
import java.nio.*;
public class ReadingFromFile
{
  public static void main(String[] args) throws Exception
  {
      Files
        .readAllLines(Paths.get(args[0]))
        .forEach(line -> System.out.prinln(line));
  }
}
```


```java
import java.io.*;
import java.util.*;

public class ReadFromFileUsingScanner
{
  public static void main(String[] args) throws Exception
  {
    File file =
      new File("C:\\Users\\pankaj\\Desktop\\test.txt");
    Scanner sc = new Scanner(file);
  
    while (sc.hasNextLine())
  }
}
```

## Collections


![collections](./collections.jpg)

### Methods

```
contains
add
get
put
remove
size
clear
set
```

### Hasmap

```java
HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");

for (String i : capitalCities.keySet()) {
  System.out.println(i);
}

for (String i : capitalCities.values()) {
  System.out.println(i);
}
```

### LinkedList

```
addFirst
addLast
removeFirst
removeLast
getFirst
getLast
```


### Stack

```
empty
peek
pop
push
```

### Queue

```
isempty
peek
remove
add
```

A collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations. Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special value (either null or false, depending on the operation). The latter form of the insert operation is designed specifically for use with capacity-restricted Queue implementations; in most implementations, insert operations cannot fail.

<table class="table table-bordered">
<tbody><tr>
<td>&nbsp;</td>
<td>Collection Class name</td>
<td>Ordered</td>
<td>Sorted</td>
</tr>
<tr>
<td rowspan="4">Map</td>
<td>Hashtable</td>
<td>No</td>
<td>No</td>
</tr>
<tr> <td>HashMap</td>
<td>No</td>
<td>No</td>
</tr>
<tr>
<td>TreeMap</td>
<td>Sorted</td>
<td>By natural order or custom order</td>
</tr>
<tr>
<td>LinkedHashMap</td>
<td>By insertion order or last access order</td>
<td>No</td>
</tr>
<tr>
<td rowspan="3">Set</td>
<td>HashSet</td>
<td>No</td>
<td>No</td>
</tr>
<tr>
<td>TreeSet</td>
<td>Sorted</td>
<td>By natural order or custom order</td>
</tr>
<tr>
<td>LinkedHashSet</td>
<td>By insertion order</td>
<td>No</td>
</tr>
<tr>
<td rowspan="4">List</td>
<td>ArrayList</td>
<td>Indexed </td>
<td>No</td>
</tr>
<tr>
<td>Vector</td>
<td>Indexed </td>
<td>No</td>
</tr>
<tr>
<td>LinkedList</td>
<td>Indexed </td>
<td>No</td>
</tr>
<tr>
<td>Priority queue</td>
<td>Sorted</td>
<td>By to-do order</td>
</tr>
</tbody></table>


## Lambda

```java
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
```


## Recursion

[Recursion Problems](https://www.techiedelight.com/recursion-practice-problems-with-solutions/)

```java
   */
  public static int indexOf(String s1, String s2) {
    return s2.length() > s1.length()
      ? -1
      : s1.substring(0, s2.length()).equals(s2)
        ? 0
        : indexOf(s1.substring(1), s2) == -1
          ? -1
          : 1 + indexOf(s1.substring(1), s2);
  }
```


```java
  public static int removeEvenNumbers(Stack<Integer> stack, int k) {
    if (k == 0) {
      return 0;
    }

    if (stack.get(removeEvenNumbers(stack, k - 1)) % 2 == 0) {
      stack.remove(removeEvenNumbers(stack, k - 1));
    }
    return 1 + removeEvenNumbers(stack, k - 1);
  }
```

```cpp
unsigned rem(unsigned num, unsigned dig)
{
    if (num == 0)
        return num;

    unsigned digit = num % 10;

    unsigned temp = rem(num / 10, dig);

    if (digit != dig)
        temp = temp * 10 + digit;

    return temp;
}
```
