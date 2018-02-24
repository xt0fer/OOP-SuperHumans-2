package Superpowers;
//not sure how to get this working yet
public interface Abilities {

        String weakness();

        String weapon();

        String catchPhrase();

        String nemisis();

        String mainAttack();

        boolean canFly();

        boolean bulletProof();

        boolean breathInSpace();

        class Thor implements Abilities {

                @Override
                public String weakness() {
                        return "None";
                }

                @Override
                public String weapon() {
                        return "Mjolnir";
                }

                @Override
                public String catchPhrase() {
                        return "Odin's beard!";
                }

                @Override
                public String nemisis() {
                        return "His Sister - Hela";
                }

                @Override
                public String mainAttack() {
                        return "Lightning";
                }

                @Override
                public boolean canFly() {
                        return true;
                }

                @Override
                public boolean bulletProof() {
                        return true;
                }

                @Override
                public boolean breathInSpace() {
                        return true;
                }
        }
}
        // The compiler will now require that methods
        // changeCadence, changeGear, speedUp, and applyBrakes
        // all be implemented. Compilation will fail if those
        // methods are missing from this class.
