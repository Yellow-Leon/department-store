package org.ies.department_store.models.products;

import java.util.Objects;

public class Electronics extends Product{
    private String type;
    private String modelName;
    private String manufacturer;

    public Electronics(String productId, double price, int units, String type, String modelName, String manufacturer) {
        super(productId, price, units);
        this.type = type;
        this.modelName = modelName;
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Electronics that = (Electronics) o;
        return Objects.equals(type, that.type) && Objects.equals(modelName, that.modelName) && Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, modelName, manufacturer);
    }

    @Override
    public String toString() {
        return "electronics{" +
                "type='" + type + '\'' +
                ", modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                ", units=" + units +
                '}';
    }
}
