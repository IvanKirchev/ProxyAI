package ee.carlrobert.codegpt.toolwindow.chat.editor.actions;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Editor;
import ee.carlrobert.codegpt.CodeGPTBundle;
import ee.carlrobert.codegpt.actions.ActionType;
import ee.carlrobert.codegpt.actions.TrackableAction;
import ee.carlrobert.codegpt.completions.ChatCompletionParameters;
import ee.carlrobert.codegpt.util.FeedbackUtil;
import groovy.util.logging.Slf4j;
import org.jetbrains.annotations.NotNull;

@Slf4j
public class LikeAction extends TrackableAction {
  private final @NotNull Editor toolwindowEditor;

  public LikeAction(@NotNull Editor toolwindowEditor) {
    super(
        CodeGPTBundle.get("shared.likeResponseCode"),
        CodeGPTBundle.get("shared.likeResponseDescription"),
        AllIcons.Ide.Like,
        ActionType.LIKE_RESPONSE);
    this.toolwindowEditor = toolwindowEditor;
  }

  @Override
  public void handleAction(@NotNull AnActionEvent e) {
  }

  public static void likeResponse(ChatCompletionParameters params) {
    FeedbackUtil.likeResponse(params);
  }
}
