package com.company.page73;


/**
 * the program should display bah bah bah bah din din din din
 */

public class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playTopHat ( ) {
        System.out.println( "din din din di-din" );
    }

    void playSnare ( ) {
        System.out.println( "bah bah ba-bah" );
    }

}

class DrumKitTestDrive {
    public static void main ( String[] args ) {
        DrumKit d = new DrumKit();

        d.playSnare();
        d.snare = false;


        if (d.snare == true) {
            d.playSnare( );
        }
        d.playTopHat();
    }


}