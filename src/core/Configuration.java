public class Configuration {

    private String version;
    private String db;
    private String confVersion;

    public String getConfVersion() {
        return confVersion;
    }

    public void setConfVersion(String confVersion) {
        this.confVersion = confVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "version='" + version + '\'' +
                ", db='" + db + '\'' +
                ", confVersion='" + confVersion + '\'' +
                '}';
    }
}
