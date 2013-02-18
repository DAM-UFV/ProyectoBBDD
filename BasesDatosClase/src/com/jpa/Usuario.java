package com.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Usuario implements Serializable {
	
 // @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id private int dni;
  private String nombre_usuario;
  private String contrasena;
  private String mail;
  
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public String getNombre_usuario() {
	return nombre_usuario;
}
public void setNombre_usuario(String nombre_usuario) {
	this.nombre_usuario = nombre_usuario;
}
public String getContrasena() {
	return contrasena;
}
public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
@Override
public String toString() {
	return "Usuario [dni=" + dni + ", nombre_usuario=" + nombre_usuario
			+ ", contrasena=" + contrasena + ", mail=" + mail + "]";
}


} 