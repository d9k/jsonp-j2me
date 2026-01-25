# Convert enum to static class

## Preface

- [Java ME: transform basic JDK 1.5 "enum" object into Java ME CLDC-1.1/IMP-NG (JDK 1.4) - Stack Overflow](https://stackoverflow.com/questions/31070607/java-me-transform-basic-jdk-1-5-enum-object-into-java-me-cldc-1-1-imp-ng-jdk)
    - [Create enumerated constants in Java | JavaWorld](https://web.archive.org/web/20170113023243/http://www.javaworld.com/article/2076970/core-java/create-enumerated-constants-in-java.html)

## Conversation with AI / 2025.01.24


> 🗣️ Hi, DeepSeek! Please write me Regex for IntelliJ IDEA to replace `ARRAY,` with `public static final ValueType ARRAY = new ValueType(1);`;

🤖

Find: `\/\/(\s+)([A-Z_]+),`

Replace: `$1public static final ValueType $2 = new ValueType(1);\n\/\/$1$2,`
