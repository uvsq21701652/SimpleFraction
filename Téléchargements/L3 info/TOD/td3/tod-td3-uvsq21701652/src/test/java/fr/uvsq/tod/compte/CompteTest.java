package fr.uvsq.tod.compte;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompteTest {

  @Test
  
  public void shouldCreateAnAccountWithTheSpecifiedBalance() {
    
    Compte c = new Compte(100);

    assertEquals(100, c.getBalance());

  }

  @Test

  public void somme_initiale_négative(){

    Compte m = new Compte(-100);

    assertEquals(1, m.estNegatif());
    System.out.println("Impossible de creer le compte \n");
  }

  @Test

  public void CREDIT(){

    int montant = 50; 

    Compte comp = new Compte(100);

    comp.getCrediter(montant);


  }

  @Test

  public void DEBIT(){

    int montant =  200;

    Compte compte = new Compte(100);

    if ( montant < compte.getBalance())

      compte.getDebiter(montant);

       else 

           System.out.println("Impossible de debiter \n");

}

 @Test

  public void Virement(){

    int somme = 20;

    Compte compte1 = new Compte(100);

    Compte compte2 = new Compte (100);

    if ( somme < compte1.getBalance())

      compte1.virement(compte2,somme);

      else 
        System.out.println("Impossible de faire de virement \n");

    


  }
}
