package pojo;

import java.io.Serializable;

public class Goods implements Serializable {
    private Long gid;

    private String name;

    private Long gprice;

    private Long oid;

    private static final long serialVersionUID = 1L;

    public Goods(Long gid, String name, Long gprice, Long oid) {
        this.gid = gid;
        this.name = name;
        this.gprice = gprice;
        this.oid = oid;
    }

    public Goods() {
        super();
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getGprice() {
        return gprice;
    }

    public void setGprice(Long gprice) {
        this.gprice = gprice;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }
}