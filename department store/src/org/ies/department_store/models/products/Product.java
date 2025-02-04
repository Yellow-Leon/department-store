package org.ies.department_store.models.products;

import java.util.Objects;

public abstract class Product {
    protected String productId;
    protected double price;
    protected int units;

    public Product(String productId, double price, int units) {
        this.productId = productId;
        this.price = price;
        this.units = units;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && units == product.units && Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, price, units);
    }

}