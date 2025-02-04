package org.ies.department_store.models;

import org.ies.department_store.models.products.Product;

import java.util.Arrays;
import java.util.Objects;

public class Section {
    private int floor;
    private String managerName;
    private Product[] products;

    public Section(int floor, String managerName, Product[] products) {
        this.floor = floor;
        this.managerName = managerName;
        this.products = products;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return floor == section.floor && Objects.equals(managerName, section.managerName) && Objects.deepEquals(products, section.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, managerName, Arrays.hashCode(products));
    }

    @Override
    public String toString() {
        return "Section{" +
                "floor=" + floor +
                ", managerName='" + managerName + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
