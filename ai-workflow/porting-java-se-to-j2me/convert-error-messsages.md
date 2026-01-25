# Convert error messages code

## Context

- [JsonMessages.java](../../src/j2mePort/org/glassfish/json/JsonMessages.java)

## Conversation with AI / 2025.01.25

🗣️ Hi, DeepSeek! I'm porting the library to j2me.

Here's an example of how it should be done. The code

```java
    static String TOKENIZER_UNEXPECTED_CHAR(int unexpected, JsonLocation location) {
      return localize("tokenizer.unexpected.char", unexpected, location);
    }
```

was replaced with

```java
    static String TOKENIZER_UNEXPECTED_CHAR(int unexpected, JsonLocation location) {
      // return localize("tokenizer.unexpected.char", unexpected, location);
      return("tokenizer.unexpected.char: unexpected=" + unexpected + "location=" + location);
    }
```

Please process the following lines of code in a similar manner:

```
// . . . . .
```

Try and write only the resulting code.

## Result checking and fixing

✅ No errors