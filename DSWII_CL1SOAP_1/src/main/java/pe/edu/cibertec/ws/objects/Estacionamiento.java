//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.02 a las 01:09:32 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domiciliows", propOrder = {
    "iddomicilio",
    "descdomicilio",
    "nrodomicilio",
    "refdomicilio"
})
public class Estacionamiento{

    protected int iddomicilio;
    @XmlElement(required = true)
    protected String descdomicilio;
    protected int nrodomicilio;
    @XmlElement(required = true)
    protected String refdomicilio;

    /**
     * Obtiene el valor de la propiedad iddomicilio.
     * 
     */
    public int getIddomicilio() {
        return iddomicilio;
    }

    /**
     * Define el valor de la propiedad iddomicilio.
     * 
     */
    public void setIddomicilio(int value) {
        this.iddomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad descdomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescdomicilio() {
        return descdomicilio;
    }

    /**
     * Define el valor de la propiedad descdomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescdomicilio(String value) {
        this.descdomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad nrodomicilio.
     * 
     */
    public int getNrodomicilio() {
        return nrodomicilio;
    }

    /**
     * Define el valor de la propiedad nrodomicilio.
     * 
     */
    public void setNrodomicilio(int value) {
        this.nrodomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad refdomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefdomicilio() {
        return refdomicilio;
    }

    /**
     * Define el valor de la propiedad refdomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefdomicilio(String value) {
        this.refdomicilio = value;
    }

}
