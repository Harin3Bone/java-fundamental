# Java Useful class

## Map
   1. Definition
      - Map <K,V> map = new HashMap<>();
      - Map <K,V> lmap = new LinkedHashMap<>();
   2. Insert / Update
      - V put (K,V)
      - O(1)
   3. Delete
      - V remove(K)
      - O(1)
   4. Get
      - V get(K)
      - O(1)
   5. Size
      - int size()
      - O(1)
   7. Check for Empty
      - boolean isEmpty()
      - O(1)
   9. Value present
      - boolean containKey(K) 
      - O(1)
   11. Remove all map values
      - clear()
      - O(2n+1) -> O(n)

## ArrayList
   1. Definition
      - List arr = new ArrayList<>();
   2. Insert / Update
      - boolean add(T)
        > O(1)
      - boolean add(int index, T)
        > O(n)
   3. Delete
      - T remove(int index)
      - O(n)
   4. Get
      - T get(int index)
      - O(1)   
   5. Set / Update
      - T set(int index, T)
      - O(1)
   6. Size
      - int size()
      - O(1)
   7. Check for Empty
      - boolean isEmpty()
      - O(1)
   8. Value present
      - boolean contains(T)
      - O(n)
   9. Clear elements
      - void clear
        > O(n)
      - removeAll
        > O(n^2)
   10. Get Index of Value
       - indexOf(T)
       - O(n)
   11. Non-Primitive -> Primitive
       - toArray()
       - O(n)
   12. Sorting
      - Collections.sort(list,(a,b) -> a - b); // Ascending
        > O(nlogn)
      - Collections.sort(list,(a,b) -> b - a); // Decending
        > O(nlogn)

## Array
   1. Definition
      - T arr[] = new T[N]
      - N: static size
      - T: data type
   2. Insert / Update
      - arr[index] = V
      - O(1)
   3. Get
      - T arr[index]
      - O(1)
   4. Size
      - int arr.length
      - O(1)
   5. Fill array with value
      - Arrays.fill(arr,T)
      - O(n)
   6. Sorting
      - Primitive: Arrays.sort(arr)
      - Non-Primitive
        > Arrays.sort(arr) // Ascending
        
        > Arrays.sort(arr, (a,b) -> b - a) // Decending

## Stack
   1. Definition
      - Stack st = new Stack<>()
   2. Insert
      - T push(T)
      - O(1)
   3. Size
      - int size()
      - O(1)
   4. Look up for **HEAD** element
      - T peek()
      - O(1)
   5. Remove **HEAD** element
      - T pop()
      - O(1)
   6. Check for Empty
      - boolean isEmpty()
## Queue
   1. Definition
      - Queue queue = new LinkedList<>();
   2. Insert
      - boolean add(T)
      - O(1)
   3. Size
      - int size()
      - O(1)
   4. Look up for **HEAD** element
      - T peek()
      - O(1)
   5. Remove **HEAD** element
      - T poll()
      - O(1)
   6. Check for Empty
      - boolean isEmpty()
      - O(1)
## String / StringBuilder
   1. Definition 
      - String str = new String();
      - String str2 = "";
   2. size 
      - int length();
      - O(1)
   3. convert to char Array 
      - toCharArray(); 
      - TC: O(n)
   4. Value for specific index 
      - charAt(int index);
      - O(1)
   5. Substring from string 
      - substring(a,b) 
      - a: Inclusive
      - b: Exclusive
      - O(n)
   6. Transform to Lowercase 
      - toLowerCase(); 
      - O(n)
   7. Transform to UpperCase
      - toUpperCase(); 
      - O(n)
   8. Replace all characters in string 
      - replaceAll(from, to) 
      - O(n)
   9. Some useful Character properties
      - Character.isLetter();
      - Character.isAlphabetic();
      - Character.isUpperCase();
      - Character.isLowerCase();
      - Character.isDigit();
   10. StringBuilder
       - StringBuilder sb = new StringBuilder();
       - StringBuilder sb2 = new StringBuilder(int);
         > Definition
       - V append("string")
         > Adding string
       - toString()
         > Convert back to **String**
## HashSet 
   1. Definition
      - Set set = new HashSet<>();
   2. Insert / Update
      - boolean add(T)
      - O(1)
   3. Delete
      - boolean remove(T)
      - O(1)
   4. Get
      - boolean contains(T)
      - O(1)
   5. Size
      - int size();
      - O(1)
   6. Check for Empty
      - boolean isEmpty();
      - O(1)
   7. Remove all set values
      - void clear();   
      - O(n)

[Reference](https://leetcode.com/discuss/study-guide/1170715/Java-or-Data-Structure-Mostly-used-Syntax)