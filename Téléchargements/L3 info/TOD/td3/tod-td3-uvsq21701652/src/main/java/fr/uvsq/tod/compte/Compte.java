package fr.uvsq.tod.compte;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * La classe <code>Compte</code> représente un compte bancaire.
 *
 * @author hal
 * @version 2020
 */
public class Compte {

	private int initialBalance;
	private int crediter;
	private int debiter;
    private int virement;

 


  public Compte(int initialBalance) {

    this.initialBalance =  initialBalance ;

  }


  public int getBalance() {

    return initialBalance;
  }

  public int estNegatif(){

    if (initialBalance < 0 ) 

      return 1 ;

      else 

        return 0;
  }

  public int getCrediter(int crediter){

    initialBalance += crediter;

    return initialBalance;

  }

  public int getDebiter(int debiter){

    initialBalance -= debiter;

    return initialBalance;
  }

  public void virement( Compte a, int somme)
  
  {
    a.getCrediter(somme);
    getDebiter(somme);
  }


  private static final Logger logger = LogManager.getLogger(Compte.class);
  public static void main(String [] args) {

    Compte c = new Compte(100);
    logger.info(c.getBalance());


    Compte m = new Compte(-100);
    logger.info("Impossible de creer le compte \n");


    int a = 50;
    Compte comp = new Compte(100);
    comp.getCrediter(a);


    int b =  200;
    Compte compte = new Compte(100);
    if ( b < compte.getBalance())
      compte.getDebiter(b);
    else
      logger.info("Impossible de debiter \n");


  }


}
