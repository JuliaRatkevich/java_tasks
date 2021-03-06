package com.julia;

public class ServerDescription {
    private String id;
    private Integer port;
    private Integer workload;

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    public String getId() {
        return id;
    }

    public Integer getPort() {
        return port;
    }

    public Integer getWorkload() {
        return workload;
    }

    public ServerDescription(String id, Integer port) {
        this.id = id;
        this.port = port;
        this.workload = 0;
    }
}
