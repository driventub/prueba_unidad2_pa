package uce.edu.prueba2_pa.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
    @Column(name = "paci_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paci_id_seq")
    @SequenceGenerator(name = "paci_id_seq", sequenceName = "paci_id_seq", allocationSize = 1)
	private Integer id;

    @Column(name = "paci_cedula")
    private String cedula;

    @Column(name = "paci_nombre")
    private String nombre;

    @Column(name = "paci_apellido")
    private String apellido;

    @Column(name = "paci_fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "paci_codigo_iess")
    private String codigoIESS;

    @Column(name = "paci_estatura")
    private BigDecimal estatura;

    @Column(name = "paci_peso")
    private BigDecimal peso;

    @Column(name = "paci_genero")
    private String genero;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<CitaMedica> lCitas;

    // Get y Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigoIESS() {
        return codigoIESS;
    }

    public void setCodigoIESS(String codigoIESS) {
        this.codigoIESS = codigoIESS;
    }

    public BigDecimal getEstatura() {
        return estatura;
    }

    public void setEstatura(BigDecimal estatura) {
        this.estatura = estatura;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<CitaMedica> getlCitas() {
        return lCitas;
    }

    public void setlCitas(List<CitaMedica> lCitas) {
        this.lCitas = lCitas;
    }

    

    
}
