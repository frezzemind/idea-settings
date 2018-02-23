#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("SerializableClassImport.java")
#parse("File Header.java")
public class ${NAME} implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
}