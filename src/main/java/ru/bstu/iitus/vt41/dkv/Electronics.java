package ru.bstu.iitus.vt41.dkv;

public abstract class Electronics extends Product {
    protected String model;
    protected String serialNumber;

    public String getModel() {
        return model;
    }
    public boolean equalsSerialNumber(String _serialNumber) {
        return serialNumber.equals(_serialNumber);
    }
}
