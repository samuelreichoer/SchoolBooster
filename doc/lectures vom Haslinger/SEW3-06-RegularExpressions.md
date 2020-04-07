# Regular Expressions in Java

## What are RegEx?

> A *regular expression* defines a search pattern for strings. The abbreviation for regular expression is *regex*. The search pattern can be anything from a simple character, a fixed string or a complex expression containing special characters describing the pattern. The pattern defined by the regex may match one or several times or not at all for a given string.[^1]

[^1]: https://www.vogella.com/tutorials/JavaRegularExpressions/article.html

**The following tables and explanations are just an overview of the most important RegEx elements, this is definitely not a full explanation of all possible combinations.**

### Common matching symbols

| Regular Expression | Description                                                  |
| :----------------- | :----------------------------------------------------------- |
| `.`                | Matches **any** character                                    |
| `^regex`           | Finds regex that must match at the **beginning** of the line. |
| `regex$`           | Finds regex that must match at the **end** of the line.      |
| `[abc]`            | **Set** definition, can match the letter a or b or c.        |
| `[^abc]`           | When a caret appears as the first character inside square brackets, it **negates** the pattern. This pattern matches any character except a or b or c. |
| `[a-d1-7]`         | **Ranges**: matches a letter between a and d and figures from 1 to 7, but not d1. |
| `X|Z`              | Finds X **or** Z.                                            |

### Meta characters

The following meta characters have a pre-defined meaning and make certain common patterns easier to use.

| Regular Expression | Description                                             |
| :----------------- | :------------------------------------------------------ |
| `\d`               | Any **digit**, short for `[0-9]`                        |
| `\D`               | A **non-digit**, short for `[^0-9]`                     |
| `\s`               | A **whitespace** character, short for `[ \t\n\x0b\r\f]` |
| `\S`               | A **non-whitespace** character, short for               |
| `\w`               | A **word** character, short for `[a-zA-Z_0-9]`          |
| `\W`               | A **non-word** character `[^\w]`                        |

These meta characters have the same first letter as their representation, e.g., digit, space, word, and boundary. **Uppercase symbols define the opposite**.

### Quantifier

A quantifier defines **how often an element can occur**.

| Regular Expression | Description                                                  | Examples                                                     |
| :----------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| `*`                | Occurs zero or more times, is short for `{0,}`               | `X*` finds no or several letter X, <sbr /> `.*` finds any character sequence |
| `+`                | Occurs one or more times, is short for `{1,}`                | `X+`- Finds one or several letter X                          |
| `?`                | Occurs no or one times, `?` is short for `{0,1}`.            | `X?` finds no or exactly one letter X                        |
| `{X}`              | Occurs X number of times, `{}` describes the order of the preceding liberal | `\d{3}` searches for three digits, `.{10}` for any character sequence of length 10. |
| `{X,Y}`            | Occurs between X and Y times,                                | `\d{1,4}` means `\d` must occur at least once and at a maximum of four. |

### Backslashes in Java

The backslash `\` is an escape character in Java Strings. That means backslash has a predefined meaning in Java. You have to use double backslash `\\` to define a single backslash. If you want to define `\w`, then you must be using `\\w` in your regex. If you want to use backslash as a literal, you have to type `\\\\` as `\` is also an escape character in regular expressions.

### Grouping and back reference

You can group parts of your regular expression. In your pattern you group elements with round brackets, e.g., `()`. This allows you to assign a repetition operator to a complete group.

## Using regular expressions with String methods

### String Methods for processing regular expressions

`Strings` in Java have built-in support for regular expressions. `Strings` have four built-in methods for regular expressions, i.e., the `matches()`, `split())`, `replaceFirst()` and `replaceAll()` methods. The `replace()` method does NOT support regular expressions.

These methods are not optimized for performance. We will later use classes which are optimized for performance.

| Method                                   | Description                                                  |
| :--------------------------------------- | :----------------------------------------------------------- |
| `s.matches("regex")`                     | Evaluates if `"regex"` matches `s`. Returns only `true` if the WHOLE string can be matched. |
| `s.split("regex")`                       | Creates an array with substrings of `s` divided at occurrence of `"regex"`. `"regex"` is not included in the result. |
| `s.replaceFirst("regex", "replacement")` | Replaces first occurance of `"regex"` with `"replacement`.   |
| `s.replaceAll("regex", "replacement")`   | Replaces all occurances of `"regex"` with `"replacement`.    |

### Examples

```Java
public class StringMatcher {
    
    // returns true if the string matches exactly "true" or "True"
    public boolean isTrueVersion2(String s){
        return s.matches("[tT]rue");
    }

    // returns true if the string matches exactly "true" or "True" or "yes" or "Yes"
    public boolean isTrueOrYes(String s){
        return s.matches("[tT]rue|[yY]es");
    }

    // returns true if the string contains exactly "true"
    public boolean containsTrue(String s){
        return s.matches(".*true.*");
    }

    // returns true if the string contains of three letters
    public boolean isThreeLetters(String s){
        return s.matches("[a-zA-Z]{3}");
        // simpler form for return s.matches("[a-Z][a-Z][a-Z]");
    }

    // returns true if the string does not have a number at the beginning
    public boolean isNoNumberAtBeginning(String s){
        return s.matches("^[^\\d].*");
    }
    // returns true if the string contains a arbitrary number of characters except b
    public boolean isIntersection(String s){
        return s.matches("([\\w&&[^b]])*");
    }
    // returns true if the string contains a number less than 300
    public boolean isLessThenThreeHundred(String s){
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }
}
```

## Pattern and Matcher [Bonus]

For advanced regular expressions the `java.util.regex.Pattern` and `java.util.regex.Matcher` classes are used. Better Performance!

You first create a `Pattern` object which defines the regular expression. This `Pattern` object allows you to create a `Matcher` object for a given string. This `Matcher` object then allows you to do regex operations on a `String`.

```Java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestPatternMatcher {
    
    public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+");
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);
        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
        // now create a new pattern and matcher to replace whitespace with tabs
        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
        System.out.println(matcher2.replaceAll("\t"));
    }
}
```

## Exercises

Some Tasks to solve:

1. Write a regular expression which matches a text line if this text line contains either the word "Joe" or the word "Jim" or both. (`StringMatcher` method: `containsJimOrJoe()`)
2. Write a regular expression which matches any phone number. A phone number in this example consists either out of 7 numbers in a row or out of 3 number, a (white)space or a dash(-) and then 4 numbers.  (`StringMatcher` method: `isPhoneNumber()`)
3. Write a RegEx, that checks if the string is a valid date of the form `dd/mm/yy` or  `dd/mm/yyyy`.  (`StringMatcher` method: `isValidDate()`)
4. [Bonus Exercise] Check if a text contains numbers with exactly 3 digits. List all occurrences (index) and the number of occurrences. [*Recommendation: `Pattern` and `Matcher` Class*]