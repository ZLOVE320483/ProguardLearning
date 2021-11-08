package com.zlove.study.plugin.common;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/5.
 * PS: Not easy to write code, please indicate.
 */
public abstract class BaseExtension {
    private boolean enable = true;
    private boolean enableInDebug;
    private boolean needPreVerify;
    private boolean needVerify;
    private boolean shouldSaveCache = true;
    private String logDir;
    private String logFile;

    public void enable(boolean enable) {
        this.enable = enable;
    }

    public boolean isEnable() {
        return enable;
    }

    public void enableInDebug(boolean enable) {
        this.enableInDebug = enable;
    }

    public boolean isEnableInDebug() {
        return enableInDebug;
    }

    public void logDir(String dir) {
        this.logDir = dir;
    }

    public String getLogDir() {
        return logDir == null || logDir.isEmpty() ? getName() : logDir;
    }

    public void logFile(String file) {
        this.logFile = file;
    }

    public String getLogFile() {
        return logFile == null || logFile.isEmpty() ? getName() + "_log.txt" : logFile;
    }

    public boolean isNeedPreVerify() {
        return needPreVerify;
    }

    public void setNeedPreVerify(boolean needPreVerify) {
        this.needPreVerify = needPreVerify;
    }

    public boolean isNeedVerify() {
        return needVerify;
    }

    public void setNeedVerify(boolean needVerify) {
        this.needVerify = needVerify;
    }

    public boolean isShouldSaveCache() {
        return shouldSaveCache;
    }

    public void setShouldSaveCache(boolean shouldSaveCache) {
        this.shouldSaveCache = shouldSaveCache;
    }

    abstract public String getName();
}
