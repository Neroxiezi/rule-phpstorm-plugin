import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import data.DataCenter;

import javax.swing.*;

public class RuleListWin {
    private JPanel contentPanel;
    private JTable tbContent;
    private void init() {
        tbContent.setModel(DataCenter.TABLE_MODEL);
    }
    public RuleListWin(Project project, ToolWindow toolWindow) {
        init();
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}
