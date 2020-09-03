package pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Orders implements Serializable {
    private Long oid;

    private Long uid;

    private Timestamp time;

    private Double totalMoney;

    private Long amount;

    private String address;

    private String phone;

    private static final long serialVersionUID = 1L;

    public Orders(Long oid, Long uid, Timestamp time, Double totalMoney, Long amount, String address, String phone) {
        this.oid = oid;
        this.uid = uid;
        this.time = time;
        this.totalMoney = totalMoney;
        this.amount = amount;
        this.address = address;
        this.phone = phone;
    }

    public Orders() {
        super();
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}