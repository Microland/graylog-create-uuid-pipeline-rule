# CreateUUIDFunction Plugin for Graylog

**Required Graylog version:** 2.0 and later

Installation
------------

[Download the plugin](https://github.com/Microland/graylog-create-uuid-pipeline-rule/releases)
and place the `.jar` file in your Graylog plugin directory. The plugin directory
is the `plugins/` folder relative from your `graylog-server` directory by default
and can be configured in your `graylog.conf` file.

Restart `graylog-server` and you are done.

Usage
-----

Generates a uuid for the indexed data


Getting started
---------------

This project is using Maven 3 and requires Java 8 or higher.

* Clone this repository.
* Run `mvn package` to build a JAR file.
* Optional: Run `mvn jdeb:jdeb` and `mvn rpm:rpm` to create a DEB and RPM package respectively.
* Copy generated JAR file in target directory to your Graylog plugin directory.
* Restart the Graylog.

Example
--------

```
rule "create_uuid"
when
    has_field("somefield")
then
    let m = create_uuid("");
    set_field("uuid", m);
end
```