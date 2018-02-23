#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    
    private ${NAME}() {
        throw new UnsupportedOperationException("${NAME}.class can not be construct to a instance");
    }
}
