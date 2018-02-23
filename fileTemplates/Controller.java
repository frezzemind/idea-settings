#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("ControllerImport.java")
#parse("File Header.java")
@Controller
@RequestMapping(value = "")
public class ${NAME} {
}