package geektrust.shan;


import geektrust.family.Family;
import geektrust.family.Gender;

import static geektrust.family.relations.Relation.COUSIN;
import static geektrust.family.relations.Relation.GRANDDAUGHTER;
import static geektrust.family.relations.Relation.PATERNAL_UNCLE;
import static geektrust.family.relations.Relation.SISTER_IN_LAW;

/**
 * @author Vivek Mittal
 */
public class ShanFamily {

    public static void main(String[] args) {
        final Family shanFamily = new Family(ShanFamily::populate);

        final Family.Member saayan = shanFamily.get("saayan");
        final Family.Member drita = shanFamily.get("drita");
        final Family.Member asva = shanFamily.get("asva");

        System.out.println(SISTER_IN_LAW.to(saayan));
        System.out.println(COUSIN.to(drita));
        System.out.println(PATERNAL_UNCLE.to(drita));
        System.out.println(GRANDDAUGHTER.to(asva));
    }

    private static void populate(Family family) {
        //Members
        Family.Member kingShan = family.addMember("King Shan", Gender.MALE);
        Family.Member queenAnga = family.addMember("Queen Anga", Gender.FEMALE);
        Family.Member ish = family.addMember("ish", Gender.MALE);
        Family.Member chit = family.addMember("chit", Gender.MALE);
        Family.Member ambi = family.addMember("ambi", Gender.FEMALE);
        Family.Member vich = family.addMember("vich", Gender.MALE);
        Family.Member lika = family.addMember("lika", Gender.FEMALE);
        Family.Member satya = family.addMember("satya", Gender.FEMALE);
        Family.Member vyan = family.addMember("vyan", Gender.MALE);
        Family.Member drita = family.addMember("drita", Gender.MALE);
        Family.Member jaya = family.addMember("jaya", Gender.FEMALE);
        Family.Member vrita = family.addMember("vrita", Gender.MALE);
        Family.Member vila = family.addMember("vila", Gender.MALE);
        Family.Member jinki = family.addMember("jinki", Gender.FEMALE);
        Family.Member chika = family.addMember("chika", Gender.FEMALE);
        Family.Member kpila = family.addMember("kpila", Gender.MALE);
        Family.Member satvi = family.addMember("satvi", Gender.FEMALE);
        Family.Member asva = family.addMember("asva", Gender.MALE);
        Family.Member savya = family.addMember("savya", Gender.MALE);
        Family.Member krpi = family.addMember("krpi", Gender.FEMALE);
        Family.Member saayan = family.addMember("saayan", Gender.MALE);
        Family.Member mina = family.addMember("mina", Gender.FEMALE);
        Family.Member jata = family.addMember("jata", Gender.MALE);
        Family.Member driya = family.addMember("driya", Gender.FEMALE);
        Family.Member mnu = family.addMember("mnu", Gender.MALE);
        Family.Member lavnya = family.addMember("lavnya", Gender.FEMALE);
        Family.Member gru = family.addMember("gru", Gender.MALE);
        Family.Member kriya = family.addMember("kriya", Gender.MALE);
        Family.Member misa = family.addMember("misa", Gender.MALE);

        //Relationships
        kingShan.isSpouseOf(queenAnga);
        kingShan.isParentOf(ish);
        queenAnga.isParentOf(ish);
        kingShan.isParentOf(chit);
        queenAnga.isParentOf(chit);
        kingShan.isParentOf(vich);
        queenAnga.isParentOf(vich);
        kingShan.isParentOf(satya);
        queenAnga.isParentOf(satya);

        chit.isSpouseOf(ambi);
        chit.isParentOf(drita);
        ambi.isParentOf(drita);
        chit.isParentOf(vrita);
        ambi.isParentOf(vrita);

        vich.isSpouseOf(lika);
        vich.isParentOf(vila);
        lika.isParentOf(vila);
        vich.isParentOf(chika);
        lika.isParentOf(chika);

        satya.isSpouseOf(vyan);
        satya.isParentOf(satvi);
        vyan.isParentOf(satvi);
        satya.isParentOf(savya);
        vyan.isParentOf(savya);
        satya.isParentOf(saayan);
        vyan.isParentOf(saayan);

        jaya.isSpouseOf(drita);
        jaya.isParentOf(jata);
        drita.isParentOf(jata);
        jaya.isParentOf(driya);
        drita.isParentOf(driya);

        vila.isSpouseOf(jinki);
        vila.isParentOf(lavnya);
        jinki.isParentOf(lavnya);

        chika.isSpouseOf(kpila);
        satvi.isSpouseOf(asva);

        savya.isSpouseOf(krpi);
        savya.isParentOf(kriya);
        krpi.isParentOf(kriya);

        saayan.isSpouseOf(mina);
        saayan.isParentOf(misa);
        mina.isParentOf(misa);

        driya.isSpouseOf(mnu);
        lavnya.isSpouseOf(gru);
    }
}
