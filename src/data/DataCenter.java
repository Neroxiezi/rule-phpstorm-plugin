package data;

import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import javax.swing.table.DefaultTableModel;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DataCenter {
    public static String FILE_NAME;
    public static String[] HEAD = {"标识", "规则",};
    public static List<Map<String,Object>> RULE_LIST = new ArrayList<>();
    public DefaultTableModel TABLE_MODEL = new DefaultTableModel(null, HEAD);
    public DataCenter(@NotNull Project project){
        System.out.printf();
    }
}


