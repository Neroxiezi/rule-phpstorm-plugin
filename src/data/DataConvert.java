package data;

public class DataConvert {
    public static String[] convert(RuleData ruleData) {
        String[] raw = new String[2];
        raw[0] = ruleData.getTitle();
        raw[1] = ruleData.getContent();
        return raw;
    }
}
