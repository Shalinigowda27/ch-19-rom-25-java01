package com.xwokz.storeapp.app;

public class Application {

    private String applicationName;
    private String updatedOn;
    private String version;
    private long   downloads;
    private String offeredBy;
    private String releasedOn;

    public String getApplicationName() {
        return applicationName;
    }
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }
    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    public String getOfferedBy() {
        return offeredBy;
    }
    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }

    public String getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
        this.releasedOn = releasedOn;
    }
}
