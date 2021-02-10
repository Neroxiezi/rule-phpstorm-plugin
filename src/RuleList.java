
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import data.DataCenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RuleList {
    private JPanel jcontent;
    private JTable rule;
    public RuleList(Project project, @NotNull ToolWindow toolWindow) {
        DataCenter dataCenter;
        dataCenter = new DataCenter(project);
        rule.setModel(dataCenter.TABLE_MODEL);
        toolWindow.show(getRunnable());
    }

    @Nullable
    private Runnable getRunnable() {
        return null;
    }

    public JPanel getConnect() {
        return jcontent;
    }
}
