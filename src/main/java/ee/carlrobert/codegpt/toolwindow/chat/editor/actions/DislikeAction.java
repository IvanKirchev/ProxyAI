package ee.carlrobert.codegpt.toolwindow.chat.editor.actions;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Editor;
import ee.carlrobert.codegpt.CodeGPTBundle;
import ee.carlrobert.codegpt.actions.ActionType;
import ee.carlrobert.codegpt.actions.TrackableAction;
import ee.carlrobert.codegpt.completions.ChatCompletionParameters;
import ee.carlrobert.codegpt.util.FeedbackUtil;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

public class DislikeAction extends TrackableAction {
  private static final Logger log = Logger.getLogger(DislikeAction.class.getName());
  private final @NotNull Editor toolwindowEditor;

  public DislikeAction(@NotNull Editor toolwindowEditor) {
    super(
        CodeGPTBundle.get("shared.dislikeResponseCode"),
        CodeGPTBundle.get("shared.dislikeResponseDescription"),
        AllIcons.Ide.Like,
        ActionType.DISLIKE_RESPONSE);
    this.toolwindowEditor = toolwindowEditor;
  }

  @Override
  public void handleAction(@NotNull AnActionEvent e) {

  }

  public static void dislikeResponse(ChatCompletionParameters params) {
    FeedbackUtil.dislikeResponse(params);
  }
}
