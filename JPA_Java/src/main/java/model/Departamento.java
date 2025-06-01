package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the departamento database table.
 * 
 */
@Entity
@NamedQuery(name="Departamento.findAll", query="SELECT d FROM Departamento d")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_Departamento;

	private int capacidad;

	private String descripción;

	private String disponibilidad;

	@Lob
	private byte[] imagen_Habitacion;

	private String nombre;

	private int número_Habitaciones;

	private BigDecimal precio_Por_Noche;

	private String servicios_Incluidos;

	public Departamento() {
	}

	public int getID_Departamento() {
		return this.ID_Departamento;
	}

	public void setID_Departamento(int ID_Departamento) {
		this.ID_Departamento = ID_Departamento;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getDescripción() {
		return this.descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public String getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public byte[] getImagen_Habitacion() {
		return this.imagen_Habitacion;
	}

	public void setImagen_Habitacion(byte[] imagen_Habitacion) {
		this.imagen_Habitacion = imagen_Habitacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNúmero_Habitaciones() {
		return this.número_Habitaciones;
	}

	public void setNúmero_Habitaciones(int número_Habitaciones) {
		this.número_Habitaciones = número_Habitaciones;
	}

	public BigDecimal getPrecio_Por_Noche() {
		return this.precio_Por_Noche;
	}

	public void setPrecio_Por_Noche(BigDecimal precio_Por_Noche) {
		this.precio_Por_Noche = precio_Por_Noche;
	}

	public String getServicios_Incluidos() {
		return this.servicios_Incluidos;
	}

	public void setServicios_Incluidos(String servicios_Incluidos) {
		this.servicios_Incluidos = servicios_Incluidos;
	}

}