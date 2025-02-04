package org.ies.department_store.models;

public class DepartmentStore {
    private String name;
    private String address;
    private Section[] electronicSection;
    private Section[] clothesSection;

    public DepartmentStore(String name, String address, Section[] electronicSection, Section[] clothesSection) {
        this.name = name;
        this.address = address;
        this.electronicSection = electronicSection;
        this.clothesSection = clothesSection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Section[] getElectronicSection() {
        return electronicSection;
    }

    public void setElectronicSection(Section[] electronicSection) {
        this.electronicSection = electronicSection;
    }

    public Section[] getClothesSection() {
        return clothesSection;
    }

    public void setClothesSection(Section[] clothesSection) {
        this.clothesSection = clothesSection;
    }
}