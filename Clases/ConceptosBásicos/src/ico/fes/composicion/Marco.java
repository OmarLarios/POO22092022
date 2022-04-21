/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

/**
 *
 * @author omarl
 */
public class Marco {
    private String llanta;
    private String material;

    public Marco() {
    }

    public Marco(String llanta, String material) {
        this.llanta = llanta;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLlanta() {
        return llanta;
    }

    public void setLlanta(String llanta) {
        this.llanta = llanta;
    }

    @Override
    public String toString() {
        return "Marco{" + "llanta=" + llanta + ", material=" + material + '}';
    }
    
    
}
