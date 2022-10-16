package top.dzurl.chrome.capture.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CaptureTaskModel extends TaskModel {

    //是否完整截图
    private boolean full = true;

}
