import models.NameGenerator;

import javax.swing.*;

public class Runner {

    public static void main(String[] args) {

        JFrame frame = new JFrame( "Name Generator" );
        JLabel label = new JLabel("Generate a random name: " + NameGenerator.printName(), JLabel.CENTER );
        frame.add(label);
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }

}
