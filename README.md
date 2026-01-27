# Jsonp J2ME

Humble initiative to port https://github.com/javaee/jsonp to J2ME.

Status: it builds and simple test for small json file works (`testWikiString()`)

## Porting notes

- Trying to understand original code: [JSONP by javaee / d9k-reads-code](https://github.com/d9k/d9k-reads-code/blob/main/java/jsonp.md)
- [Convert enum to static class](./ai-workflow/porting-java-se-to-j2me/convert-enum-to-static-class.md)
- [Convert error messages](./ai-workflow/porting-java-se-to-j2me/convert-error-messsages.md)
- Commenting BigDecimal out
 
- 
`src/j2mePort/java/lang/`: ported from https://github.com/openjdk/jdk/blob/jdk8-b120/jdk/src/share/classes/java/lang
