package data;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.List;

public class DataCenter {
    public static List<RuleData> RULE_LIST = new LinkedList<>();
    public static String[] HEAD = {"title", "Note"};
    public static DefaultTableModel TABLE_MODEL = new DefaultTableModel(null, HEAD);
    public DataCenter(){
        RuleData ruleData = new RuleData("手机","aac");
        DataCenter.RULE_LIST.add(ruleData);
        DataCenter.TABLE_MODEL.addRow(DataConvert.convert(ruleData));
    }
}
