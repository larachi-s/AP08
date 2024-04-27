package com.ap08.AP08;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wilaya {
	
	
    private long id;
    private boolean actif;
    private long compteCreation ;
    private long compteMaj;
    private java.sql.Timestamp dateCreation;
    private java.sql.Timestamp dateMaj;
    private String nomArabe;
    private String nomLatin;
    private String nomTamazight;
	
	  
	 
}
