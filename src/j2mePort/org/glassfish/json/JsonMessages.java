/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013-2017 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://oss.oracle.com/licenses/CDDL+GPL-1.1
 * or LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package j2mePort.org.glassfish.json;


import j2mePort.javax.json.stream.JsonLocation;
import j2mePort.javax.json.stream.JsonParser;
//import java.text.MessageFormat;
//import java.util.ResourceBundle;
// import javax.json.JsonObject;
import j2mePort.javax.json.JsonValue;

/**
 * Defines string formatting method for each constant in the resource file
 *
 * @author Jitendra Kotamraju
 */
final class JsonMessages {
//    private static final ResourceBundle BUNDLE =
//            ResourceBundle.getBundle("org.glassfish.json.messages");

    // global/shared messages
    static String INTERNAL_ERROR() {
//        return localize("internal.error");
        return "internal.error";
    }

    // tokenizer messages
    static String TOKENIZER_UNEXPECTED_CHAR(int unexpected, JsonLocation location) {
//        return localize("tokenizer.unexpected.char", unexpected, location);
        return("tokenizer.unexpected.char: unexpected=" + unexpected + "location=" + location);
    }

    static String TOKENIZER_EXPECTED_CHAR(int unexpected, JsonLocation location, char expected) {
        // return localize("tokenizer.expected.char", unexpected, location, expected);
        return "tokenizer.expected.char: unexpected=" + unexpected + ", location=" + location + ", expected=" + expected;
    }

    static String TOKENIZER_IO_ERR() {
        // return localize("tokenizer.io.err");
        return "tokenizer.io.err";
    }


    // parser messages
    static String PARSER_GETSTRING_ERR(JsonParser.Event event) {
        // return localize("parser.getString.err", event);
        return "parser.getString.err: event=" + event;
    }

    static String PARSER_ISINTEGRALNUMBER_ERR(JsonParser.Event event) {
        // return localize("parser.isIntegralNumber.err", event);
        return "parser.isIntegralNumber.err: event=" + event;
    }

    static String PARSER_GETINT_ERR(JsonParser.Event event) {
        // return localize("parser.getInt.err", event);
        return "parser.getInt.err: event=" + event;
    }

    static String PARSER_GETLONG_ERR(JsonParser.Event event) {
        // return localize("parser.getLong.err", event);
        return "parser.getLong.err: event=" + event;
    }

    static String PARSER_GETBIGDECIMAL_ERR(JsonParser.Event event) {
        // return localize("parser.getBigDecimal.err", event);
        return "parser.getBigDecimal.err: event=" + event;
    }

    static String PARSER_GETARRAY_ERR(JsonParser.Event event) {
        // return localize("parser.getArray.err", event);
        return "parser.getArray.err: event=" + event;
    }

    static String PARSER_GETOBJECT_ERR(JsonParser.Event event) {
        // return localize("parser.getObject.err", event);
        return "parser.getObject.err: event=" + event;
    }

    static String PARSER_GETVALUE_ERR(JsonParser.Event event) {
        // return localize("parser.getValue.err", event);
        return "parser.getValue.err: event=" + event;
    }

    static String PARSER_GETVALUESTREAM_ERR() {
        // return localize("parser.getValueStream.err");
        return "parser.getValueStream.err";
    }

    static String PARSER_EXPECTED_EOF(JsonTokenizer.JsonToken token) {
        // return localize("parser.expected.eof", token);
        return "parser.expected.eof: token=" + token;
    }

    static String PARSER_TOKENIZER_CLOSE_IO() {
        // return localize("parser.tokenizer.close.io");
        return "parser.tokenizer.close.io";
    }

    static String PARSER_INVALID_TOKEN(JsonTokenizer.JsonToken token, JsonLocation location, String expectedTokens) {
        // return localize("parser.invalid.token", token, location, expectedTokens);
        return "parser.invalid.token: token=" + token + ", location=" + location + ", expectedTokens=" + expectedTokens;
    }

    static String PARSER_STATE_ERR(JsonValue.ValueType type) {
        // return localize("parser.state.err", type);
        return "parser.state.err: type=" + type;
    }

    static String PARSER_SCOPE_ERR(JsonValue value) {
        // return localize("parser.scope.err", value);
        return "parser.scope.err: value=" + value;
    }

    static String PARSER_INPUT_ENC_DETECT_FAILED() {
        // return localize("parser.input.enc.detect.failed");
        return "parser.input.enc.detect.failed";
    }

    static String PARSER_INPUT_ENC_DETECT_IOERR() {
        // return localize("parser.input.enc.detect.ioerr");
        return "parser.input.enc.detect.ioerr";
    }

    // generator messages
    static String GENERATOR_FLUSH_IO_ERR() {
        // return localize("generator.flush.io.err");
        return "generator.flush.io.err";
    }

    static String GENERATOR_CLOSE_IO_ERR() {
        // return localize("generator.close.io.err");
        return "generator.close.io.err";
    }

    static String GENERATOR_WRITE_IO_ERR() {
        // return localize("generator.write.io.err");
        return "generator.write.io.err";
    }

    static String GENERATOR_ILLEGAL_METHOD(Object scope) {
        // return localize("generator.illegal.method", scope);
        return "generator.illegal.method: scope=" + scope;
    }

    static String GENERATOR_DOUBLE_INFINITE_NAN() {
        // return localize("generator.double.infinite.nan");
        return "generator.double.infinite.nan";
    }

    static String GENERATOR_INCOMPLETE_JSON() {
        // return localize("generator.incomplete.json");
        return "generator.incomplete.json";
    }

    static String GENERATOR_ILLEGAL_MULTIPLE_TEXT() {
        // return localize("generator.illegal.multiple.text");
        return "generator.illegal.multiple.text";
    }



    // writer messages
    static String WRITER_WRITE_ALREADY_CALLED() {
        // return localize("writer.write.already.called");
        return "writer.write.already.called";
    }

    // reader messages
    static String READER_READ_ALREADY_CALLED() {
        // return localize("reader.read.already.called");
        return "reader.read.already.called";
    }


    // obj builder messages
    static String OBJBUILDER_NAME_NULL() {
        // return localize("objbuilder.name.null");
        return "objbuilder.name.null";
    }

    static String OBJBUILDER_VALUE_NULL() {
        // return localize("objbuilder.value.null");
        return "objbuilder.value.null";
    }

    static String OBJBUILDER_OBJECT_BUILDER_NULL() {
        // return localize("objbuilder.object.builder.null");
        return "objbuilder.object.builder.null";
    }

    static String OBJBUILDER_ARRAY_BUILDER_NULL() {
        // return localize("objbuilder.array.builder.null");
        return "objbuilder.array.builder.null";
    }


    // array builder messages
    static String ARRBUILDER_VALUE_NULL() {
        // return localize("arrbuilder.value.null");
        return "arrbuilder.value.null";
    }

    static String ARRBUILDER_OBJECT_BUILDER_NULL() {
        // return localize("arrbuilder.object.builder.null");
        return "arrbuilder.object.builder.null";
    }

    static String ARRBUILDER_ARRAY_BUILDER_NULL() {
        // return localize("arrbuilder.array.builder.null");
        return "arrbuilder.array.builder.null";
    }

    static String ARRBUILDER_VALUELIST_NULL(int index, int size) {
        // return localize("arrbuilder.valuelist.null", index, size);
        return "arrbuilder.valuelist.null: index=" + index + ", size=" + size;
    }

    // json pointer messages
    static String POINTER_FORMAT_INVALID() {
        // return localize("pointer.format.invalid");
        return "pointer.format.invalid";
    }

    // static String POINTER_MAPPING_MISSING(JsonObject object, String key) {
    //     return localize("pointer.mapping.missing", object, key);
    // }

    static String POINTER_REFERENCE_INVALID(JsonValue.ValueType type) {
        // return localize("pointer.reference.invalid", type.name());
//        return "pointer.reference.invalid: type=" + type.name();

        return "pointer.reference.invalid: type=" + type.toString();
    }

    static String POINTER_ARRAY_INDEX_ERR(String token) {
        // return localize("pointer.array.index.err", token);
        return "pointer.array.index.err: token=" + token;
    }

    static String POINTER_ARRAY_INDEX_ILLEGAL(String token) {
        // return localize("pointer.array.index.illegal", token);
        return "pointer.array.index.illegal: token=" + token;
    }

    // nodereference messages
    static String NODEREF_VALUE_ADD_ERR() {
        // return localize("noderef.value.add.err");
        return "noderef.value.add.err";
    }

    static String NODEREF_VALUE_CANNOT_REMOVE() {
        // return localize("noderef.value.cannot.remove");
        return "noderef.value.cannot.remove";
    }

    static String NODEREF_OBJECT_MISSING(String key) {
        // return localize("noderef.object.missing", key);
        return "noderef.object.missing: key=" + key;
    }

    static String NODEREF_ARRAY_INDEX_ERR(int index, int size) {
        // return localize("noderef.array.index.err", index, size);
        return "noderef.array.index.err: index=" + index + ", size=" + size;
    }

    // json patch messages
    static String PATCH_MUST_BE_ARRAY() {
        // return localize("patch.must.be.array");
        return "patch.must.be.array";
    }

    static String PATCH_MOVE_PROPER_PREFIX(String from, String path) {
        // return localize("patch.move.proper.prefix", from, path);
        return "patch.move.proper.prefix: from=" + from + ", path=" + path;
    }

    static String PATCH_MOVE_TARGET_NULL(String from) {
        // return localize("patch.move.target.null", from);
        return "patch.move.target.null: from=" + from;
    }

    static String PATCH_TEST_FAILED(String path, String value) {
        // return localize("patch.test.failed", path, value);
        return "patch.test.failed: path=" + path + ", value=" + value;
    }

    static String PATCH_ILLEGAL_OPERATION(String operation) {
        // return localize("patch.illegal.operation", operation);
        return "patch.illegal.operation: operation=" + operation;
    }

    static String PATCH_MEMBER_MISSING(String operation, String member) {
        // return localize("patch.member.missing", operation, member);
        return "patch.member.missing: operation=" + operation + ", member=" + member;
    }


//    private static String localize(String key, Object ... args) {
//        try {
//            String msg = BUNDLE.getString(key);
//            return MessageFormat.format(msg, args);
//        } catch (Exception e) {
//            return getDefaultMessage(key, args);
//        }
//    }

//    private static String getDefaultMessage(String key, Object ... args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[failed to localize] ");
//        sb.append(key);
//        if (args != null) {
//            sb.append('(');
//            for (int i = 0; i < args.length; ++i) {
//                if (i != 0)
//                    sb.append(", ");
//                sb.append(String.valueOf(args[i]));
//            }
//            sb.append(')');
//        }
//        return sb.toString();
//    }

}
