import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
public class CheckAllRule extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        //获取当前在操作的工程上下文
        Project project = e.getData(PlatformDataKeys.PROJECT);

    }
}