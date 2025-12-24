package config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@AllArgsConstructor
@RefreshScope
public class BuildInfoController {

    @Value("${build.id:default}")
    private String buildId;

    @Value("${build.name:default}")
    private String buildName;

    @Value("${build.version:default}")
    private String buildVersion;

    private BuildInfo buildInfo;

    @GetMapping("/build-info")
    public String getBuildId() {
        return "Build Id: " + buildInfo.getId() + ", Build Name: " + buildInfo.getName() + ", Build Version: " + buildInfo.getVersion();
    }
}
