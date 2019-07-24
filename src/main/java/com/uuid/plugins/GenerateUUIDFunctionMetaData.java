package com.uuid.plugins;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

/**
 * Implement the PluginMetaData interface here.
 */
public class GenerateUUIDFunctionMetaData implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "com.uuid.plugins.graylog-plugin-function-generateuuid/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return "com.uuid.plugins.GenerateUUIDFunctionPlugin";
    }

    @Override
    public String getName() {
        return "GenerateUUIDFunction";
    }

    @Override
    public String getAuthor() {
        return "Debasish Misra <debasishmisra3008@gmail.com>";
    }

    @Override
    public URI getURL() {
        return URI.create("https://github.com/Microland/graylog-create-uuid-pipeline-rule.git");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(1, 0, 0, "unknown"));
    }

    @Override
    public String getDescription() {
        // TODO Insert correct plugin description
        return "Description of GenerateUUIDFunction plugin";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(3, 1, 0, "unknown"));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
