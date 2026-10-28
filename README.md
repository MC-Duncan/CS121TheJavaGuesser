# CS121TheJavaGuesser

## Guesser Class

## Main
```
public static void main(String[] args):
  new Guesser()
```

## Constructor
```
public Guesser():
  create scanner class [Scanner input = new Scanner(System.in);]
  create boolean keepGoing set to true
  while keepGoing is true:
    string response = menu()
      
      if response is 0:
        set keepGoing to false
      else if response is 1:
        humanGuesser()
      else if response is 2:
        computerGuesser()
      else:
        print "Please input a valid value."
```

## Menu
```
public String menu():
  print "0: Exit"
  print "1: Human Guesser"
  print "2: Computer Guesser"
  print empty line
  print "Please enter 0-2: "

  create a string called response and take an input
  return response
```

## Human Guesser
```
public void humanGuesser();
  print "Human Guesser"
  

```

## Computer Guesser
```

```
