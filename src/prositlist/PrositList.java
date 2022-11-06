/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositlist;

/**
 *
 * @author Trunks
 */
public class PrositList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Etudiant E1 = new Etudiant(3,"yahch", "WW");
        Etudiant E2 = new Etudiant(1,"achui", "xx");
        Etudiant E3 = new Etudiant(2,"zachi", "uu");
        PrositListMain Esprit = new PrositListMain();
        Esprit.ajouterEtudiant(E1);
        Esprit.ajouterEtudiant(E2);
        Esprit.ajouterEtudiant(E3);
        System.out.println("Sans Tri");
        Esprit.displayEtudiants();
        System.out.println("Tri par Id");
        Esprit.trierEtudiantsParId();
        Esprit.displayEtudiants();
        System.out.println("Tri par nom");
        Esprit.trierEtudiantsParNom();
        Esprit.displayEtudiants();
    }
    
}
