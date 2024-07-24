package org.flexe.hospital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import  jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.relational.core.mapping.Table;
import  jakarta.persistence.FetchType;
import  jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Patient")
public class Patient implements  Serializable  {
@Id
@UuidGenerator
private UUID id;
private String name;
private  Date birthday;
private  boolean isSick ;
private  String email;
private  String phone;

@OneToOne
private  Address address;
@OneToMany(mappedBy ="patient",fetch = FetchType.LAZY)
@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)// when list a patient , don't need to list also her/his meeting or Termin
private Collection<Termin> patientTermin;


}
